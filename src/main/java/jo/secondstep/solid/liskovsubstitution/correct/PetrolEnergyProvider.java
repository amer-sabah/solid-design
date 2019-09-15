package jo.secondstep.solid.liskovsubstitution.correct;

public class PetrolEnergyProvider implements EnergyProvider {

	@Override
	public PetrolEnergy provideEnergy(int time) {
		return new PetrolEnergy(5 * time); // provide 5 liters per time (1 second);
	}

}
