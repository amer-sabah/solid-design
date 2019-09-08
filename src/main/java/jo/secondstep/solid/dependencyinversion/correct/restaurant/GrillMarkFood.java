package jo.secondstep.solid.dependencyinversion.correct.restaurant;

import jo.secondstep.solid.dependencyinversion.correct.food.Food;

public class GrillMarkFood implements Food {

	@Override
	public String toString() {
		return "Food is prepared by Grill Mark Restaurant";
	}
}
