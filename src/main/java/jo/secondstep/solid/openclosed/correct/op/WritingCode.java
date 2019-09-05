package jo.secondstep.solid.openclosed.correct.op;

import jo.secondstep.solid.openclosed.correct.InputInvalidException;
import jo.secondstep.solid.openclosed.correct.io.Code;
import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;
import jo.secondstep.solid.openclosed.correct.io.Requirements;

public class WritingCode extends BasicOperation {

	@Override
	public String toString() {
		return "Writing Code";
	}
	
	@Override
	public void validateInput() {

		if (!(getInput() instanceof Requirements)) {
			throw new InputInvalidException("Developers need some requirements to be able to write code, not " + getInput());
		}

	}
	
	@Override
	public Output process(Input input) {

		//Writing code ...
		
		return new Code();
	}
}
