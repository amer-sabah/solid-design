package jo.secondstep.solid.liskovsubstitution.correct;

public class ElectricEnergyProvider implements EnergyProvider {

	@Override
	public ElectricEnergy provideEnergy(int time) {
		return new ElectricEnergy(15 * time); // provide 15 ampereHours per time (1 second);
	}

}
