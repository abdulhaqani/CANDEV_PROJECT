package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class Sport extends HttpServlet {
	ArrayList<Organization> organizations=new ArrayList<Organization>();
	String sport;
	boolean group; 
	String description;
	public Sport(String whatSport, boolean isGroup, String descriptionOfSport) {
		this.sport=whatSport;
		this.group=isGroup;
		this.description=descriptionOfSport;
	}
	public void add(Organization org) {
		organizations.add(org);
	}
	public Organization getOrganization(int index) {
		return organizations(index);
	}
	public Sport getSport() {
		return this;
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");

	}

}