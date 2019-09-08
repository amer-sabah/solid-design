package jo.secondstep.solid.dependencyinversion.wrong.company;

import jo.secondstep.solid.dependencyinversion.wrong.restaurant.GrillMarkFood;
import jo.secondstep.solid.dependencyinversion.wrong.restaurant.GrillMarkRestaurant;

public class Company {

	private GrillMarkRestaurant grillMarkRestaurant = new GrillMarkRestaurant();

	public GrillMarkFood orderFood(String orderRequest) {
		return grillMarkRestaurant.provideFood(orderRequest);
	}
}
