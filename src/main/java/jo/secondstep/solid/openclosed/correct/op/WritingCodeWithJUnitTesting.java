package jo.secondstep.solid.openclosed.correct.op;

import jo.secondstep.solid.openclosed.correct.io.CodeWithUnitTesting;
import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;

public class WritingCodeWithJUnitTesting extends WritingCode {

	@Override
	public String toString() {
		return "Writing Code with JUnit";
	}
	
	@Override
	public Output process(Input input) {

		//Writing code with JUnit Testing ...
		
		return new CodeWithUnitTesting();
	}
}
