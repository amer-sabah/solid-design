package jo.secondstep.solid.openclosed.correct.op;

import jo.secondstep.solid.openclosed.correct.InputInvalidException;
import jo.secondstep.solid.openclosed.correct.io.Build;
import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;
import jo.secondstep.solid.openclosed.correct.io.Product;

public class Testing extends BasicOperation {

	@Override
	public void validateInput() {

		if (!(getInput() instanceof Build)) {
			throw new InputInvalidException("Input should be a build to produce a verified product, not " + getInput());
		}

	}
	
	@Override
	public Output process(Input input) {

		//Testing...
		
		return new Product();
	}
	
	@Override
	public String toString() {
		return "Testing";
	}

}
