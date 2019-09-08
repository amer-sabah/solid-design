package jo.secondstep.solid.interfacesegregation.correct;

public class T23MetroTrain extends BasicMetroTrain implements DriverControlledMetroTrain {
	
	private Driver driver;

	@Override
	public int getMaxSpeed() {
		return 180;
	}

	@Override
	public int getCapacity() {
		return 1200;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
