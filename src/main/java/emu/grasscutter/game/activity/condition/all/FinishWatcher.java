package emu.grasscutter.game.activity.condition.all;

import emu.grasscutter.game.activity.ActivityConfigItem;
import emu.grasscutter.game.activity.PlayerActivityData;
import emu.grasscutter.game.activity.condition.ActivityCondition;
import emu.grasscutter.game.activity.condition.ActivityConditionBaseHandler;
import emu.grasscutter.game.activity.condition.ActivityConditions;
import lombok.val;

@ActivityCondition(ActivityConditions.NEW_ACTIVITY_COND_FINISH_WATCHER)
public class FinishWatcher extends ActivityConditionBaseHandler {

	@Override
	public boolean execute(PlayerActivityData activityData, ActivityConfigItem activityConfig, int... params) {
		val watcherMap = activityData.getWatcherInfoMap();
		for (int param : params) {
			val watcher = watcherMap.get(param);
			if (watcher == null || !watcher.isFinished()) {
				return false;
			}
		}
		return true;
	}
}
