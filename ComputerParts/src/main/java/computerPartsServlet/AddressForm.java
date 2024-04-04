package computerPartsServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/address", loadOnStartup = 1)

public class AddressForm extends HttpServlet {
 
	public AddressForm() {
		System.out.println("runnning no param const of address form....");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service for address form servlet........");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String zip = req.getParameter("zip");
		String checkbox = req.getParameter("checkbox");
		String Region = req.getParameter("Region");
		
		
		System.out.println("firstname :" +firstName + " lastname :"+ lastName + " city :"+city +" state:" +state +" zip:" +zip+ " checkbox:"+checkbox + " Region:" +Region);
		
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		
		writer.write("<!DOCTYPE html><head><nav class=\"navbar navbar-dark bg-primary\">\r\n"
				+ " <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\"> <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"index.html\">HOME</a>\r\n"
				+ "    <form class=\"d-flex\">\r\n"
				+ "      <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "      <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "    </form>\r\n"
				+ "  </div>\r\n"
				+ "</nav><body><p style=\"text-align :center\"><b>THANK YOU FOR SUBMITTING YOUR ADDRESS</b></p>"
			+ "</body></head></html>");
		
		writer.write("<b>")	;
		writer.write("Your Address detailes is:");
		writer.write("</b>")	;
		writer.write("<br>");
		writer.write("firstname :" +firstName + " "+ lastName);
		writer.write("<br>");
		writer.write(" city :"+city);
		writer.write("<br>");
		writer.write(" state:" +state);
		writer.write("<br>");
		writer.write(" zip:" +zip);
		writer.write("<br>");
		writer.write(" Region:" +Region);
			
	}
	  
	
}
