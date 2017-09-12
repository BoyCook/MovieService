package org.cccs.dtd.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by boycook on 04/02/2014.
 */
@Data
@Entity
public class Movie {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;

    private @Version
    @JsonIgnore
    Long version;


    public Movie() {
    }

    public Movie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version=" + version +
                '}';
    }
}
