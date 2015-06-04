package builder;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CommonRobot {

	protected String mName;

	// public final void execute() {
	// start();
	// doSomething();
	// test();
	// stop();
	// }

	ArrayList<Integer> actions;

	public void loadActions(ArrayList a) {
		actions = a;
	}

	/**
	 * Rewrite execute() of Template to execute() in Builder
	 */
	public final void execute() {
		Iterator itr = actions.iterator();
		while (itr.hasNext()) {
			switch ((Integer) itr.next()) {
				case 1:
					start();
					break;

				case 2:
					doSomething();
					break;

				case 3:
					test();
					break;

				case 4:
					stop();
					break;

				default:
					break;
			}
		}
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
