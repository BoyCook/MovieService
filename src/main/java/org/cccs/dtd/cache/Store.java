package org.cccs.dtd.cache;

import org.cccs.dtd.domain.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by boycook on 04/02/2014.
 */
public class Store {

    private Map<UUID, Entity> entities = new HashMap<UUID, Entity>() ;

    public void addItem(final Entity entity) {
        entities.put(entity.getId(), entity);
    }

    public void removeItem(UUID id) {
        entities.remove(id);
    }

    public Entity getItem(UUID id) {
        return entities.get(id);
    }

    public int size() {
        return entities.size();
    }
}
