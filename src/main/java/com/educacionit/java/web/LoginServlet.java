
package com.educacionit.java.web;


import com.educacionit.java.web.beans.User;
import com.educacionit.java.web.db.DBConnectionManager;
import com.educacionit.java.web.db.DataException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/signIn")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {

        String u = request.getParameter ("username");
        String p = request.getParameter ("password");

        boolean ok = false;


        ServletContext sc = request.getServletContext ();
        DBConnectionManager db = (DBConnectionManager)sc.getAttribute ("db");




        if (ok) {

            HttpSession session = request.getSession ();

            User us = new User ();

            session.setAttribute ("user", us);

            response.sendRedirect ("home.jsp");

        } else {

            response.sendRedirect ("index.jsp?err=100");
        }
    }
}