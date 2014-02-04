package org.cccs.dtd;

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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doGet");
        res.setContentType("application/json");
        res.getWriter().println("{ \"movies\": [],  \"status\": \"success\" }");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doPost");
        super.doPost(req, res);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doPut");
        super.doPut(req, res);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("MovieServlet.doDelete");
        super.doDelete(req, res);
    }
}