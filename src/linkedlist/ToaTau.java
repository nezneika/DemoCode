package linkedlist;

public class ToaTau {

	public static void main(String[] args) {
		// TCar cars = new TCar("Apple");
		// cars.listAllItems();

		// appends more normally
		// cars.append(new TCar("Banana"));
		// cars.append(new TCar("Cat"));
		// cars.append(new TCar("Dog"));
		// cars.append(new TCar("Elephant"));
		// cars.append(new TCar("Fun"));
		// cars.append(new TCar("Ground"));

		// recursion to add all items to list
		// and do not need to use append()
		TCar cars = new TCar("Apple", new TCar("Banana", new TCar("Cat", new TCar("Dog", new TCar("Elephant", new TCar(
				"Fun", new TCar("Ground")))))));

		cars.listAllItems();
	}
}
