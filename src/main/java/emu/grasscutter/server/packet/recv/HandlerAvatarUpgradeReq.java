package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.AvatarUpgradeReq)
public class HandlerAvatarUpgradeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarUpgradeReq req = AvatarUpgradeReq.parseFrom(payload);

        // Changed in 5.0:
        // Players can now pass multiple different kinds of books in at once.
        // These are bundled into a list of items.
        for (var item : req.getItemParamListList()) {
            session
                .getServer()
                .getInventorySystem()
                .upgradeAvatar(session.getPlayer(), req.getAvatarGuid(), item.getItemId(), item.getCount());
        }
    }
}
