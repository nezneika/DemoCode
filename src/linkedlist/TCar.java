package linkedlist;

/**
 * Aim to create a simple linked list and list all the items, while only know the first item
 */
public class TCar {

	private Object value;
	private TCar next;

	public TCar(Object val) {
		next = null;
		value = val;
	}

	/**
	 * append() function is used with TCat(Object val) constructor
	 * 
	 * @param nextCar
	 */
	public void append(TCar nextCar) {
		TCar current = this;

		while (current.next != null) {
			// move to next Car
			current = current.next;
		}

		// now is the last car
		current.next = nextCar;
		return;
	}

	/**
	 * This constructor does not need to use the append() function
	 * just use recursion to add nextCar inside another
	 * 
	 * @param val
	 * @param nextCar
	 */
	public TCar(Object val, TCar nextCar) {
		next = nextCar;
		value = val;
	}

	/**
	 * List all items when know only the first item
	 */
	public void listAllItems() {
		TCar current = this;
		if (this.next == null) {
			System.out.println("Only 1 toa " + value);
			return;
		}

		while (current.next != null) { // move to next until the end
			System.out.println("val: " + current.value.toString());
			// move to next Car
			current = current.next;
		}
	}
}
