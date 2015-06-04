package builder;


public class MegatronBuildable extends CommonRobot implements IRobotBuildable {

	public MegatronBuildable(String name) {
		mName = name;
	}

	@Override
	public void doSomething() {
		System.out.println(mName + " kills others ...");
	}

	@Override
	public void test() {
		System.out.println(mName + " making mess ...");
	}

}
