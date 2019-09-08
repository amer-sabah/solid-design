package jo.secondstep.solid.openclosed.wrong.op;

import jo.secondstep.solid.openclosed.wrong.io.Build;
import jo.secondstep.solid.openclosed.wrong.io.Code;

public class GenerateProductBuild implements Operation {

	private Code code;

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Generate Product Build";
	}

	@Override
	public Object execute() {
		return new Build();
	}
}
