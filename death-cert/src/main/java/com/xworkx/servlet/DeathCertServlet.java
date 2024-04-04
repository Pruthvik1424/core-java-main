package com.xworkx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="deathcertificate",urlPatterns = "/deathcertificate",loadOnStartup = 1)
public class DeathCertServlet extends HttpServlet{

	public DeathCertServlet() {
		System.out.println("Running no param const of deathcert....");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Service running death certificate servlet......");
		String name =req.getParameter("name");
		System.out.println(name);
		String dod =req.getParameter("dod");
		System.out.println(dod);
		String gender =req.getParameter("gender");
		System.out.println(gender);
		String pod =req.getParameter("pod");
		System.out.println(pod);
		String father =req.getParameter("father");
		System.out.println(father);
		String mother =req.getParameter("mother");
		System.out.println(mother);
		String husbandORwife =req.getParameter("husbandORwife");
		System.out.println(husbandORwife);
		String causeofdeath =req.getParameter("causeofdeath");
		System.out.println(causeofdeath);
		String Deathtime =req.getParameter("Deathtime");
		System.out.println(Deathtime);
		String doi =req.getParameter("doi");
		System.out.println(doi);
		
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/plain");
		writer.write("Death certificate is under processing.....");
		sysout
		writer.write("Name:"+name +"DOD"+dod +"Gender"+gender +"POD"+pod+ "father"+ father +"mother" +mother +"husbandORwife" +husbandORwife +"causeofdeath" +causeofdeath);
//		192.168.1.12
		
	}
}
