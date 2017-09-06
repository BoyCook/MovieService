package org.cccs.dtd.web;

import org.cccs.dtd.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.hateoas.EntityLinks;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import static org.cccs.dtd.web.WebSocketConfiguration.MESSAGE_PREFIX;

@Component
@RepositoryEventHandler(Movie.class)
public class EventHandler {

    private final SimpMessagingTemplate websocket;

    private final EntityLinks entityLinks;

    @Autowired
    public EventHandler(SimpMessagingTemplate websocket, EntityLinks entityLinks) {
        this.websocket = websocket;
        this.entityLinks = entityLinks;
    }

    @HandleAfterCreate
    public void newMovie(Movie Movie) {
        this.websocket.convertAndSend(
                MESSAGE_PREFIX + "/newMovie", getPath(Movie));
    }

    @HandleAfterDelete
    public void deleteMovie(Movie Movie) {
        this.websocket.convertAndSend(
                MESSAGE_PREFIX + "/deleteMovie", getPath(Movie));
    }

    @HandleAfterSave
    public void updateMovie(Movie Movie) {
        this.websocket.convertAndSend(
                MESSAGE_PREFIX + "/updateMovie", getPath(Movie));
    }

    /**
     * Take an {@link Movie} and get the URI using Spring Data REST's {@link EntityLinks}.
     *
     * @param Movie
     */
    private String getPath(Movie movie) {
        return this.entityLinks.linkForSingleResource(movie.getClass(),
                movie.getId()).toUri().getPath();
    }

}