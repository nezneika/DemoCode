package decorator;

public class Cd extends ComponentDecorator {

	Computer c;

	public Cd(Computer c) {
		this.c = c;
	}

	@Override
	public String description() {
		return c.description() + " and a cd";
	}
}
