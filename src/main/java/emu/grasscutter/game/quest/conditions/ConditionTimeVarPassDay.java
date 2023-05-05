package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.QuestValueCond;
import emu.grasscutter.game.quest.enums.QuestCond;
import lombok.val;

@QuestValueCond(QuestCond.QUEST_COND_TIME_VAR_PASS_DAY)
public class ConditionTimeVarPassDay extends BaseCondition {
    @Override
    public boolean execute(
            Player owner,
            QuestData questData,
            QuestData.QuestAcceptCondition condition,
            String paramStr,
            int... params) {
        val mainQuestId = condition.getParam()[0];
        val timeVarIndex = condition.getParam()[1];
        val minDays = condition.getParam()[2];

        val mainQuest = owner.getQuestManager().getMainQuestById(mainQuestId);

        if (mainQuest == null) {
            return false;
        }

        val daysSinceTimeVar = mainQuest.getDaysSinceTimeVar(timeVarIndex);
        if (daysSinceTimeVar == -1) {
            return false;
        }

        return daysSinceTimeVar >= minDays;
    }
}
