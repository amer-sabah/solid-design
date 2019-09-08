package jo.secondstep.solid.interfacesegregation.correct;

import java.util.List;

public abstract class BasicMetroTrain implements MetroTrain {

	private List<Station> stations;

	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

}
