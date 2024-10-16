package emu.grasscutter.net.packet;

public class PacketOpcodes {
    // Empty
    public static final int NONE = 0;

    // Opcodes
    public static final int BuyGoodsRsp = 21;
    public static final int GetAuthkeyRsp = 154;
    public static final int PlayerCookReq = 192;
    public static final int HomeAvatarTalkRsp = 213;
    public static final int AvatarWearFlycloakReq = 243;
    public static final int AchievementAllDataNotify = 259;
    public static final int HomeComfortInfoNotify = 279;
    public static final int AvatarFightPropNotify = 287;
    public static final int HomeResourceTakeFetterExpRsp = 299;
    public static final int SetUpAvatarTeamRsp = 306;
    public static final int SkipPlayerGameTimeRsp = 338;
    public static final int HomeUpdateArrangementInfoReq = 344;
    public static final int SceneInitFinishReq = 377;
    public static final int WidgetGadgetDataNotify = 380;
    public static final int CutSceneBeginNotify = 455;
    public static final int ItemGivingRsp = 459;
    public static final int EnterWorldAreaReq = 479;
    public static final int AvatarUpgradeRsp = 512;
    public static final int PlayerCompoundMaterialReq = 530;
    public static final int DungeonChallengeFinishNotify = 753;
    public static final int EnterSceneDoneRsp = 793;
    public static final int GetPlayerFriendListRsp = 893;
    public static final int TakeBattlePassRewardRsp = 941;
    public static final int AvatarDieAnimationEndReq = 943;
    public static final int GivingRecordNotify = 951;
    public static final int SetPlayerSignatureReq = 1006;
    public static final int VehicleStaminaNotify = 1047;
    public static final int TakeCompoundOutputRsp = 1235;
    public static final int ActivityUpdateWatcherNotify = 1303;
    public static final int HomeAvatarRewardEventNotify = 1329;
    public static final int ScenePlayerSoundNotify = 1408;
    public static final int EvtAiSyncCombatThreatInfoNotify = 1442;
    public static final int QuestDestroyNpcReq = 1472;
    public static final int PlayerInvestigationAllInfoNotify = 1519;
    public static final int AvatarUpgradeReq = 1568;
    public static final int PersonalSceneJumpRsp = 1612;
    public static final int GetFriendShowNameCardInfoRsp = 1685;
    public static final int SelectWorktopOptionRsp = 1697;
    public static final int SceneEntityDrownRsp = 1742;
    public static final int GetPlayerSocialDetailRsp = 1771;
    public static final int QuestDelNotify = 1774;
    public static final int GetPlayerAskFriendListReq = 1813;
    public static final int BattlePassCurScheduleUpdateNotify = 1819;
    public static final int GetProfilePictureDataRsp = 1846;
    public static final int SceneEntityUpdateNotify = 1936;
    public static final int EvtDoSkillSuccNotify = 1941;
    public static final int WidgetDoBagReq = 1993;
    public static final int ChangeAvatarRsp = 2046;
    public static final int HostPlayerNotify = 2109;
    public static final int StartCoopPointRsp = 2147;
    public static final int HomeTransferReq = 2203;
    public static final int TowerAllDataReq = 2265;
    public static final int PlayerTimeNotify = 2272;
    public static final int HomeChooseModuleRsp = 2292;
    public static final int QuestTransmitRsp = 2300;
    public static final int QueryPathReq = 2339;
    public static final int QueryPathRsp = 2350;
    public static final int PathfindingEnterSceneReq = 2374;
    public static final int ObstacleModifyNotify = 2384;
    public static final int WorldPlayerReviveReq = 2401;
    public static final int PlayerLoginReq = 2422;
    public static final int HomeLimitedShopBuyGoodsReq = 2451;
    public static final int EvtBulletHitNotify = 2465;
    public static final int UnfreezeGroupLimitNotify = 2540;
    public static final int SceneForceUnlockNotify = 2583;
    public static final int PlatformChangeRouteNotify = 2618;
    public static final int GetAllUnlockNameCardRsp = 2632;
    public static final int StoreItemChangeNotify = 2646;
    public static final int WorldPlayerDieNotify = 2689;
    public static final int TakeFurnitureMakeReq = 2795;
    public static final int WorldChestOpenNotify = 2812;
    public static final int HomeChangeEditModeRsp = 2916;
    public static final int PlatformStartRouteNotify = 2989;
    public static final int StoreWeightLimitNotify = 3034;
    public static final int PlayerEnterDungeonRsp = 3067;
    public static final int GetWorldMpInfoRsp = 3080;
    public static final int DungeonSlipRevivePointActivateRsp = 3113;
    public static final int PlayerQuitFromHomeNotify = 3135;
    public static final int BattlePassMissionUpdateNotify = 3190;
    public static final int WearEquipRsp = 3218;
    public static final int WeaponPromoteReq = 3230;
    public static final int DungeonWayPointNotify = 3239;
    public static final int GetDailyDungeonEntryInfoRsp = 3265;
    public static final int QuestUpdateQuestVarRsp = 3297;
    public static final int QuestListUpdateNotify = 3344;
    public static final int AvatarChangeCostumeRsp = 3408;
    public static final int ChangeAvatarReq = 3470;
    public static final int UnlockTransPointReq = 3518;
    public static final int PlayerEnterSceneNotify = 3595;
    public static final int GetPlayerSocialDetailReq = 3597;
    public static final int HomePreChangeEditModeNotify = 3607;
    public static final int PostEnterSceneReq = 3633;
    public static final int LevelupCityRsp = 3655;
    public static final int FurnitureMakeRsp = 3859;
    public static final int DropHintNotify = 3881;
    public static final int QuestDestroyEntityRsp = 3908;
    public static final int GetPlayerAskFriendListRsp = 3915;
    public static final int BuyResinRsp = 3981;
    public static final int UpdatePlayerShowAvatarListReq = 3998;
    public static final int SceneTransToPointReq = 4027;
    public static final int SeeMonsterReq = 4069;
    public static final int AvatarAddNotify = 4216;
    public static final int AvatarFetterDataNotify = 4274;
    public static final int ResinChangeNotify = 4336;
    public static final int DungeonDieOptionReq = 4398;
    public static final int AvatarSkillChangeNotify = 4410;
    public static final int PlayerGameTimeNotify = 4423;
    public static final int CardProductRewardNotify = 4506;
    public static final int BuyGoodsReq = 4523;
    public static final int HomeChangeBgmReq = 4543;
    public static final int GetCompoundDataRsp = 4557;
    public static final int EnterSceneDoneReq = 4561;
    public static final int DungeonWayPointActivateReq = 4597;
    public static final int GetShopReq = 4619;
    public static final int AvatarLifeStateChangeNotify = 4653;
    public static final int PlayerApplyEnterMpReq = 4701;
    public static final int HomeSaveArrangementNoChangeRsp = 4742;
    public static final int AbilityInvocationsNotify = 4844;
    public static final int ReliquaryDecomposeReq = 4929;
    public static final int AvatarSatiationDataNotify = 4982;
    public static final int GetAllUnlockNameCardReq = 5009;
    public static final int PlatformStopRouteNotify = 5044;
    public static final int PlayerApplyEnterMpNotify = 5245;
    public static final int CombatInvocationsNotify = 5253;
    public static final int SetEntityClientDataNotify = 5306;
    public static final int HomeSceneJumpReq = 5317;
    public static final int PlayerInvestigationTargetNotify = 5321;
    public static final int DoSetPlayerBornDataNotify = 5351;
    public static final int AvatarChangeCostumeNotify = 5367;
    public static final int AskAddFriendNotify = 5432;
    public static final int GetWidgetSlotRsp = 5441;
    public static final int ClientAIStateNotify = 5471;
    public static final int McoinExchangeHcoinReq = 5528;
    public static final int GetInvestigationMonsterReq = 5610;
    public static final int GetShopRsp = 5665;
    public static final int QueryCodexMonsterBeKilledNumReq = 5718;
    public static final int SetEquipLockStateReq = 5750;
    public static final int ExecuteGadgetLuaReq = 5759;
    public static final int HomeModuleSeenRsp = 5790;
    public static final int EvtAvatarLockChairRsp = 5831;
    public static final int CompoundDataNotify = 5964;
    public static final int HomeAvatarRewardEventGetRsp = 5969;
    public static final int PingReq = 5983;
    public static final int ChooseCurAvatarTeamRsp = 5985;
    public static final int GetPlayerTokenReq = 6013;
    public static final int ToTheMoonEnterSceneReq = 6116;
    public static final int ToTheMoonQueryPathRsp = 6148;
    public static final int TakeBattlePassMissionPointReq = 6231;
    public static final int SceneEntityAppearNotify = 6263;
    public static final int UpdateAbilityCreatedMovingPlatformNotify = 6274;
    public static final int ClientLoadingCostumeVerificationNotify = 6382;
    public static final int PrivateChatNotify = 6396;
    public static final int GetPlayerBlacklistReq = 6441;
    public static final int DungeonEntryInfoReq = 6446;
    public static final int SceneEntityDrownReq = 6447;
    public static final int UnlockAvatarTalentReq = 6454;
    public static final int ClientAbilitiesInitFinishCombineNotify = 6545;
    public static final int TakeFurnitureMakeRsp = 6584;
    public static final int EntityFightPropUpdateNotify = 6590;
    public static final int PlayerCookArgsReq = 6593;
    public static final int MonsterAlertChangeNotify = 6613;
    public static final int CalcWeaponUpgradeReturnItemsRsp = 6706;
    public static final int GetWorldMpInfoReq = 6731;
    public static final int AvatarEquipChangeNotify = 6767;
    public static final int AvatarGainFlycloakNotify = 6824;
    public static final int PlayerInvestigationNotify = 6848;
    public static final int ServerCondMeetQuestListUpdateNotify = 6971;
    public static final int PullRecentChatReq = 6977;
    public static final int HomeAvatarCostumeChangeNotify = 7004;
    public static final int WearEquipReq = 7023;
    public static final int SetWidgetSlotRsp = 7049;
    public static final int EntityFightPropChangeReasonNotify = 7107;
    public static final int TowerCurLevelRecordChangeNotify = 7108;
    public static final int MusicGameSettleReq = 7153;
    public static final int EvtEntityRenderersChangedNotify = 7358;
    public static final int DelBackupAvatarTeamRsp = 7408;
    public static final int AvatarFetterLevelRewardReq = 7455;
    public static final int ScenePlayerInfoNotify = 7477;
    public static final int EnterWorldAreaRsp = 7481;
    public static final int WindSeedType1Notify = 7486;
    public static final int UpdatePlayerShowNameCardListReq = 7487;
    public static final int TakeoffEquipRsp = 7489;
    public static final int ChangeTeamNameRsp = 7491;
    public static final int PlayerEnterDungeonReq = 7557;
    public static final int HomeAvatarRewardEventGetReq = 7571;
    public static final int GetAllMailNotify = 7646;
    public static final int AddBackupAvatarTeamRsp = 7660;
    public static final int UseItemRsp = 7672;
    public static final int CalcWeaponUpgradeReturnItemsReq = 7713;
    public static final int GetActivityInfoRsp = 7719;
    public static final int GetGachaInfoReq = 7728;
    public static final int AvatarSkillUpgradeRsp = 7799;
    public static final int PlayerStoreNotify = 7845;
    public static final int EnterSceneReadyRsp = 7914;
    public static final int SetOpenStateRsp = 7944;
    public static final int PlayerDataNotify = 7961;
    public static final int DungeonSettleNotify = 8007;
    public static final int UpdatePlayerShowNameCardListRsp = 8022;
    public static final int PlayerWorldSceneInfoListNotify = 8028;
    public static final int PlayerSetPauseReq = 8076;
    public static final int GetSceneAreaReq = 8189;
    public static final int GetMailItemReq = 8354;
    public static final int LevelupCityReq = 8394;
    public static final int DelMailReq = 8496;
    public static final int TakeInvestigationTargetRewardReq = 8556;
    public static final int EvtAvatarExitFocusNotify = 8696;
    public static final int WorldOwnerBlossomBriefInfoNotify = 8720;
    public static final int DelBackupAvatarTeamReq = 8721;
    public static final int AvatarPromoteRsp = 8787;
    public static final int PlayerApplyEnterMpResultNotify = 8810;
    public static final int QuestCreateEntityRsp = 8838;
    public static final int HomeChooseModuleReq = 8855;
    public static final int PullPrivateChatReq = 8925;
    public static final int EvtAvatarLockChairReq = 8990;
    public static final int GetOnlinePlayerListRsp = 9049;
    public static final int GetGachaInfoRsp = 9090;
    public static final int SetPlayerBirthdayRsp = 9150;
    public static final int WidgetDoBagRsp = 9170;
    public static final int QuickUseWidgetReq = 9223;
    public static final int HomeGetBasicInfoReq = 9267;
    public static final int SetPlayerNameReq = 9269;
    public static final int HomeAvatarAllFinishRewardNotify = 9322;
    public static final int GetWidgetSlotReq = 9388;
    public static final int ChangeGameTimeReq = 9437;
    public static final int MarkMapReq = 9550;
    public static final int TakePlayerLevelRewardReq = 9556;
    public static final int StoreItemDelNotify = 9567;
    public static final int UseItemReq = 9576;
    public static final int ForgeFormulaDataNotify = 9617;
    public static final int EnterScenePeerNotify = 9626;
    public static final int HomeGetArrangementInfoRsp = 9688;
    public static final int GetMailItemRsp = 9691;
    public static final int EnterTransPointRegionNotify = 9692;
    public static final int GetActivityInfoReq = 9710;
    public static final int CombineFormulaDataNotify = 9746;
    public static final int UnionCmdNotify = 9762;
    public static final int HomeEnterEditModeFinishReq = 9796;
    public static final int CreateVehicleReq = 9915;
    public static final int ShowCommonTipsNotify = 20003;
    public static final int ForgeDataNotify = 20023;
    public static final int SceneAvatarStaminaStepReq = 20036;
    public static final int AddQuestContentProgressReq = 20088;
    public static final int SetNameCardReq = 20106;
    public static final int ReliquaryUpgradeRsp = 20217;
    public static final int UnlockNameCardNotify = 20229;
    public static final int PlayerHomeCompInfoNotify = 20264;
    public static final int AvatarFightPropUpdateNotify = 20328;
    public static final int GetMapAreaReq = 20412;
    public static final int WeaponAwakenReq = 20421;
    public static final int EnterSceneReadyReq = 20524;
    public static final int SetUpLunchBoxWidgetRsp = 20533;
    public static final int HitTreeNotify = 20542;
    public static final int GetAllMailResultNotify = 20649;
    public static final int UpdatePlayerShowAvatarListRsp = 20659;
    public static final int AvatarDieAnimationEndRsp = 20675;
    public static final int SetFriendEnterHomeOptionReq = 20740;
    public static final int WidgetCoolDownNotify = 20751;
    public static final int AntiAddictNotify = 20752;
    public static final int GetFriendShowAvatarInfoReq = 20766;
    public static final int HomeBasicInfoNotify = 20840;
    public static final int HomeAvatarTalkFinishInfoNotify = 20880;
    public static final int WeaponUpgradeReq = 20908;
    public static final int DoGachaRsp = 20937;
    public static final int EnterTrialAvatarActivityDungeonReq = 20982;
    public static final int ServerBuffChangeNotify = 21009;
    public static final int McoinExchangeHcoinRsp = 21052;
    public static final int AvatarPropNotify = 21114;
    public static final int EvtCreateGadgetNotify = 21187;
    public static final int PlayerApplyEnterHomeResultRsp = 21189;
    public static final int GadgetStateNotify = 21201;
    public static final int PlayerChatReq = 21209;
    public static final int GetInvestigationMonsterRsp = 21253;
    public static final int AvatarChangeElementTypeReq = 21263;
    public static final int GetShopmallDataReq = 21348;
    public static final int SceneAreaWeatherNotify = 21395;
    public static final int MarkMapRsp = 21436;
    public static final int GadgetAutoPickDropInfoNotify = 21438;
    public static final int MonsterSummonTagNotify = 21455;
    public static final int TowerTeamSelectReq = 21495;
    public static final int FurnitureCurModuleArrangeCountNotify = 21517;
    public static final int SetPlayerHeadImageReq = 21526;
    public static final int DestroyMaterialRsp = 21531;
    public static final int CombineReq = 21559;
    public static final int SetPlayerHeadImageRsp = 21563;
    public static final int SceneAudioNotify = 21580;
    public static final int GetPlayerFriendListReq = 21607;
    public static final int ReliquaryDecomposeRsp = 21659;
    public static final int AbilityChangeNotify = 21684;
    public static final int TakePlayerLevelRewardRsp = 21700;
    public static final int TowerEnterLevelRsp = 21726;
    public static final int AvatarFetterLevelRewardRsp = 21750;
    public static final int TryEnterHomeRsp = 21829;
    public static final int QuestCreateEntityReq = 21882;
    public static final int DealAddFriendReq = 21886;
    public static final int ScenePointUnlockNotify = 21959;
    public static final int AvatarPromoteReq = 21972;
    public static final int HomeAvatarTalkReq = 21992;
    public static final int SetBattlePassViewedRsp = 22048;
    public static final int DoGachaReq = 22082;
    public static final int PlayerApplyEnterHomeResultNotify = 22086;
    public static final int WorldPlayerReviveRsp = 22159;
    public static final int AllWidgetDataNotify = 22193;
    public static final int WorldPlayerLocationNotify = 22207;
    public static final int WorldPlayerRTTNotify = 22234;
    public static final int GetMapAreaRsp = 22235;
    public static final int SetUpAvatarTeamReq = 22244;
    public static final int HomeAllUnlockedBgmIdListNotify = 22324;
    public static final int HomeResourceNotify = 22351;
    public static final int HomeMarkPointNotify = 22396;
    public static final int HomeChangeEditModeReq = 22458;
    public static final int ItemGivingReq = 22468;
    public static final int GetProfilePictureDataReq = 22511;
    public static final int ReadPrivateChatReq = 22577;
    public static final int CreateVehicleRsp = 22592;
    public static final int PingRsp = 22595;
    public static final int AvatarTeamAllDataNotify = 22603;
    public static final int EvtAvatarSitDownNotify = 22638;
    public static final int AddQuestContentProgressRsp = 22640;
    public static final int WeaponUpgradeRsp = 22661;
    public static final int OtherPlayerEnterHomeNotify = 22683;
    public static final int SetWidgetSlotReq = 22701;
    public static final int PostEnterSceneRsp = 22743;
    public static final int TowerEnterLevelReq = 22746;
    public static final int GetFurnitureCurModuleArrangeCountReq = 22795;
    public static final int PlayerCompoundMaterialRsp = 22858;
    public static final int HomeResourceTakeHomeCoinRsp = 22879;
    public static final int AvatarExpeditionDataNotify = 22907;
    public static final int MonsterAIConfigHashNotify = 22925;
    public static final int TowerAllDataRsp = 22979;
    public static final int HomeAvatarSummonAllEventNotify = 22990;
    public static final int WorldPlayerInfoNotify = 23024;
    public static final int SceneDataNotify = 23046;
    public static final int SelectWorktopOptionReq = 23125;
    public static final int TowerLevelStarCondNotify = 23130;
    public static final int UnlockAvatarTalentRsp = 23185;
    public static final int TakeBattlePassMissionPointRsp = 23201;
    public static final int DungeonPlayerDieReq = 23261;
    public static final int GachaWishRsp = 23268;
    public static final int QuestListNotify = 23350;
    public static final int PlayerPreEnterMpNotify = 23352;
    public static final int SetPlayerPropReq = 23363;
    public static final int AvatarDataNotify = 23378;
    public static final int AddBackupAvatarTeamReq = 23418;
    public static final int GetScenePointReq = 23449;
    public static final int UnlockTransPointRsp = 23546;
    public static final int ReadMailNotify = 23556;
    public static final int AskAddFriendReq = 23646;
    public static final int GetPlayerHomeCompInfoReq = 23660;
    public static final int PlayerApplyEnterMpResultReq = 23674;
    public static final int EntityAiSyncNotify = 23720;
    public static final int BackMyWorldRsp = 23771;
    public static final int GetPlayerBlacklistRsp = 23797;
    public static final int QuestDestroyNpcRsp = 23800;
    public static final int HomeGetOnlineStatusRsp = 23850;
    public static final int HomeSaveArrangementNoChangeReq = 23858;
    public static final int NpcTalkRsp = 23865;
    public static final int WorldDataNotify = 23950;
    public static final int PlayerCookRsp = 23979;
    public static final int QuestUpdateQuestVarReq = 24014;
    public static final int TakeCompoundOutputReq = 24016;
    public static final int HomeModuleSeenReq = 24019;
    public static final int ReliquaryUpgradeReq = 24032;
    public static final int SetPlayerNameRsp = 24044;
    public static final int UnlockPersonalLineRsp = 24052;
    public static final int WeaponAwakenRsp = 24076;
    public static final int QuestTransmitReq = 24079;
    public static final int TakeoffEquipReq = 24083;
    public static final int SetPlayerSignatureRsp = 24101;
    public static final int SceneTransToPointRsp = 24104;
    public static final int GetPlayerTokenRsp = 24174;
    public static final int NpcTalkReq = 24255;
    public static final int SetOpenStateReq = 24291;
    public static final int PrivateChatReq = 24426;
    public static final int SceneInitFinishRsp = 24671;
    public static final int WidgetSlotChangeNotify = 24715;
    public static final int PlayerApplyEnterMpRsp = 24897;
    public static final int HomeGetArrangementInfoReq = 24996;
    public static final int PlayerSetPauseRsp = 25030;
    public static final int AvatarSkillUpgradeReq = 25062;
    public static final int AskAddFriendRsp = 25067;
    public static final int ChapterStateNotify = 25075;
    public static final int FurnitureMakeReq = 25118;
    public static final int ServerAnnounceNotify = 25165;
    public static final int GetShopmallDataRsp = 25192;
    public static final int CoopDataNotify = 25237;
    public static final int ChallengeDataNotify = 25295;
    public static final int AvatarSkillInfoNotify = 25299;
    public static final int AvatarSkillDepotChangeNotify = 25309;
    public static final int TowerFloorRecordChangeNotify = 25333;
    public static final int PlayerPropChangeReasonNotify = 25374;
    public static final int WeaponPromoteRsp = 25392;
    public static final int MonsterForceAlertNotify = 25405;
    public static final int GachaWishReq = 25407;
    public static final int SceneAreaUnlockNotify = 25419;
    public static final int PlayerQuitDungeonReq = 25440;
    public static final int SetPlayerBornDataReq = 25726;
    public static final int PersonalSceneJumpReq = 25750;
    public static final int ServerGlobalValueChangeNotify = 25816;
    public static final int PlayerChatNotify = 25824;
    public static final int HomeUpdateArrangementInfoRsp = 25852;
    public static final int VehicleInteractReq = 25867;
    public static final int GetCompoundDataReq = 25870;
    public static final int FinishedParentQuestNotify = 25902;
    public static final int QuestDestroyEntityReq = 25911;
    public static final int AvatarGainCostumeNotify = 25978;
    public static final int PlayerPropNotify = 25998;
    public static final int GadgetInteractReq = 26009;
    public static final int EvtDestroyGadgetNotify = 26080;
    public static final int DelMailRsp = 26121;
    public static final int TakeInvestigationTargetRewardRsp = 26160;
    public static final int AchievementUpdateNotify = 26226;
    public static final int PlayerForceExitReq = 26372;
    public static final int SetPlayerBornDataRsp = 26454;
    public static final int QuestGlobalVarNotify = 26464;
    public static final int SetBattlePassViewedReq = 26483;
    public static final int GetDailyDungeonEntryInfoReq = 26515;
    public static final int HomeLimitedShopBuyGoodsRsp = 26572;
    public static final int ItemAddHintNotify = 26599;
    public static final int SetEquipLockStateRsp = 26633;
    public static final int BlossomBriefInfoNotify = 26657;
    public static final int OpenStateChangeNotify = 26658;
    public static final int PlayerEnterSceneInfoNotify = 26700;
    public static final int PullRecentChatRsp = 26725;
    public static final int SetPlayerBirthdayReq = 26726;
    public static final int DungeonRestartReq = 26792;
    public static final int SyncScenePlayTeamEntityNotify = 26946;
    public static final int PlayerQuitDungeonRsp = 27043;
    public static final int GetOnlinePlayerListReq = 27044;
    public static final int DungeonEntryInfoRsp = 27112;
    public static final int SetNameCardRsp = 27175;
    public static final int GetRegionSearchReq = 27191;
    public static final int SceneKickPlayerReq = 27213;
    public static final int GetFriendShowAvatarInfoRsp = 27251;
    public static final int ForgeGetQueueDataRsp = 27281;
    public static final int GetSceneAreaRsp = 27301;
    public static final int CodexDataUpdateNotify = 27330;
    public static final int ClientAbilityChangeNotify = 27339;
    public static final int SceneForceLockNotify = 27356;
    public static final int PlayerApplyEnterMpResultRsp = 27380;
    public static final int QueryCodexMonsterBeKilledNumRsp = 27403;
    public static final int VehicleInteractRsp = 27433;
    public static final int StartCoopPointReq = 27436;
    public static final int HomeModuleUnlockNotify = 27507;
    public static final int ExitTransPointRegionNotify = 27579;
    public static final int BattlePassAllDataNotify = 27624;
    public static final int AvatarDelNotify = 27625;
    public static final int HomeAvatarSummonEventReq = 27629;
    public static final int AvatarWearFlycloakRsp = 27660;
    public static final int CookDataNotify = 27676;
    public static final int MailChangeNotify = 27744;
    public static final int PlayerLoginRsp = 27771;
    public static final int PlayerPropChangeNotify = 27937;
    public static final int DestroyMaterialReq = 28057;
    public static final int AddNoGachaAvatarCardNotify = 28082;
    public static final int SetUpLunchBoxWidgetReq = 28094;
    public static final int EvtAiSyncSkillCdNotify = 28128;
    public static final int GadgetInteractRsp = 28160;
    public static final int ForgeQueueDataNotify = 28170;
    public static final int AvatarChangeCostumeReq = 28185;
    public static final int ShowClientGuideNotify = 28187;
    public static final int ChangeMpTeamAvatarRsp = 28252;
    public static final int GetAuthkeyReq = 28308;
    public static final int QuestProgressUpdateNotify = 28348;
    public static final int DungeonWayPointActivateRsp = 28349;
    public static final int FinishedParentQuestUpdateNotify = 28362;
    public static final int ActivityScheduleInfoNotify = 28401;
    public static final int PersonalLineAllDataReq = 28403;
    public static final int ClientAbilityInitFinishNotify = 28413;
    public static final int HomeEnterEditModeFinishRsp = 28448;
    public static final int AvatarSkillMaxChargeCountNotify = 28497;
    public static final int ProudSkillExtraLevelNotify = 28513;
    public static final int PersonalLineAllDataRsp = 28577;
    public static final int WorktopOptionNotify = 28583;
    public static final int EvtAvatarStandUpNotify = 28594;
    public static final int DungeonChallengeBeginNotify = 28604;
    public static final int ServerTimeNotify = 28606;
    public static final int HomeSceneJumpRsp = 28622;
    public static final int EvtAvatarUpdateFocusNotify = 28630;
    public static final int AvatarFlycloakChangeNotify = 28644;
    public static final int DungeonDieOptionRsp = 28706;
    public static final int ChangeMpTeamAvatarReq = 28747;
    public static final int AvatarTeamUpdateNotify = 28759;
    public static final int AvatarUnlockTalentNotify = 28793;
    public static final int DungeonPlayerDieNotify = 28876;
    public static final int EvtAvatarEnterFocusNotify = 29042;
    public static final int OpenStateUpdateNotify = 29093;
    public static final int SceneTeamUpdateNotify = 29107;
    public static final int ClientScriptEventNotify = 29125;
    public static final int SceneEntityDisappearNotify = 29127;
    public static final int PlayerGetForceQuitBanInfoRsp = 29159;
    public static final int PullPrivateChatRsp = 29160;
    public static final int SceneTimeNotify = 29187;
    public static final int SyncTeamEntityNotify = 29231;
    public static final int ProudSkillChangeNotify = 29262;
    public static final int DealAddFriendRsp = 29289;
    public static final int LifeStateChangeNotify = 29321;
    public static final int GetScenePointRsp = 29349;
    public static final int TryEnterHomeReq = 29384;
    public static final int SkipPlayerGameTimeReq = 29432;
    public static final int HomeChangeBgmNotify = 29481;
    public static final int PlayerGetForceQuitBanInfoReq = 29558;
    public static final int QuestUpdateQuestVarNotify = 29565;
    public static final int ActivityInfoNotify = 29575;
    public static final int CombineRsp = 29627;
    public static final int ChooseCurAvatarTeamReq = 29682;
    public static final int ChangeGameTimeRsp = 29694;
    public static final int ScenePlayerLocationNotify = 29696;
    public static final int MassiveEntityElementOpBatchNotify = 29700;
    public static final int TakeBattlePassRewardReq = 29828;
    public static final int ChangeMailStarNotify = 29855;
    public static final int ChangeTeamNameReq = 29880;
    public static final int DungeonSlipRevivePointActivateReq = 29939;
    public static final int QuickUseWidgetRsp = 29966;
    public static final int ForgeStartReq = 29987;
    public static final int GetRecentMpPlayerListReq = 50001;
    public static final int DungeonEntryToBeExploreNotify = 50002;
    public static final int GetDungeonEntryExploreConditionReq = 50003;
    public static final int GetDungeonEntryExploreConditionRsp = 50004;
    public static final int PlayerEnterMapLayerNotify = 50005;
    public static final int ActivityTakeWatcherRewardReq = 50006;
    public static final int ActivityTakeWatcherRewardRsp = 50007;
    public static final int AvatarChangeElementTypeRsp = 50008;
    public static final int AvatarExpeditionAllDataReq = 50009;
    public static final int AvatarExpeditionAllDataRsp = 50010;
    public static final int AvatarExpeditionCallBackReq = 50011;
    public static final int AvatarExpeditionCallBackRsp = 50012;
    public static final int AvatarExpeditionGetRewardReq = 50013;
    public static final int AvatarExpeditionGetRewardRsp = 50014;
    public static final int AvatarExpeditionStartReq = 50015;
    public static final int AvatarExpeditionStartRsp = 50016;
    public static final int PlayerEnterChildMapLayerNotify = 50017;
    public static final int BackMyWorldReq = 50018;
    public static final int BargainOfferPriceReq = 50019;
    public static final int BargainOfferPriceRsp = 50020;
    public static final int BargainStartNotify = 50021;
    public static final int BargainTerminateNotify = 50022;
    public static final int BatchBuyGoodsReq = 50023;
    public static final int BatchBuyGoodsRsp = 50024;
    public static final int BeginCameraSceneLookNotify = 50025;
    public static final int BuyBattlePassLevelReq = 50026;
    public static final int BuyBattlePassLevelRsp = 50027;
    public static final int BuyResinReq = 50028;
    public static final int SceneEntityMoveNotify = 50029;
    public static final int CanUseSkillNotify = 50030;
    public static final int CancelCoopTaskReq = 50031;
    public static final int CheckUgcStateReq = 50032;
    public static final int CheckUgcStateRsp = 50033;
    public static final int CheckUgcUpdateReq = 50034;
    public static final int CheckUgcUpdateRsp = 50035;
    public static final int ClientLockGameTimeNotify = 50036;
    public static final int CloseCommonTipsNotify = 50037;
    public static final int CodexDataFullNotify = 50038;
    public static final int CombineDataNotify = 50039;
    public static final int CookRecipeDataNotify = 50040;
    public static final int DailyTaskDataNotify = 50041;
    public static final int DailyTaskFilterCityReq = 50042;
    public static final int DailyTaskFilterCityRsp = 50043;
    public static final int DailyTaskProgressNotify = 50044;
    public static final int DailyTaskUnlockedCitiesNotify = 50045;
    public static final int DelTeamEntityNotify = 50046;
    public static final int DeleteFriendNotify = 50047;
    public static final int DeleteFriendReq = 50048;
    public static final int DeleteFriendRsp = 50049;
    public static final int DungeonCandidateTeamChangeAvatarReq = 50050;
    public static final int DungeonCandidateTeamChangeAvatarRsp = 50051;
    public static final int DungeonPlayerDieRsp = 50052;
    public static final int DungeonRestartRsp = 50053;
    public static final int DungeonShowReminderNotify = 50054;
    public static final int EndCameraSceneLookNotify = 50055;
    public static final int EnterTrialAvatarActivityDungeonRsp = 50056;
    public static final int EntityAiKillSelfNotify = 50057;
    public static final int EvtBulletDeactiveNotify = 50058;
    public static final int EvtBulletMoveNotify = 50059;
    public static final int ExecuteGadgetLuaRsp = 50060;
    public static final int FireworksLaunchDataNotify = 50061;
    public static final int FireworksReformDataNotify = 50062;
    public static final int FleurFairMusicGameSettleReq = 50063;
    public static final int FleurFairMusicGameSettleRsp = 50064;
    public static final int FleurFairMusicGameStartReq = 50065;
    public static final int FleurFairMusicGameStartRsp = 50066;
    public static final int ForgeGetQueueDataReq = 50067;
    public static final int ForgeQueueManipulateReq = 50068;
    public static final int ForgeQueueManipulateRsp = 50069;
    public static final int ForgeStartRsp = 50070;
    public static final int FurnitureMakeStartReq = 50071;
    public static final int FurnitureMakeStartRsp = 50072;
    public static final int GCGTCTavernChallengeDataNotify = 50073;
    public static final int GetActivityShopSheetInfoReq = 50074;
    public static final int GetActivityShopSheetInfoRsp = 50075;
    public static final int GetAllActivatedBargainDataReq = 50076;
    public static final int GetAllActivatedBargainDataRsp = 50077;
    public static final int GetAllH5ActivityInfoReq = 50078;
    public static final int GetBargainDataReq = 50079;
    public static final int GetBargainDataRsp = 50080;
    public static final int GetChatEmojiCollectionReq = 50081;
    public static final int GetChatEmojiCollectionRsp = 50082;
    public static final int GetFriendShowNameCardInfoReq = 50083;
    public static final int GetHomeLevelUpRewardReq = 50084;
    public static final int GetHomeLevelUpRewardRsp = 50085;
    public static final int GetUgcBriefInfoReq = 50086;
    public static final int GetUgcBriefInfoRsp = 50087;
    public static final int GetUgcReq = 50088;
    public static final int GetUgcRsp = 50089;
    public static final int GroupSuiteNotify = 50090;
    public static final int GroupUnloadNotify = 50091;
    public static final int H5ActivityIdsNotify = 50092;
    public static final int HomeAvatarSummonEventRsp = 50093;
    public static final int HomeAvatarSummonFinishReq = 50094;
    public static final int HomeAvatarSummonFinishRsp = 50095;
    public static final int HomeChangeBgmRsp = 50096;
    public static final int HomeChangeModuleReq = 50097;
    public static final int HomeChangeModuleRsp = 50098;
    public static final int HomeGetOnlineStatusReq = 50099;
    public static final int HomeKickPlayerReq = 50100;
    public static final int HomeKickPlayerRsp = 50101;
    public static final int HomeNewUnlockedBgmIdListNotify = 50102;
    public static final int HomeResourceTakeFetterExpReq = 50103;
    public static final int HomeResourceTakeHomeCoinReq = 50104;
    public static final int HomeSceneInitFinishReq = 50105;
    public static final int HomeSceneInitFinishRsp = 50106;
    public static final int HomeTransferRsp = 50107;
    public static final int LaunchFireworksReq = 50108;
    public static final int LaunchFireworksRsp = 50109;
    public static final int MarkNewNotify = 50110;
    public static final int MuqadasPotionDungeonSettleNotify = 50111;
    public static final int MusicGameSettleRsp = 50112;
    public static final int MusicGameStartReq = 50113;
    public static final int MusicGameStartRsp = 50114;
    public static final int PSPlayerApplyEnterMpReq = 50115;
    public static final int PSPlayerApplyEnterMpRsp = 50116;
    public static final int PathfindingEnterSceneRsp = 50117;
    public static final int PlayerApplyEnterHomeNotify = 50118;
    public static final int PlayerApplyEnterHomeResultReq = 50119;
    public static final int PlayerChatRsp = 50120;
    public static final int PlayerCookArgsRsp = 50121;
    public static final int PlayerLevelRewardUpdateNotify = 50122;
    public static final int ReceivedTrialAvatarActivityRewardReq = 50123;
    public static final int ReceivedTrialAvatarActivityRewardRsp = 50124;
    public static final int ReformFireworksReq = 50125;
    public static final int ReformFireworksRsp = 50126;
    public static final int RobotPushPlayerDataNotify = 50127;
    public static final int RogueDiaryDungeonSettleNotify = 50128;
    public static final int SceneKickPlayerRsp = 50129;
    public static final int ServerAnnounceRevokeNotify = 50130;
    public static final int SetChatEmojiCollectionReq = 50131;
    public static final int SetChatEmojiCollectionRsp = 50132;
    public static final int SetCoopChapterViewedRsp = 50133;
    public static final int SetFriendEnterHomeOptionRsp = 50134;
    public static final int SetPlayerPropRsp = 50135;
    public static final int SpiceActivityGivingRecordNotify = 50136;
    public static final int SumoDungeonSettleNotify = 50137;
    public static final int TakeAchievementGoalRewardReq = 50138;
    public static final int TakeAchievementGoalRewardRsp = 50139;
    public static final int TakeAchievementRewardReq = 50140;
    public static final int TakeAchievementRewardRsp = 50141;
    public static final int TakeInvestigationRewardReq = 50142;
    public static final int TakeInvestigationRewardRsp = 50143;
    public static final int ToTheMoonQueryPathReq = 50144;
    public static final int TowerMiddleLevelChangeTeamNotify = 50145;
    public static final int TowerTeamSelectRsp = 50146;
    public static final int UnlockPersonalLineReq = 50147;
    public static final int UnlockedFurnitureFormulaDataNotify = 50148;
    public static final int UnlockedFurnitureSuiteDataNotify = 50149;
    public static final int WorldOwnerDailyTaskNotify = 50150;

    public static final int GmTalkReq = 25907;
    public static final int GmTalkRsp = 3923;
    public static final int ServerDisconnectClientNotify = 0;
    public static final int PlayerForceExitRsp = 0;
}