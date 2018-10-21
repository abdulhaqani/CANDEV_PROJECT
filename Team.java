package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/team")
public class Team extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	float rating; 
	ArrayList<String> feedback;
	Organization organization;
	public Team(String _name, float _rating, ArrayList<String> _feedback, Organization _organization) {
		this.name=_name;
		this.rating=_rating;
		this.feedback=_feedback;
		this.organization=_organization;
	}
	public Team(String _name, float _rating,  Organization _organization) {
		this.name=_name;
		this.rating=_rating;
		this.organization=_organization;
		
	}
	public Organization get_organization() {
		return this.organization;
	}
	public Team get_team() {
		return this;
	}
	public float get_rating() {
		return this.rating;
	}
	public void set_rating(float _rating) {
		this.rating=_rating;
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().println("some shit");

	}

}