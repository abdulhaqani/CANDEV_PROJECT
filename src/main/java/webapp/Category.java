package webapp;

import java.util.ArrayList;

public class Category {
	//variables
	String _type;
	ArrayList <Sport> _sport;

	public ArrayList<Sport> get_sport() {
		return _sport;
	}

	public void set_sport(ArrayList<Sport> _sport) { //
		this._sport = new ArrayList<Sport>();
	}

	public String getType() { //get type
		return _type;
	}

	public void setType(String type) { //set type
		this._type = type;
	}
	
	public void addSport(ArrayList<Sport> _sport , Sport new_sport) {
		
		int listSize = _sport.size();
		for(int i = 0; i < listSize; ++i)
		  _sport.add(new_sport);
	}
	
	public void removeSport (ArrayList<Sport> _sport , Sport old_sport) {
		
		int listSize = _sport.size();
		for(int i = 0; i < listSize; ++i) {
			if (old_sport == _sport) {
				_sport.remove(i);
				
			}
		}
		
	}

}
