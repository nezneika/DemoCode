package template_method;

public class RobotCookie extends TemplateRobot {

	public RobotCookie(String name) {
		mName = name;
	}

	@Override
	public void doSomething() {
		System.out.println(mName + " put some cookie ...");
	}

	@Override
	public void test() {
		System.out.println(mName + " checking ...");
	}

}
