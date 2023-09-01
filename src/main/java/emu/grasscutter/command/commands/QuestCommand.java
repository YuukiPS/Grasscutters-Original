package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.*;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameMainQuest;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.enums.QuestState;
import emu.grasscutter.utils.lang.Language;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Command(
    label = "quest",
    aliases = { "q" },
    usage = {
        "(add|finish|running|talking|debug|triggers|grouptriggers) [<questId>]", "dungeons|skip|next|status|restart",
    },
    permission = "player.quest",
    permissionTargeted = "player.quest.others"
)
public final class QuestCommand implements CommandHandler {
    private static final List<String> SINGLE_ARG = List.of("dungeons", "list");

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        /* 
        if (args.size() != 2 || (args.size() == 1 && !args.get(0).toLowerCase().equals("dungeons"))) {
            sendUsageMessage(sender);
            return;
        }
        */

        String cmd = "status";
        String cmd2 = "";
        int questId = 0;
        boolean autofinish = false;
        boolean autostart = false;

        String msg =
            "Currently there are no quest, you can start with /q [main|drum|chasm|semeru|ayaka] or /q add id_quest (find here s.id/QuestPS) and if you have problems like bugs (can't continue) just use /q next for main quest or /q skip for sub quest";

        try {
            cmd2 = args.get(1);
        } catch (Exception e) {
            // skip
        }

        try {
            questId = Integer.parseInt(cmd2);
        } catch (Exception e) {
            // skip
        }

        try {
            cmd = args.get(0);
        } catch (Exception e) {
            // skip
        }

        var mg = targetPlayer.getQuestManager();

        // no quest id
        switch (cmd) {
            case "main" -> {
                cmd = "add";
                questId = 35104;
                autofinish = true;
            }
            case "ayaka" -> {
                cmd = "add";
                questId = 7368803;
                autofinish = true;
            }
            case "chasm" -> {
                cmd = "add";
                questId = 101901;
            }
            case "drum" -> {
                cmd = "add";
                questId = 7268401;
                autofinish = true;
            }
            case "semeru", "s" -> {
                cmd = "add";
                questId = 300011;
                autofinish = false;
                autostart = true;
                CommandHandler.sendMessage(
                    sender,
                    "Quest version 2.8+ requires a manual start every time you add a quest, so make sure you don't forget to type /q start id_quest"
                );
            }
            case "next" -> {
                // Main quest
                if (mg.getActiveMainQuests().size() > 0) {
                    GameMainQuest LastQuests = mg.getActiveMainQuests().get(mg.getActiveMainQuests().size() - 1);
                    LastQuests.finish();
                    CommandHandler.sendMessage(sender, "Main Quest: " + LastQuests.getParentQuestId() + " done...");
                } else {
                    CommandHandler.sendMessage(sender, msg);
                }
                return;
            }
            case "skip" -> {
                // Sub quest
                List<Integer> ids = new ArrayList<>();
                // main
                for (GameMainQuest mainQuest : mg.getMainQuests().values()) {
                    // it's always there
                    if (mainQuest.getParentQuestId() == 303) {
                        continue;
                    }

                    // sub
                    for (GameQuest quest : mainQuest.getChildQuests().values()) {
                        if (quest.getState() != QuestState.QUEST_STATE_FINISHED) {
                            if (!cmd2.isEmpty()) {
                                var idk1 = "";
                                var title1 = Language.getTextMapKey(quest.getQuestData().getDescTextMapHash());
                                if (title1 != null) {
                                    idk1 = title1.get("EN");
                                    if (idk1 != null) {
                                        if (idk1.contains(cmd2)) {
                                            // use last quest sub id
                                            ids.add(quest.getSubQuestId());
                                        }
                                    }
                                }
                            } else {
                                // use last quest sub id
                                ids.add(quest.getSubQuestId());
                            }
                        }
                    }
                }

                // short me
                Collections.sort(ids);

                if (ids.size() > 0) {
                    questId = ids.get(0);
                    cmd = "add";
                    autofinish = true;
                    autostart = true;
                    CommandHandler.sendMessage(sender, "Next Quest Sub " + questId);
                } else {
                    CommandHandler.sendMessage(sender, msg);
                    return;
                }
            }
            case "dungeons" -> {
                var dungeons = targetPlayer.getPlayerProgress().getCompletedDungeons();
                CommandHandler.sendMessage(
                    sender,
                    "Dungeons completed: " + String.join(", ", dungeons.intStream().mapToObj(String::valueOf).toList())
                );
                return;
            }
            case "restart" -> {
                mg.onLogin();
                CommandHandler.sendMessage(sender, "Done Restart....");
                return;
            }
            case "removeall" -> {
                AtomicInteger count = new AtomicInteger();
                mg.forEachQuest(quest -> {
                    // it's always there
                    if (quest.getMainQuestId() == 303) {
                        return;
                    }

                    quest.delete();
                    count.incrementAndGet();
                });
                if (count.intValue() != 0) {
                    CommandHandler.sendMessage(sender, "All Quest Remove: " + count.intValue() + " done");
                    targetPlayer.getSession().getPlayer().kick();
                } else {
                    CommandHandler.sendMessage(sender, msg);
                }
                return;
            }
            case "status" -> {
                AtomicInteger count = new AtomicInteger();
                AtomicInteger count1 = new AtomicInteger();
                mg.forEachQuest(quest -> {
                    // it's always there
                    if (quest.getMainQuestId() == 303) {
                        return;
                    }

                    CommandHandler.sendMessage(
                        sender,
                        "M:" + quest.getMainQuestId() + "/S:" + quest.getSubQuestId() + " = " + quest.getState().name()
                    );

                    if (
                        quest.getState() == QuestState.QUEST_STATE_FINISHED || quest.getState() == QuestState.FINISHED
                    ) {
                        count1.incrementAndGet();
                    } else {
                        count.incrementAndGet();
                    }
                });
                if (count.intValue() != 0) {
                    CommandHandler.sendMessage(
                        sender,
                        "Currently there are " +
                        count.intValue() +
                        " sub quest running and " +
                        count1.intValue() +
                        " already completed"
                    );
                }
                CommandHandler.sendMessage(sender, msg);
                return;
            }
        }

