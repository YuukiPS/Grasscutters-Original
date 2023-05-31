package emu.grasscutter.game.world;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexed;
import emu.grasscutter.database.DatabaseHelper;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.scripts.data.SceneGadget;
import emu.grasscutter.scripts.data.SceneGroup;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Entity(value = "group_instances", useDiscriminator = false)
public final class SceneGroupInstance {

	@Id
	private ObjectId id;

	@Indexed
	private int ownerUid; // This group is owned by the host player

	@Getter
	private int groupId;

	@Getter
	private transient SceneGroup luaGroup;

	@Getter
	@Setter
	private int targetSuiteId;

	@Getter
	@Setter
	private int activeSuiteId;

	@Getter
	private Set<Integer> deadEntities; // Config_ids

	private boolean isCached;

	@Getter
	private Map<Integer, Integer> cachedGadgetStates;

	@Getter
	private Map<String, Integer> cachedVariables;

	@Getter
	@Setter
	private int lastTimeRefreshed;

	public SceneGroupInstance(SceneGroup group, Player owner) {
		this.luaGroup = group;
		this.groupId = group.id;
		this.targetSuiteId = 0;
		this.activeSuiteId = 0;
		this.lastTimeRefreshed = 0;
		this.ownerUid = owner.getUid();
		this.deadEntities = new HashSet<>();
		this.cachedGadgetStates = new ConcurrentHashMap<>();
		this.cachedVariables = new ConcurrentHashMap<>();

		this.isCached = false; // This is true when the group is not loaded on scene but caches suite data
	}

	@Deprecated // Morphia only!
	SceneGroupInstance() {
		this.cachedVariables = new ConcurrentHashMap<>();
		this.deadEntities = new HashSet<>();
		this.cachedGadgetStates = new ConcurrentHashMap<>();
	}

	public void setLuaGroup(SceneGroup group) {
		this.luaGroup = group;
		this.groupId = group.id;
	}

	public boolean isCached() {
		return this.isCached;
	}

	public void setCached(boolean value) {
		this.isCached = value;
		save(); // Save each time a group is registered or unregistered
	}

	public void cacheGadgetState(SceneGadget g, int state) {
		if (
			g.persistent
		) cachedGadgetStates.put(g.config_id, state); // Only cache when is persistent
	}

	public int getCachedGadgetState(SceneGadget g) {
		Integer state = cachedGadgetStates.getOrDefault(g.config_id, null);
		return (state == null) ? g.state : state;
	}

	public void save() {
		DatabaseHelper.saveGroupInstance(this);
	}
}
