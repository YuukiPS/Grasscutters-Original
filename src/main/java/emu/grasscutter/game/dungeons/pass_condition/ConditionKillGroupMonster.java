package emu.grasscutter.game.dungeons.pass_condition;

import emu.grasscutter.data.excels.dungeon.DungeonPassConfigData;
import emu.grasscutter.game.dungeons.DungeonValue;
import emu.grasscutter.game.dungeons.enums.DungeonPassConditionType;
import emu.grasscutter.game.dungeons.handlers.DungeonBaseHandler;

@DungeonValue(DungeonPassConditionType.DUNGEON_COND_KILL_GROUP_MONSTER)
public class ConditionKillGroupMonster extends DungeonBaseHandler {

	@Override
	public boolean execute(DungeonPassConfigData.DungeonPassCondition condition, int... params) {
		return params[0] == condition.getParam()[0];
	}
}
