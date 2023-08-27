package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.quest.*;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_STOP_BARGAIN)
public final class ExecStopBargain extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        // Get the bargain data from the quest parameters.
        var bargainId = Integer.parseInt(condition.getParam()[0]);

        try {
            // Start the bargain.
            quest.getOwner().getQuestManager().stopBargain(bargainId);
            Grasscutter.getLogger().debug("Bargain {} stopped.", bargainId);
            return true;
        } catch (RuntimeException ignored) {
            Grasscutter.getLogger().debug("Bargain {} does not exist.", bargainId);
            return false;
        }
    }
}
