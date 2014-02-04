package org.cccs.dtd.domain;

import java.util.UUID;

/**
 * Created by boycook on 04/02/2014.
 */
public abstract class AbstractEntity implements Entity {

    private final UUID id;
    private String name;
    private String description;
    private Type type;

    protected AbstractEntity(UUID id, String name, String description, Type type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

}
