package jo.secondstep.solid.interfacesegregation.wrong;

public class Q24MetroTrain extends BasicMetroTrain {

	@Override
	public int getMaxSpeed() {
		return 200;
	}

	@Override
	public int getCapacity() {
		return 1800;
	}
	
	@Override
	public Driver getDriver() {
		throw new UnsupportedOperationException("This metro train is driverless");
	}
	
	@Override
	public void setDriver(Driver driver) {
		throw new UnsupportedOperationException("This metro train is driverless");
	}

	@Override
	public void connectToWifi() {
		System.out.println("connect to Wifi through Q24 model implementation");
	}
}
