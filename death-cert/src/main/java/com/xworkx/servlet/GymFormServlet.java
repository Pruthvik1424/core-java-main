package com.xworkx.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="GymAdmission", urlPatterns = "/GymAdmission", loadOnStartup = 1)
public class GymFormServlet extends HttpServlet{
	
	public GymFormServlet() {
		System.out.println("running no param const of gym......");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("service running the gym form servlet......");
		String name=req.getParameter("name");
		System.out.println(name);
		String Dob=req.getParameter("Dob");
		System.out.println(Dob);
		String age=req.getParameter("age");
		System.out.println(age);
		String gender=req.getParameter("gender");
		System.out.println(gender);
		String email=req.getParameter("email");
		System.out.println(email);
		String membebership=req.getParameter("membebership");
		System.out.println(membebership);
		String membershipduration=req.getParameter("membershipduration");
		System.out.println(membershipduration);
		
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/plain");
		writer.write("thank you for applayuing ,Your application is under process....");
		writer.write("Name :"+name+ "Age :"+age + "Gender :"+gender + "Email :" +email +"membership :"+membebership + "membershipduration" +membershipduration);
		
	}

}
