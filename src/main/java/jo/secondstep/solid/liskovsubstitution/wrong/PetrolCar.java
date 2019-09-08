package jo.secondstep.solid.liskovsubstitution.wrong;

public class PetrolCar implements Car {

	private int petrolLevel;

	@Override
	public void fillUpPetrol(int liter) {
		petrolLevel += liter;
	}

	@Override
	public void startEngine() {
		if (petrolLevel > 0) {
			System.out.println("Engine is started");
		}

	}

	@Override
	public void stopEngine() {
		System.out.println("Engine is stoped");
	}

}
