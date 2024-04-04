package computerPartsServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/computer", loadOnStartup = 1)
public class ComputerParts extends HttpServlet {
	
	public ComputerParts() {
		System.out.println("running no param const of computerparts.....");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Running service for computers in servlet......");
		String brand = req.getParameter("brand");
		String model = req.getParameter("model");
		String color = req.getParameter("color");
		String type = req.getParameter("type");
		String ram = req.getParameter("ram");
		String harddisk = req.getParameter("harddisk");
		String processor = req.getParameter("processor");
		String generation = req.getParameter("generation");
		String motherboard = req.getParameter("motherboard");
		String cacheSize = req.getParameter("cacheSize");
		String cost = req.getParameter("cost");
		String quantity = req.getParameter("quantity");
		
		System.out.println("Brand:"+brand+ "model:"+model + "color:"+color + "type:"+type+"ram:"+ram + "harddisk:"+harddisk+ "processor:"+processor + "generation:"+generation + "motherboard:"+motherboard);
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		//writer.write("Thank you for booking....");
		//writer.write("<br>");
		
		long cost1 = Long.parseLong(cost);
		int quantity1 = Integer.parseInt(quantity);
		
		System.out.println("brand: "+ brand + "mode;: "+model + "color: "+color +"type: "+type+ "ram: "+ ram+ "harddisk: "+ harddisk +"processor: "+ processor + "genration: "+ generation + "motherboard: " +motherboard+"cachesize: "  + cacheSize +"cost1: "+cost1+"quantity: "+quantity1);
		long totalCost = cost1*quantity1;
		System.out.println("<b>totalcost : </b>" +totalCost);
		
		writer.write("<!DOCTYPE html>");
		
		writer.write("<head>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		writer.write("<nav class='navbar navbar-dark bg-primary'><div class=\"container-fluid\">  <a class=\"navbar-brand\" href=\"index.html\">HOME</a><a class=\"navbar-brand\" href=\"computerParts.html\">APPLICATION</a>\r\n"
				+ "    <form class=\"d-flex\">\r\n"
				+ "      <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "      <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "    </form></div></nav>");
		writer.write("<body>");
		writer.write("Thank you for booking....<br>");
		writer.write("Total cost : "+totalCost);
		//writer.write("<a href=' computerParts.html'><button type='submit'>Back</button></a>");
		writer.write("</body>");
		writer.write("</head>");
		writer.write("</html>");
		
		
		
		
	}

}
