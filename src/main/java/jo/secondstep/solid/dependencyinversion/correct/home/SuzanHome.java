package jo.secondstep.solid.dependencyinversion.correct.home;

import jo.secondstep.solid.dependencyinversion.correct.food.Food;
import jo.secondstep.solid.dependencyinversion.correct.food.FoodProvider;

public class SuzanHome implements FoodProvider {

	@Override
	public Food provideFood(String orderRequest) {
		return new SuzanFood();
	}

}
