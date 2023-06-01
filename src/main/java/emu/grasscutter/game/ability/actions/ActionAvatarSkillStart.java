package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.GameEntity;

@AbilityAction(AbilityModifierAction.Type.AvatarSkillStart)
public final class ActionAvatarSkillStart extends AbilityActionHandler {
    @Override
    public boolean execute(
        Ability ability, AbilityModifierAction action,
        ByteString abilityData, GameEntity target
    ) {
        return false;
    }
}
