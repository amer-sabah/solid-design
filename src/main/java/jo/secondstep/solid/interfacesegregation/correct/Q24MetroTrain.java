package jo.secondstep.solid.interfacesegregation.correct;

public class Q24MetroTrain extends BasicMetroTrain implements Driverless, WifiProvider {

	@Override
	public int getMaxSpeed() {
		return 200;
	}

	@Override
	public int getCapacity() {
		return 1800;
	}

	@Override
	public void connectToWifi() {
		
		System.out.println("connect to Wifi through Q24 model implementation");
	}
}
