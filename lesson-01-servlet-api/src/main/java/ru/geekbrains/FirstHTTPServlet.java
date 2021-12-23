package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/first_http_servlet/*")
public class FirstHTTPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Привет from HTTP servlet</h1>");
        resp.getWriter().println("<p>contextPath: " + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>servletPath: " + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>pathInfo: " + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>queryString: " + req.getQueryString() + "</p>");
        resp.getWriter().println("<p>parameter1: " + req.getParameter("param1") + "</p>");
        resp.getWriter().println("<p>parameter2: " + req.getParameter("param2") + "</p>");

    }
}
