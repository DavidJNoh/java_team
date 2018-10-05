package com.David.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.David.models.Roster;
import com.David.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (request.getParameter("id") == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/NewTeam.jsp");
	        view.forward(request, response);
		}
		else {
			int x = Integer.parseInt(request.getParameter("id"));
			System.out.println(x);
			session.setAttribute("id", x);
			
			Roster roster = (Roster) session.getAttribute("roster");
			Team team = roster.getTeam(x);
			session.setAttribute("team", team);			
			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/TeamInfo.jsp");
			view.forward(request, response);	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("name"));
		Team x = new Team(request.getParameter("name"));
		response.sendRedirect("/Team/Home");
	}

}