        if (questId == 0) {
            sendUsageMessage(sender);
            return;
        }

        // Quest config
        QuestData questConfig = GameData.getQuestDataMap().get(questId);
        if (questConfig == null) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
            return;
        }

        // Find Quest
        GameQuest quest = mg.getQuestById(questId);
        if (quest == null) {
            if (cmd.equals("add") || cmd.equals("start")) {
                quest = mg.addQuest(questId);
            } else {
                CommandHandler.sendMessage(sender, "This quest is not running yet so please add it");
                return;
            }
        }

        if (quest == null) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
            return;
        }

        // with quest id
        switch (cmd) {
            case "start" -> {
                try {
                    quest.start();
                    try {
                        var title1 = Language.getTextMapKey(quest.getQuestData().getDescTextMapHash());
                        var idk1 = "[N/A 1]";
                        if (title1 != null) {
                            idk1 = title1.get("EN");
                            if (idk1 == null) {
                                idk1 = "?1";
                            }
                        }
                        CommandHandler.sendMessage(sender, "Quest Start (" + questId + "):" + idk1);
                    } catch (Exception e) {
                        CommandHandler.sendMessage(sender, "Quest Start with Title Unknown");
                    }
                } catch (Exception e) {
                    Grasscutter.getLogger().error("Error: ", e);
                }
            }
            case "add" -> {
                if (
                    quest.getState() == QuestState.QUEST_STATE_UNFINISHED ||
                    quest.getState() == QuestState.QUEST_STATE_UNSTARTED
                ) {
                    // finished quest now
                    if (autofinish) {
                        try {
                            quest.finish();
                        } catch (Exception e) {
                            Grasscutter.getLogger().error("Error: ", e);
                        }
                    }

                    // run quest now without trigger and add new quest by increasing quest id number
                    if (autostart) {
                        try {
                            var idnew = questId + 1;
                            QuestData questConfig1 = GameData.getQuestDataMap().get(idnew);
                            if (questConfig1 == null) {
                                CommandHandler.sendMessage(sender, msg);
                                return;
                            } else {
                                // continue new quest if any
                                quest = mg.addQuest(idnew);
                                quest.start();
                                questId = idnew;
                            }
                        } catch (Exception e) {
                            Grasscutter.getLogger().error("Error: ", e);
                        }
                    }

                    try {
                        //getTitleTextMapHash = main q
                        if (quest.getQuestData() != null) {
                            var title1 = Language.getTextMapKey(quest.getQuestData().getDescTextMapHash());
                            //var title2 = Language.getTextMapStrings().get(quest.getQuestData().getStepDescTextMapHash());

                            var idk1 = "[N/A 1]";
                            if (title1 != null) {
                                idk1 = title1.get("EN");
                                if (idk1 == null) {
                                    idk1 = "?1";
                                }
                            }

                            var idk2 = "[N/A 2]";
                            /*
							if (title2 != null) {
								idk2 = title2.get("EN");
								if (idk2 == null) {
									idk2 = "?2";
								}
							}
                            */

                            CommandHandler.sendMessage(sender, "Quest Add (" + questId + "):" + idk1 + " : " + idk2);
                        } else {
                            CommandHandler.sendMessage(sender, "Quest Add with Title Unknown1");
                        }
                    } catch (Exception e) {
                        CommandHandler.sendMessage(sender, "Quest Add with Title Unknown2");
                        Grasscutter.getLogger().error("Error: ", e);
                    }
                } else {
                    CommandHandler.sendMessage(sender, "Quest " + questId + " with " + quest.getState().name());
                }
            }
            case "finish" -> {
                if (
                    quest.getState() == QuestState.QUEST_STATE_UNFINISHED ||
                    quest.getState() == QuestState.QUEST_STATE_UNSTARTED
                ) {
                    quest.finish();
                    CommandHandler.sendMessage(sender, "Quest done");
                } else {
                    CommandHandler.sendMessage(sender, "Quest " + questId + " with " + quest.getState().name());
                }
            }
            case "running" -> {
                CommandHandler.sendMessage(
                    sender,
                    translate(
                        sender,
                        "commands.quest.running",
                        questId,
                        translate(
                            sender,
                            switch (quest.state) {
                                case QUEST_STATE_NONE, NONE -> "commands.quest.state.none";
                                case QUEST_STATE_UNSTARTED, UNSTARTED -> "commands.quest.state.unstarted";
                                case QUEST_STATE_UNFINISHED, UNFINISHED -> "commands.quest.state.unfinished";
                                case QUEST_STATE_FINISHED, FINISHED -> "commands.quest.state.finished";
                                case QUEST_STATE_FAILED, FAILED -> "commands.quest.state.failed";
                            }
                        ),
                        quest.getState().getValue()
                    )
                );
            }
            case "talking" -> {
                var mainQuest = mg.getMainQuestByTalkId(questId);
                if (mainQuest == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.quest.not_found"));
                    return;
                }

                var talk = mainQuest.getTalks().get(questId);
                CommandHandler.sendMessage(
                    sender,
                    translate(
                        sender,
                        "commands.quest.talking",
                        questId,
                        talk == null
                            ? translate(sender, "commands.quest.state.not_exists")
                            : translate(sender, "commands.quest.state.exists"),
                        mainQuest.getParentQuestId(),
                        mainQuest.getState().getValue()
                    )
                );
            }
            case "debug" -> {
                var loggedQuests = mg.getLoggedQuests();
                var shouldAdd = !loggedQuests.contains(questId);

                if (shouldAdd) loggedQuests.add(questId);
                else loggedQuests.remove(questId);

                CommandHandler.sendMessage(
                    sender,
                    "Quest %s will %s.".formatted(questId, shouldAdd ? "now be logged" : "no longer be logged")
                );
            }
            case "triggers" -> {
                CommandHandler.sendMessage(
                    sender,
                    "Triggers registered for %s: %s.".formatted(
                            questId,
                            String.join(", ", quest.getTriggers().keySet())
                        )
                );
            }
            case "grouptriggers" -> {
                var scene = targetPlayer.getScene();
                var scriptManager = scene.getScriptManager();

                var group = scriptManager.getGroupById(questId);
                if (group == null) {
                    CommandHandler.sendMessage(sender, "The group does not exist.");
                    return;
                }

                CommandHandler.sendMessage(
                    sender,
                    group.triggers
                        .entrySet()
                        .stream()
                        .map(entry -> "%s: %s".formatted(entry.getKey(), entry.getValue()))
                        .collect(Collectors.joining(", "))
                );
            }
            case "remove" -> {
                CommandHandler.sendMessage(
                    sender,
                    "Remove Quest " +
                    questId +
                    " with " +
                    quest.getState().name() +
                    ", Make sure you log out first to repeat this quest"
                );
                quest.delete();
            }
            case "list" -> {
                /*
                var questManager = targetPlayer.getQuestManager();
                var mainQuests = questManager.getActiveMainQuests();
                var allQuestIds =
                        mainQuests.stream()
                                .filter(quest -> questManager.getLoggedQuests().contains(quest.getParentQuestId()))
                                .filter(quest -> quest.getState() != ParentQuestState.PARENT_QUEST_STATE_FINISHED)
                                .map(quest -> quest.getChildQuests().values())
                                .flatMap(Collection::stream)
                                .filter(quest -> quest.getState() == QuestState.QUEST_STATE_UNFINISHED)
                                .map(GameQuest::getSubQuestId)
                                .map(String::valueOf)
                                .toList();

                CommandHandler.sendMessage(
                        sender,
                        "Quests: "
                                + (allQuestIds.isEmpty() ? "(no active quests)" : String.join(", ", allQuestIds)));
                                */
            }
            default -> this.sendUsageMessage(sender);
        }
    }
}
