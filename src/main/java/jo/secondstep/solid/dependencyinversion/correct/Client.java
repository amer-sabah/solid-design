package jo.secondstep.solid.dependencyinversion.correct;

import jo.secondstep.solid.dependencyinversion.correct.company.Company;
import jo.secondstep.solid.dependencyinversion.correct.food.Food;
import jo.secondstep.solid.dependencyinversion.correct.food.FoodProvider;
import jo.secondstep.solid.dependencyinversion.correct.restaurant.GrillMarkRestaurant;

public class Client {

	public static void main(String[] args) {

		FoodProvider foodProvider = new GrillMarkRestaurant();

		Company secondStepCompany = new Company();

		secondStepCompany.setFoodProvider(foodProvider);

		Food food = secondStepCompany.orderFood("12 Zinger Sandwich");

		System.out.println(food);
	}
}
