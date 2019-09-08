package jo.secondstep.solid.liskovsubstitution.wrong;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		EngineTester engineTester = new EngineTester();

		List<Car> cars = new ArrayList<Car>();

		cars.add(new PetrolCar());
		cars.add(new PetrolCar());
		cars.add(new ElectricCar());

		for (Car car : cars) {
			engineTester.testEngine(car);
		}

	}
}
