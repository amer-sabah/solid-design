package jo.secondstep.solid.dependencyinversion.correct.company;

import jo.secondstep.solid.dependencyinversion.correct.food.Food;
import jo.secondstep.solid.dependencyinversion.correct.food.FoodProvider;

public class Company {

	private FoodProvider foodProvider;
	
	public FoodProvider getFoodProvider() {
		return foodProvider;
	}

	public void setFoodProvider(FoodProvider foodProvider) {
		this.foodProvider = foodProvider;
	}

	public Food orderFood(String orderRequest) {
		return foodProvider.provideFood(orderRequest);
	}
}
