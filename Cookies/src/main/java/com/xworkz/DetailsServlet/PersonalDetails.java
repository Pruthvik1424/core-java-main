package com.xworkz.DetailsServlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/Firstname", loadOnStartup = 1)

public class PersonalDetails extends HttpServlet {

	public PersonalDetails() {
		System.out.println("running no param const in persnal details.......");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service method in personaldetails servlet...");
		
		String firstname = req.getParameter("firstname");
		System.out.println("FirstName :" +firstname);
		String lastname = req.getParameter("lastname");
		System.out.println("LastName :"+lastname);
		
		HttpSession session=	req.getSession();
		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null) {

		randomValue = generateRandomValue();

		
		Cookie cookie = new Cookie("Xworkz", randomValue);

		cookie.setMaxAge(60 * 60);

		res.addCookie(cookie);

		}

		req.setAttribute("randomValue", randomValue);

		RequestDispatcher dispatcher = req.getRequestDispatcher("ContactDetails.jsp");

		session.setAttribute("Firstname", firstname);
		session.setAttribute("Lastname", lastname);

		dispatcher.forward(req, res);

		}

		private String generateRandomValue() {

		String uuid = UUID.randomUUID().toString();

		return uuid.substring(0, 20);

		}

		private String getCookieValue(HttpServletRequest req, String cookieName) {

		Cookie[] cookies = req.getCookies();

		if (cookies != null) {

		for (Cookie cookie : cookies) {

		if (cookie.getName().equals(cookieName)) {

		return cookie.getValue();

		}

		}

		}

		return null;

		}
		
		
		
		
		
		/*
		 * PrintWriter writer = res.getWriter(); res.setContentType("text/html");
		 */
		
	/*RequestDispatcher dispatcher =req.getRequestDispatcher("ContactDetails.jsp");
	dispatcher.forward(req, res);*/
		

}
