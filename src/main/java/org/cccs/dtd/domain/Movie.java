package org.cccs.dtd.domain;

import java.util.UUID;

/**
 * Created by boycook on 04/02/2014.
 */
public class Movie extends AbstractEntity implements Entity {
    public Movie() {
        this(null, null);
    }

    public Movie(UUID id) {
        this(id, null, null);
    }

    public Movie(String name, String description) {
        this(UUID.randomUUID(), name, description);
    }

    protected Movie(UUID id, String name, String description) {
        super(id, name, description, Type.MOVIE);
    }
}
