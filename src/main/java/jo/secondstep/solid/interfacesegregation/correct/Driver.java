package jo.secondstep.solid.interfacesegregation.correct;

public class Driver {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Driver(String name) {
		this.name = name;
	}
}
