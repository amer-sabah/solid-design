package jo.secondstep.solid.liskovsubstitution.wrong;

public class ElectricCar implements Car {

	int batteryLevel;

	@Override
	public void fillUpPetrol(int liter) {
		throw new UnsupportedOperationException("Cannot fill up with Petrol");
	}

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

	public void chargeBattery(int ampereHours) {
		batteryLevel += ampereHours;
	}

}
