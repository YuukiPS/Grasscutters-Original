package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.quest.*;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_PLAYER_LEVEL_UP;

@QuestValueContent(QUEST_CONTENT_PLAYER_LEVEL_UP)
public class ContentPlayerLevelUp extends BaseContent {
    @Override
    public boolean execute(
            GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        return quest.getOwner().getLevel() >= condition.getCount();
    }
}
