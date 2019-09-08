package jo.secondstep.solid.dependencyinversion.correct.restaurant;

import jo.secondstep.solid.dependencyinversion.correct.food.Food;
import jo.secondstep.solid.dependencyinversion.correct.food.FoodProvider;

public class GrillMarkRestaurant implements FoodProvider {

	@Override
	public Food provideFood(String orderRequest) {

		return new GrillMarkFood();
	}

}
