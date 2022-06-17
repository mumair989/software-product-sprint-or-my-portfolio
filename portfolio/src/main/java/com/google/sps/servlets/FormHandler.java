package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formHandler")
public class FormHandler extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //  response.sendRedirect("https://google.com");
    
        String textValue = request.getParameter("text-input");
        // Print the value so you can see it in the server logs.
        System.out.println("You submitted: " + textValue);
        // Write the value to the response so the user can see it.
        response.getWriter().println("You submitted: " + textValue);
    
        
      }
}
