package jo.secondstep.solid.liskovsubstitution.correct;

public class PetrolEnergy implements Energy {

	private int liter;

	@Override
	public boolean hasEnergy() {
		return liter > 0;
	}

	@Override
	public int getValue() {
		return liter;
	}

}
