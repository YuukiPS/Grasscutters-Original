package emu.grasscutter.game.achievement;

import emu.grasscutter.net.proto.AchievementOuterClass.Achievement;
import java.util.Arrays;
import lombok.Getter;

public enum AchievementStatus {
    // TODO : fix obfs
    INVALID(Achievement.Status.STATUS_INVALID_VALUE),
    UNFINISHED(Achievement.Status.STATUS_UNFINISHED_VALUE),
    FINISHED(Achievement.Status.STATUS_FINISHED_VALUE),
    REWARD_TAKEN(Achievement.Status.STATUS_REWARD_TAKEN_VALUE);

    @Getter private final int num;

    AchievementStatus(int num) {
        this.num = num;
    }

    public static AchievementStatus forNumber(int num) {
        return Arrays.stream(values())
                .filter(achievementStatus -> achievementStatus.num == num)
                .findFirst()
                .orElse(INVALID);
    }

    public Achievement.Status toProto() {
        return Achievement.Status.forNumber(this.num);
    }
}
