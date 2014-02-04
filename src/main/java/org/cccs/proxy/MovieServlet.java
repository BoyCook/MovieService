package org.cccs.proxy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

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
}
