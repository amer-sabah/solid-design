package jo.secondstep.solid.openclosed.wrong.op;

import jo.secondstep.solid.openclosed.wrong.io.Build;
import jo.secondstep.solid.openclosed.wrong.io.Product;

public class Testing implements Operation {
	
	private Build build;

	public Build getBuild() {
		return build;
	}

	public void setBuild(Build build) {
		this.build = build;
	}

	@Override
	public String toString() {
		return "Testing";
	}

	@Override
	public Product execute() {
		return new Product();
	}

}
