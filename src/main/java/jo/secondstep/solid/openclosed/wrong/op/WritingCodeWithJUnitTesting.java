package jo.secondstep.solid.openclosed.wrong.op;

import jo.secondstep.solid.openclosed.wrong.io.CodeWithUnitTesting;
import jo.secondstep.solid.openclosed.wrong.io.Requirements;

public class WritingCodeWithJUnitTesting implements Operation {
	
	private Requirements requirements;

	@Override
	public String toString() {
		return "Writing Code with JUnit";
	}
	
	public void setRequirements(Requirements requirements) {
		this.requirements = requirements;
	}

	public Requirements getRequirements() {
		return requirements;
	}

	@Override
	public Object execute() {
		return new CodeWithUnitTesting();
	}
}
