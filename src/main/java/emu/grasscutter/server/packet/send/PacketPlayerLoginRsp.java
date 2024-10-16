package emu.grasscutter.server.packet.send;

import static emu.grasscutter.config.Configuration.*;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.PlayerLoginRspOuterClass.PlayerLoginRsp;
import emu.grasscutter.net.proto.QueryCurrRegionHttpRspOuterClass;
import emu.grasscutter.net.proto.RegionInfoOuterClass.RegionInfo;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.http.dispatch.RegionHandler;
import emu.grasscutter.utils.Crypto;

public class PacketPlayerLoginRsp extends BasePacket {

    private static QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp regionCache;

    public PacketPlayerLoginRsp(GameSession session) {
        super(PacketOpcodes.PlayerLoginRsp, 1);

        this.setUseDispatchKey(true);

        RegionInfo info;

        if (regionCache == null) {
            // if no cache try fetching region use server game info
            RegionInfo serverRegion =
                    RegionInfo.newBuilder()
                            .setGateserverIp(lr(GAME_INFO.accessAddress, GAME_INFO.bindAddress))
                            .setGateserverPort(lr(GAME_INFO.accessPort, GAME_INFO.bindPort))
                            .build();

            // Check if get Current Region is null
            var tes1 = RegionHandler.getCurrentRegion();
            if (tes1 == null) {
                // jif yes we take it from serverRegion;
                info = serverRegion;
            } else {
                // if there just take it from cache
                info = tes1.getRegionInfo();
            }

            // Update Cache from info
            regionCache =
                    QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp.newBuilder()
                            .setRegionInfo(info)
                            .setClientSecretKey(ByteString.copyFrom(Crypto.DISPATCH_SEED))
                            .build();
        }

        // Fetch from Cache, TODO: null check?
        info = regionCache.getRegionInfo();

        PlayerLoginRsp p =
                PlayerLoginRsp.newBuilder()
                        // .setIsUseAbilityHash(true) // true, Removed in 5.0; we don't know what it is
                        .setAbilityHashCode(1844674) // 1844674
                        .setGameBiz("hk4e_global")
                        .setClientDataVersion(info.getClientDataVersion())
                        .setClientSilenceDataVersion(info.getClientSilenceDataVersion())
                        // .setClientMd5(info.getClientDataMd5()) // Removed in 5.0; we don't know what it is
                        // .setClientSilenceMd5(info.getClientSilenceDataMd5()) // Removed in 5.0; we don't know
                        // what it is
                        .setResVersionConfig(info.getResVersionConfig())
                        .setClientVersionSuffix(info.getClientVersionSuffix())
                        .setClientSilenceVersionSuffix(info.getClientSilenceVersionSuffix())
                        // .setIsScOpen(false) // Unknown for ??.??
                        // .setScInfo(ByteString.copyFrom(new byte[] {})) // Unknown for ??.??
                        // .setRegisterCps("mihoyo") // Unknown for ??.??
                        .setCountryCode("US")
                        .build();

        this.setData(p.toByteArray());
    }
}
