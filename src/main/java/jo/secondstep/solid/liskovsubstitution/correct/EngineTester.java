package jo.secondstep.solid.liskovsubstitution.correct;

public class EngineTester {

	public void testEngine(Car car) {

		car.provideEnergy(EnergyProviderFactory.getEnergyProvider(car), 5);
		
		car.startEngine();

		System.out.println("Test engine for 10 minutes");

		car.stopEngine();
	}

}
