package jo.secondstep.solid.liskovsubstitution.correct;

public class ElectricCar implements Car {

	int batteryLevel;

	@Override
	public void startEngine() {
		if (batteryLevel > 0) {
			System.out.println("Engine is started");
		}

	}

	@Override
	public void stopEngine() {
		System.out.println("Engine is stoped");
	}

	@Override
	public void provideEnergy(EnergyProvider energyProvider, int time) {

		if (!(energyProvider instanceof ElectricEnergyProvider)) {
			throw new RuntimeException("Invalid energy provider");
		}

		batteryLevel += energyProvider.provideEnergy(time);
	}

}
