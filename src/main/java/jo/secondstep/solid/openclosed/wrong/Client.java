package jo.secondstep.solid.openclosed.wrong;

import java.util.ArrayList;
import java.util.List;

import jo.secondstep.solid.openclosed.wrong.io.Build;
import jo.secondstep.solid.openclosed.wrong.io.Code;
import jo.secondstep.solid.openclosed.wrong.io.Requirements;
import jo.secondstep.solid.openclosed.wrong.op.GenerateProductBuild;
import jo.secondstep.solid.openclosed.wrong.op.Operation;
import jo.secondstep.solid.openclosed.wrong.op.Testing;
import jo.secondstep.solid.openclosed.wrong.op.WritingCode;
import jo.secondstep.solid.openclosed.wrong.op.WritingCodeWithJUnitTesting;



public class Client {

	public static void main(String[] args) {

		List<Operation> operations = new ArrayList<Operation>();
		
		operations.add(new WritingCode());
		operations.add(new GenerateProductBuild());
		operations.add(new Testing());

		Requirements requirements = new Requirements();

		Object output = execute(operations, requirements);
		
		System.out.println("Finally, we got the " + output);

	}

	public static Object execute(List<Operation> operations, Requirements requirements) {

		Object output = null;

		for (int i = 0; i < operations.size(); i++) {
			if (i == 0) {
				
				if (operations.get(i) instanceof WritingCode) {
					((WritingCode) operations.get(i)).setRequirements(requirements);
				} else if (operations.get(i) instanceof WritingCodeWithJUnitTesting) {
					((WritingCodeWithJUnitTesting) operations.get(i)).setRequirements(requirements);
				}
				
				
				
			} else {
				if(operations.get(i) instanceof GenerateProductBuild) {
					((GenerateProductBuild)operations.get(i)).setCode((Code) output);
				} else if (operations.get(i) instanceof Testing) {
					((Testing) operations.get(i)).setBuild((Build) output);
				} 
			}
			
			output = operations.get(i).execute();
		}

		return output;
	}
}
