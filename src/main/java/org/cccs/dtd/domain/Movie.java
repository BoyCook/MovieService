package org.cccs.dtd.domain;

import java.util.UUID;

/**
 * Created by boycook on 04/02/2014.
 */
public class Movie extends AbstractEntity implements Entity {

    public Movie() {
        super(null, null, null, Type.MOVIE);
    }

    protected Movie(UUID id, String name, String description) {
        super(id, name, description, Type.MOVIE);
    }
}
