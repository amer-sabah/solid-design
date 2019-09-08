package jo.secondstep.solid.interfacesegregation.wrong;

import java.util.List;

public abstract class BasicMetroTrain implements MetroTrain {

	private List<Station> stations;
	
	private Driver driver;

	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
