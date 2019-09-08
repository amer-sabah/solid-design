package jo.secondstep.solid.liskovsubstitution.correct;

public class PetrolEnergyProvider implements EnergyProvider {

	@Override
	public int provideEnergy(int time) {
		return 5 * time; // provide 5 liters per time (1 second);
	}

}
