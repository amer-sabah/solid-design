package jo.secondstep.solid.liskovsubstitution.correct;

public class EnergyProviderFactory {

	private static PetrolEnergyProvider petrolEnergyProvider = new PetrolEnergyProvider();
	private static ElectricEnergyProvider electricEnergyProvider = new ElectricEnergyProvider();

	public static EnergyProvider getEnergyProvider(Car car) {
		
		EnergyProvider energyProvider = null;

		if (car instanceof PetrolCar) {
			energyProvider =  petrolEnergyProvider;
		} else if (car instanceof ElectricCar) {
			energyProvider =  electricEnergyProvider;
		}

		return energyProvider;
	}
}
