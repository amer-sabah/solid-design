package jo.secondstep.solid.interfacesegregation.correct;

public class Station {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Station(String name) {
		this.name = name;
	}
}
