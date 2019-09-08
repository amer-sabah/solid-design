package jo.secondstep.solid.liskovsubstitution.correct;

public class ElectricEnergy implements Energy {

	private int ampereHours;

	@Override
	public boolean hasEnergy() {
		return ampereHours > 0;
	}

	@Override
	public int getValue() {
		return ampereHours;
	}

}
