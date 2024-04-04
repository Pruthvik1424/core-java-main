package com.xworkx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet (name="VehicleService", urlPatterns = "/VehicleService", loadOnStartup = 1)
public class VehicleServiceServlet extends HttpServlet {
       
	public VehicleServiceServlet() {
		System.out.println("Running No param const of VehicleServiceServlet.......");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Service running VehicleServiceServlet............");
		String date =req.getParameter("date");
		System.out.println(date);
		String type =req.getParameter("type");
		System.out.println(type);
		String number =req.getParameter("number");
		System.out.println(number);
		String services =req.getParameter("services");
		System.out.println(services);
		String name =req.getParameter("name");
		System.out.println(name);
		String phone =req.getParameter("phone");
		System.out.println(phone);
		String email =req.getParameter("email");
		System.out.println(email);
		String address =req.getParameter("address");
		System.out.println(address);
		
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/plain");
		writer.write("thak you for booking , we will let you know your appointment");
		
	}
	
}
