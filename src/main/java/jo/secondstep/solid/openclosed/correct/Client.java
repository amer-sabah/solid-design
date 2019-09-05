package jo.secondstep.solid.openclosed.correct;

import java.util.ArrayList;
import java.util.List;

import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;
import jo.secondstep.solid.openclosed.correct.io.Requirements;
import jo.secondstep.solid.openclosed.correct.op.GenerateProductBuild;
import jo.secondstep.solid.openclosed.correct.op.Operation;
import jo.secondstep.solid.openclosed.correct.op.Testing;
import jo.secondstep.solid.openclosed.correct.op.WritingCodeWithJUnitTesting;

public class Client {

	public static void main(String[] args) {

		List<Operation> operations = new ArrayList<Operation>();
		
		operations.add(new WritingCodeWithJUnitTesting());
		operations.add(new GenerateProductBuild());
		operations.add(new Testing());

		Requirements requirements = new Requirements();

		Output output = execute(operations, requirements);
		
		System.out.println("Finally, we got the " + output);

	}

	public static Output execute(List<Operation> operations, Input input) {

		Output output = null;

		for (int i = 0; i < operations.size(); i++) {
			if (i == 0) {
				output = operations.get(i).execute(input);
			} else {
				output = operations.get(i).execute(output);
			}
		}

		return output;
	}
}
