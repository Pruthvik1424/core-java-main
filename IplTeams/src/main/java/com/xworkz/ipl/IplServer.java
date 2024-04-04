package com.xworkz.ipl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(urlPatterns = "/iplmatch" , loadOnStartup = 1)

public class IplServer extends HttpServlet {
	
	public IplServer() {
		System.out.println("running no param const of ipl....");
	}
      
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("service method running in iplserver.....");
		
		String matchno =req.getParameter("matchno");
		System.out.println("Match Number :" +matchno);
		String fixture =req.getParameter("fixture");
		System.out.println("Fixture :" +fixture);
		String onfieldumpire =req.getParameter("onfieldumpire");
		System.out.println("On Field Umpire :" +onfieldumpire);
		String onfieldlegumpire =req.getParameter("onfieldlegumpire");
		System.out.println("On Field Leg Umpire :" +onfieldlegumpire);
		String thirdumpire =req.getParameter("thirdumpire");
		System.out.println("Third Umpire :" +thirdumpire);
		String date =req.getParameter("date");
		System.out.println("Match time :" +date);
		String time =req.getParameter("time");
		System.out.println("Match time :" +time);
		String venue =req.getParameter("venue");
		System.out.println("Match Venue :" +venue);
		String capacity =req.getParameter("capacity");
		System.out.println("Stadium capacity :" +capacity);
		String homeground =req.getParameter("homeground");
		System.out.println("Home Ground For  :" +homeground);
		String type =req.getParameter("type");
		System.out.println(" Session :" +type);
		String checkbox =req.getParameter("checkbox");
		System.out.println(" Accept :" +checkbox);
		
		
		
		
		
		PrintWriter writer=res.getWriter();
		res.setContentType("text/html");
		
		
		
		
		writer.write("<!DOCTYPE html>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		writer.write("<body>");
		writer.write("<nav class=\"navbar navbar-dark bg-dark\">\r\n"
				+ "<h3 style=\"color:white\">INDIAN PREMIER LEAGUE</h3>\r\n"
				+ "<ul class=\"nav justify-content-end\"><li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n"
				+ "  </li></ul>\r\n"
				+ "</nav>");
		writer.write("<b>");
		writer.write("<p style = 'text-align :center'>Thank you</p>");
		writer.write("Match Number :"+matchno);
		writer.write("<br>");
		writer.write("Fixture :" +fixture);
		writer.write("<br>");
		writer.write("On Field Umpire :" +onfieldumpire);
		writer.write("<br>");
		writer.write("On Field Leg Umpire :" +onfieldlegumpire);
		writer.write("<br>");
		writer.write("Third Umpire :" +thirdumpire);
		writer.write("<br>");
		writer.write("Match time :" +date);
		writer.write("<br>");
		writer.write("Match time :" +time);
		writer.write("<br>");
		writer.write("Match Venue :" +venue);
		writer.write("<br>");
		writer.write("Stadium capacity :" +capacity);
		writer.write("<br>");
		writer.write("Home Ground For  :" +homeground);
		writer.write("<br>");
		writer.write(" Session :" +type );
		writer.write("<br>");
		
		writer.write(" Accept :" +checkbox);
		
		writer.write("</b>");
		writer.write("</body>");
		writer.write("</html>");
		
		
		
	}
}
