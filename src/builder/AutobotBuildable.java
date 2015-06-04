package builder;


public class AutobotBuildable extends CommonRobot implements IRobotBuildable {

	public AutobotBuildable(String name) {
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
