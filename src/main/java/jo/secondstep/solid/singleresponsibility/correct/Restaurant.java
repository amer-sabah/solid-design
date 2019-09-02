package jo.secondstep.solid.singleresponsibility.correct;

import java.util.List;

public class Restaurant {

	private String name;
	private String description;
	private DiningStyle diningStyle;
	private DressCode dressCode;
	private List<Cuisine> cuisines;
	private String hoursOfOperation;

	private Location location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DiningStyle getDiningStyle() {
		return diningStyle;
	}

	public void setDiningStyle(DiningStyle diningStyle) {
		this.diningStyle = diningStyle;
	}

	public DressCode getDressCode() {
		return dressCode;
	}

	public void setDressCode(DressCode dressCode) {
		this.dressCode = dressCode;
	}

	public List<Cuisine> getCuisines() {
		return cuisines;
	}

	public void setCuisines(List<Cuisine> cuisines) {
		this.cuisines = cuisines;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
