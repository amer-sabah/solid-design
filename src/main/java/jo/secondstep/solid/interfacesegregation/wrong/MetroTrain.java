package jo.secondstep.solid.interfacesegregation.wrong;

import java.util.List;

public interface MetroTrain {

	public int getMaxSpeed();
	
	public int getCapacity();
	
	public List<Station> getStations();
	
	public Driver getDriver();
	
	public void connectToWifi();
	
}
