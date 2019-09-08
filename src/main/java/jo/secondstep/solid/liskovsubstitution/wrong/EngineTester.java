package jo.secondstep.solid.liskovsubstitution.wrong;

public class EngineTester {

	public void testEngine(Car car) {

		car.fillUpPetrol(5);

		car.startEngine();

		System.out.println("Test engine for 10 minutes");

		car.stopEngine();
	}

}
