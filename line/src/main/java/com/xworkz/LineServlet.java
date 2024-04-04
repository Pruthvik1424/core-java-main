package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="lineServlet", urlPatterns = "/click", loadOnStartup = 5 )

public class LineServlet extends HttpServlet{
	public LineServlet() {
		System.out.println("no arg param constructor");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in line servlet");
		
		resp.setContentType("text/plain");
		PrintWriter write = resp.getWriter();
		write.write("servlet in line......");
	} 
	

}
