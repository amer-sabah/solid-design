package jo.secondstep.solid.singleresponsibility.wrong;

import java.util.List;

public class Restaurant {

	private String name;
	private String description;
	private DiningStyle diningStyle;
	private DressCode dressCode;
	private List<Cuisine> cuisines;
	private String hoursOfOperation;

	private String country;
	private String city;
	private String neighborhood;
	private String street;
	private int buildingNumber;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

}
