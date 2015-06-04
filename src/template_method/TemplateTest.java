package template_method;

public class TemplateTest {

	public static void main(String[] args) {

		RobotAuto robotAuto = new RobotAuto("Autobots");
		robotAuto.execute();

		RobotCookie robotCookie = new RobotCookie("Megatron");
		robotCookie.execute();
	}
}
