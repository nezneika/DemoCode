package decorator;

public class Disk extends ComponentDecorator {

	Computer c;

	public Disk(Computer c) {
		this.c = c;
	}

	@Override
	public String description() {
		return c.description() + " and a disk";
	}

}
