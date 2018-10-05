package com.David.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.David.models.Player;
import com.David.models.Roster;
import com.David.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Players() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/NewPlayer.jsp");
        view.forward(request, response);	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		System.out.println(request.getParameter("first_name"));
		System.out.println(request.getParameter("last_name"));
		System.out.println(request.getParameter("age"));
		
		Team z = (Team) session.getAttribute("team");
		
		int y = Integer.parseInt(request.getParameter("age"));
		Player x = new Player(request.getParameter("first_name"),request.getParameter("last_name"), y);
		
		z.addplayer(x);
		
		
		response.sendRedirect("/Team/Players?id=0");
	}

}
