package com.xworkz.DetailsServlet;

import java.io.IOException;
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

@WebServlet(urlPatterns = "/Contact", loadOnStartup = 1)

public class DetailsServet extends HttpServlet {
	public DetailsServet() {
		System.out.println("running  no param const of Details servlet....");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		String email = req.getParameter("email");
		System.out.println("Email :" +email);
		String mobileno = req.getParameter("mobileno");
		System.out.println("LastName :"+mobileno);
		
		 
		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null) {

//		randomValue = generateRandomValue();
//
//		Cookie cookie = new Cookie("Xworkz", randomValue);
//
//		cookie.setMaxAge(60 * 60);
//
//		res.addCookie(cookie);
			
			res.sendRedirect("Error.jsp");
			return;

		}

		req.setAttribute("randomValue", randomValue);

		RequestDispatcher dispatcher = req.getRequestDispatcher("Details.jsp");

		req.setAttribute("Email", email);
		req.setAttribute("MobileNumber", mobileno);

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
		
		
		
		
		
		/*RequestDispatcher dispatcher =req.getRequestDispatcher("Details.jsp");
		dispatcher.forward(req, res);
		*/
	}
