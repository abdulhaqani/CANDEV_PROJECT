package webapp;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Category{
	//variables
	
	String _type;
	ArrayList <Sport> _sport;

	public ArrayList<Sport> getSport() {
		return _sport;
	}

	public void set_sport(ArrayList<Sport> _sport) { //
		this._sport = new ArrayList<Sport>();
	}

	public String getType() { //get type
		return _type;
	}

	public void setType(String types) { //set type
		this._type = types;
	}
	
	public void addSport(ArrayList<Sport> _sport , Sport new_sport) {
		
		int listSize = _sport.size();
		for(int i = 0; i < listSize; ++i)
		  _sport.add(new_sport);
	}
	
	public void removeSport (ArrayList<Sport> _sport , Sport old_sport) {
		
		int listSize = _sport.size();
		for(int i = 0; i < listSize; ++i) {
			if (old_sport == _sport.get(i)) {
				_sport.remove(i);
				
			}
		}
		
	}
	

}
