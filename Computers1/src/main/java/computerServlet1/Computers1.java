package computerServlet1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/computer1", loadOnStartup = 1)
public class Computers1 extends HttpServlet {
	
	public Computers1() {
		System.out.println("running no arg in computers1...");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service for computer1 servlet................");
	}

}
