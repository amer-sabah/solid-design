package jo.secondstep.solid.interfacesegregation.correct;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<MetroTrain> metroTrains = new ArrayList<MetroTrain>();
		
		T23MetroTrain u1MetroTrain = new T23MetroTrain();
		
		List<Station> u1Stations = new ArrayList<Station>();

		u1Stations.add(new Station("Franklin Ave"));
		u1Stations.add(new Station("64th St"));
		u1Stations.add(new Station("Fort Snelling"));
		u1Stations.add(new Station("28th St"));
		u1Stations.add(new Station("Mall of America"));
		
		u1MetroTrain.setStations(u1Stations);
		
		Driver u1Driver = new Driver("Alex Smith");
		u1MetroTrain.setDriver(u1Driver);
		
		metroTrains.add(u1MetroTrain);
		
		Q24MetroTrain u2MetroTrain = new Q24MetroTrain();
		
		List<Station> u2Stations = new ArrayList<Station>();

		u2Stations.add(new Station("Target Field"));
		u2Stations.add(new Station("Westgate"));
		u2Stations.add(new Station("Dale St"));
		u2Stations.add(new Station("Robert St"));
		u2Stations.add(new Station("Central"));

		u2MetroTrain.setStations(u2Stations);
		
		metroTrains.add(u2MetroTrain);
		
	}
}
