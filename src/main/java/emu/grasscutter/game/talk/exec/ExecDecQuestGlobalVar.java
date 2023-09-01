package emu.grasscutter.game.talk.exec;

import emu.grasscutter.data.excels.TalkConfigData;
import emu.grasscutter.data.excels.TalkConfigData.TalkExecParam;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.talk.*;

@TalkValueExec(TalkExec.TALK_EXEC_DEC_QUEST_GLOBAL_VAR)
public final class ExecDecQuestGlobalVar extends TalkExecHandler {
    @Override
    public void execute(Player player, TalkConfigData talkData, TalkExecParam execParam) {
        if (execParam.getParam().length < 2) return;

        player
                .getQuestManager()
                .decQuestGlobalVarValue(
                        Integer.parseInt(execParam.getParam()[0]), Integer.parseInt(execParam.getParam()[1]));
    }
}
