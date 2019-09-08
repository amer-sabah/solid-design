package jo.secondstep.solid.openclosed.wrong.op;

import jo.secondstep.solid.openclosed.wrong.io.Code;
import jo.secondstep.solid.openclosed.wrong.io.Requirements;

public class WritingCode implements Operation {

	private Requirements requirements;

	public void setRequirements(Requirements requirements) {
		this.requirements = requirements;
	}

	public Requirements getRequirements() {
		return requirements;
	}

	@Override
	public String toString() {
		return "Writing Code";
	}

	@Override
	public Object execute() {
		return new Code();
	}
}
