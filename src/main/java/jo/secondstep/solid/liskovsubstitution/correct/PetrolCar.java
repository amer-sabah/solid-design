package jo.secondstep.solid.liskovsubstitution.correct;

public class PetrolCar implements Car {

	private int petrolLevel;

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

	@Override
	public void provideEnergy(EnergyProvider energyProvider, int time) {

		if (!(energyProvider instanceof PetrolEnergyProvider)) {
			throw new RuntimeException("Invalid energy provider");
		}

		petrolLevel += energyProvider.provideEnergy(time);
	}
}
