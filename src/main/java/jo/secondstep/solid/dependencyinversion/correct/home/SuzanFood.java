package jo.secondstep.solid.dependencyinversion.correct.home;

import jo.secondstep.solid.dependencyinversion.correct.food.Food;

public class SuzanFood implements Food {

	@Override
	public String toString() {
		return "Food is prepared by Suzan's Home";
	}
}
