package decorator;

public class Monitor extends ComponentDecorator {

	Computer c;

	public Monitor(Computer c) {
		this.c = c;
	}

	@Override
	public String description() {
		return c.description() + " and a monitor";
	}
}
