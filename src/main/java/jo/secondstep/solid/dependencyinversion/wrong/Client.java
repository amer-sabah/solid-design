package jo.secondstep.solid.dependencyinversion.wrong;

import jo.secondstep.solid.dependencyinversion.wrong.company.Company;
import jo.secondstep.solid.dependencyinversion.wrong.restaurant.GrillMarkFood;

public class Client {

	public static void main(String[] args) {

		Company secondStepCompany = new Company();

		GrillMarkFood food = secondStepCompany.orderFood("12 Zinger Sandwich");

		System.out.println(food);
	}
}
