package jo.secondstep.solid.openclosed.correct.op;

import jo.secondstep.solid.openclosed.correct.io.Input;
import jo.secondstep.solid.openclosed.correct.io.Output;

public interface Operation {

	public Output execute(Input input);
	
	public void validateInput();
}
