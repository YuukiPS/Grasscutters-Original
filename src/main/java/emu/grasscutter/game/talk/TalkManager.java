package emu.grasscutter.game.talk;

import static emu.grasscutter.game.quest.enums.QuestCond.QUEST_COND_COMPLETE_TALK;
import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_COMPLETE_ANY_TALK;
import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_COMPLETE_TALK;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.binout.MainQuestData.TalkData;
import emu.grasscutter.game.player.BasePlayerManager;
import emu.grasscutter.game.player.Player;
import lombok.NonNull;

public final class TalkManager extends BasePlayerManager {
    public TalkManager(@NonNull Player player) {
        super(player);
    }

    /**
     * Invoked when a talk is triggered.
     *
     * @param talkId The ID of the talk.
     */
    public void triggerTalkAction(int talkId) {
        var talkData = GameData.getTalkConfigDataMap().get(talkId);
        if (talkData == null) return;

        var player = this.getPlayer();
        // Execute the talk action on associated handlers.
        talkData
                .getFinishExec()
                .forEach(
                        e ->
                                this.getPlayer().getServer().getTalkSystem().triggerExec(getPlayer(), talkData, e));

        // Invoke the talking events for quests.
        var questManager = player.getQuestManager();
        questManager.queueEvent(QUEST_CONTENT_COMPLETE_ANY_TALK, talkId);
        questManager.queueEvent(QUEST_CONTENT_COMPLETE_TALK, talkId);
        questManager.queueEvent(QUEST_COND_COMPLETE_TALK, talkId);

        // Save the talk value to the quest's data.
        this.saveTalkToQuest(talkId, talkData.getQuestId());
    }

    public void saveTalkToQuest(int talkId, int mainQuestId) {
        // TODO, problem with this is that some talks for activity also have
        // quest id, which isn't present in QuestExcels
        var mainQuest = this.getPlayer().getQuestManager().getMainQuestById(mainQuestId);
        if (mainQuest == null) return;

        mainQuest.getTalks().put(talkId, new TalkData(talkId, ""));
    }
}
