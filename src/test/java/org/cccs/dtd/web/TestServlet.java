package org.cccs.dtd.web;

import org.cccs.dtd.AbstractJMockTestSupport;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * User: boycook
 * Date: 19/04/2012
 * Time: 09:16
 */
public class TestServlet extends AbstractJMockTestSupport {

    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setup() throws MalformedURLException {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        confirmExpectations();
    }

    @Test
    public void getByIdShouldWork() throws IOException, ServletException {
        one(response).setContentType("application/json");
        one(request).getParameterValues("id");
        one(response).getWriter();
        confirmExpectations();
        new MovieServlet().doGet(request, response);
    }

    @Test
    public void getAllShouldWork() throws IOException, ServletException {
        one(response).setContentType("application/json");
        one(request).getParameterValues("id");
        will(returnValue(null));
        one(response).getWriter();
        confirmExpectations();
        new MovieServlet().doGet(request, response);
    }

    @Test
    public void putShouldWork() throws IOException, ServletException {
        String [] names = {"name1"};
        String [] descriptions = {"description1"};
        one(response).setContentType("application/json");
        one(request).getParameterValues("name");
        will(returnValue(names));
        one(request).getParameterValues("description");
        will(returnValue(descriptions));
        confirmExpectations();
        new MovieServlet().doPut(request, response);
    }


    @Test
    public void postShouldWork() throws IOException, ServletException {
        String [] names = {"name1"};
        String [] descriptions = {"description1"};
        one(response).setContentType("application/json");
        one(request).getParameterValues("name");
        will(returnValue(names));
        one(request).getParameterValues("description");
        will(returnValue(descriptions));
        confirmExpectations();
        new MovieServlet().doPost(request, response);
    }
}
