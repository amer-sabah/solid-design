package jo.secondstep.solid.openclosed.correct.op;

import jo.secondstep.solid.openclosed.correct.InputInvalidException;
import jo.secondstep.solid.openclosed.correct.io.Build;
import jo.secondstep.solid.openclosed.correct.io.Code;
import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;

public class GenerateProductBuild extends BasicOperation {

	@Override
	public String toString() {
		return "Generate Product Build";
	}

	@Override
	public void validateInput() {

		if (!(getInput() instanceof Code)) {
			throw new InputInvalidException("Input should be Code to generate the product build, not " + getInput());
		}

	}

	@Override
	public Output process(Input input) {

		//Building...

		return new Build();
	}
}
