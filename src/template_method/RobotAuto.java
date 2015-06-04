package template_method;

public class RobotAuto extends TemplateRobot {

	public RobotAuto(String name) {
		mName = name;
	}

	@Override
	public void doSomething() {
		System.out.println(mName + " doing stuffs ...");
	}

	@Override
	public void test() {
		System.out.println(mName + " testing ...");
	}

}
