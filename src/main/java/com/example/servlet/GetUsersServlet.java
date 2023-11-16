package com.example.servlet;

import com.example.Warehouse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("users", Warehouse.getInstance().getUsers());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/users.jsp");
        requestDispatcher.forward(request, response);
    }
    //write your code here!
}
