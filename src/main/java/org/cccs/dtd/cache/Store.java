package org.cccs.dtd.cache;

import org.cccs.dtd.domain.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by boycook on 04/02/2014.
 */
public class Store {

    private Map<UUID, Entity> entities = new HashMap<>() ;

    public void addItem(final Entity entity) {
        entities.put(entity.getId(), entity);
    }

    public void removeItem(UUID id) {
        entities.remove(id);
    }

    @SuppressWarnings("unchecked")
    public <T extends Entity> T getItem(UUID id) {
        return (T) entities.get(id);
    }

    public Collection<Entity> getAll() {
        return entities.values();
    }

    public int size() {
        return entities.size();
    }
}
