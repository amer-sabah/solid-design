package jo.secondstep.solid.interfacesegregation.wrong;

public class T23MetroTrain extends BasicMetroTrain {
	
	@Override
	public int getMaxSpeed() {
		return 180;
	}

	@Override
	public int getCapacity() {
		return 1200;
	}

	@Override
	public void connectToWifi() {
		throw new UnsupportedOperationException("This metro train does not support to Wifi");
	}
}
