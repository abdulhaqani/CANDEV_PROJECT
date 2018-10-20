import java.util.ArrayList;

public class Organization {
	
	private String name;
	private String address;
	private ArrayList<Category> categories;
	private float rating;
	
	// all members
	public Organization (String _name, String _address,
			ArrayList<Category> _categories, float _rating) {
		this.name = _name;
		this.address = _address;
		this.categories = _categories;
		this.rating = _rating;
	}
	
	// add organization
	public Organization (String _name, String _address,
			ArrayList<Category> _categories) {
		this.name = _name;
		this.address = _address;
		this.categories = _categories;
	}	
	
	// short initialization
	public Organization (String _name, String inAddress) {
		this.name = _name;
		this.address = inAddress;
	}
	
	public String get_name() {
		return name;
	}

	public void set_name(String _name) {
		this.name = _name;
	}

	public String get_address() {
		return address;
	}

	public void set_address(String _address) {
		this.address = _address;
	}

	public ArrayList<Category> get_categories() {
		return categories;
	}

	public void set_categories(ArrayList<Category> _categories) {
		this.categories = _categories;
	}

	public float get_rating() {
		return rating;
	}

	public void set_rating(float _rating) {
		this.rating = _rating;
	}
	
	private float CalculateRating() {
		float rating = 0;
		int num_of_sports = 0;
		for (int i = 0; i < categories.size(); i++) {
			for (int j = 0; j < categories.get(i).getSports().size(); j++) {
				num_of_sports++;
				rating += categories.get(i).getSports().get(j).getRating();
			}
		}
		return (rating / num_of_sports);
	}
	
}
