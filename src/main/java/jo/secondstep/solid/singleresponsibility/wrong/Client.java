package jo.secondstep.solid.singleresponsibility.wrong;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();

		restaurant.setName("Gusto Italian Restaurant");
		restaurant.setDescription(
				"Gusto serves a wide range of Italian specialties from thin crusted pizzas to freshly baked homemade breads blazed in a wooden fire oven");
		restaurant.setDiningStyle(DiningStyle.CASUAL_DINING);
		restaurant.setDressCode(DressCode.BUSINESS_CASUAL);
		restaurant.setHoursOfOperation("Daily 4:00 pm�11:00 pm");

		List<Cuisine> cuisines = new ArrayList<Cuisine>();
		cuisines.add(Cuisine.ITALIAN);

		restaurant.setCuisines(cuisines);

		restaurant.setCountry("Jordan");
		restaurant.setCity("Amman");
		restaurant.setNeighborhood("Abdali");
		restaurant.setStreet("Black Iris");
		restaurant.setBuildingNumber(73);

	}
}
