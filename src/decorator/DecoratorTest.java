package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println(com.description());

		com = new Disk(com);
		com = new Cd(com);
		com = new Monitor(com);

		System.out.println(com.description());
	}
}
