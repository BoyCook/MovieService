package org.cccs.dtd;

import com.google.gson.Gson;
import org.cccs.dtd.cache.Store;
import org.cccs.dtd.domain.Movie;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.String.format;

/**
 * User: boycook
 * Date: 18/04/2012
 * Time: 12:55
 */
public class MovieServlet extends HttpServlet {

    private Store store;

    public MovieServlet() {
        this.store = new Store();
        this.store.addItem(new Movie("Star Wars IV", "A New Hope"));
        this.store.addItem(new Movie("Star Wars V", "The Empire Strikes Back"));
        this.store.addItem(new Movie("Star Wars VI", "Return of the Jedi"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doGet");
        res.setContentType("application/json");
//        req.getParameterValues("id");
        res.getWriter().println(new Gson().toJson(store.getAll()));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doPost");
        Movie movie = new Movie(req.getParameterValues("name")[0], req.getParameterValues("description")[0]);
        this.store.addItem(movie);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doPut");
        Movie movie = new Movie(req.getParameterValues("name")[0], req.getParameterValues("description")[0]);
        this.store.addItem(movie);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doDelete");
        super.doDelete(req, res);
    }
}
