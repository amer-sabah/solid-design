package jo.secondstep.solid.liskovsubstitution.correct;

public class PetrolEnergy implements Energy {

	private int liters;
	
	public PetrolEnergy(int liters) {
		this.liters = liters;
	}

	public int getLiters() {
		return liters;
	}	
}
