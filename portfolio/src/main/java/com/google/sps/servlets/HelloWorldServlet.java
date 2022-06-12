package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    private int pageViews = 0;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    pageViews++;
    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello Umair!</h1>");
    response.getWriter().println("<h1>Page Views</h1>");
    response.getWriter().println("<p>This page has been viewed " + pageViews + " times.</p>");
    String textValue = request.getParameter("text-input");
    response.getWriter().println("You submitted: " + textValue);
  }
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // response.sendRedirect("https://google.com");

    String textValue = request.getParameter("text-input");
    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + textValue);
    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + textValue);
  }
}




