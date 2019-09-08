package jo.secondstep.solid.liskovsubstitution.correct;

public class ElectricEnergyProvider implements EnergyProvider {

	@Override
	public int provideEnergy(int time) {
		return 15 * time; // provide 15 ampereHours per time (1 second);
	}

}
