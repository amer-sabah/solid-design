package jo.secondstep.solid.liskovsubstitution.correct;

public class ElectricEnergy implements Energy {

	private int ampereHours;
	
	public ElectricEnergy(int ampereHours) {
		this.ampereHours = ampereHours;
	}

	public int getAmpereHours() {
		return ampereHours;
	}
}
