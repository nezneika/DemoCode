package builder;

/**
 * Improve from Template, when all steps in execute() is decided by runtime (customer)
 */
public class BuilderTest {

	public static void main(String[] args) {

		RobotBuilder builder = new RobotBuilder(1, "Bumblebee");
		// cteate algorithm as customer wants
		builder.addTest();
		builder.addDoSomething();
		builder.addStart();
		builder.addStop();

		AutobotBuildable robot1 = (AutobotBuildable) builder.createRobot();
		robot1.execute();

		// other Robot

		RobotBuilder builder2 = new RobotBuilder(0, "Jet");
		// cteate algorithm as customer wants
		builder2.addStart();
		builder2.addDoSomething();
		builder2.addTest();
		builder2.addStop();

		MegatronBuildable robot2 = (MegatronBuildable) builder2.createRobot();
		robot2.execute();

	}
}
