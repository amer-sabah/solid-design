package jo.secondstep.solid.dependencyinversion.wrong.restaurant;

public class GrillMarkRestaurant {

	public GrillMarkFood provideFood(String orderRequest) {

		return new GrillMarkFood();
	}

}
