
package com.educacionit.java.web;


import com.educacionit.java.web.beans.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/signOut")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession (false);

        session.invalidate ();

        response.sendRedirect ("index.jsp");
    }
}