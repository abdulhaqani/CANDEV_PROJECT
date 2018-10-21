package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Sport{
	

	ArrayList<Organization> organizations=new ArrayList<Organization>();
	String sport;
	boolean group; 
	String description;
	public Sport(String _Sport, boolean _Group, String _description) {
		this.sport=_Sport;
		this.group=_Group;
		this.description=_description;
	}
	public void add(Organization org) {
		organizations.add(org);
	}
	public Organization get_organization(int index) {
		return this.organizations.get(index);
	}
	public Sport get_Sport() {
		return this;
	}
	

}
