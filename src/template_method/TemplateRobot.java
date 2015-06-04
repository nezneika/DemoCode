package template_method;

public abstract class TemplateRobot {

	protected String mName;

	public final void execute() {
		start();
		doSomething();
		test();
		stop();
	}

	public void start() {
		System.out.println(getName() + " Starting ...");
	}

	public void doSomething() {
		System.out.println(getName() + " Doing stuffs ...");
	}

	public void test() {
		System.out.println(getName() + " Testing ...");
	}

	public void stop() {
		System.out.println(getName() + " Stop ...");
	}

	public String getName() {
		return mName;
	}

}
