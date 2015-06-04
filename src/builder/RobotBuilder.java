package builder;

import java.util.ArrayList;

public class RobotBuilder implements IRobotBuilder {

	CommonRobot robot;
	ArrayList<Integer> actions;

	public RobotBuilder(int type, String name) {
		if (type == 1) {
			robot = new AutobotBuildable(name);
		} else {
			robot = new MegatronBuildable(name);
		}
		actions = new ArrayList<Integer>();
	}

	@Override
	public void addStart() {
		actions.add(new Integer(1));
	}

	@Override
	public void addDoSomething() {
		actions.add(new Integer(2));
	}

	@Override
	public void addTest() {
		actions.add(new Integer(3));
	}

	@Override
	public void addStop() {
		actions.add(new Integer(4));
	}

	/**
	 * with loadActions(), createRobot() is key of Builder Design Pattern
	 */
	public CommonRobot createRobot() {
		robot.loadActions(actions);
		return robot;
	}
}
