package jo.secondstep.solid.openclosed.correct.op;

import jo.secondstep.solid.openclosed.correct.InputInvalidException;
import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;

public abstract class BasicOperation implements Operation {
	
	private Input input;

	@Override
	final public Output execute(Input input) {

		this.input = input;
		
		try {
			validateInput();
			
			System.out.print(input + " -> " + this);
		} catch (InputInvalidException exception) {
			throw exception;
		}

		Output output = process(input);

		System.out.println(" -> " + output);

		return output;
	}

	@Override
	public String toString() {
		return "Unknow";
	}
	
	public Input getInput() {
		return input;
	}

	public abstract Output process(Input input);

}
