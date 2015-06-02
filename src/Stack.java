public class Stack {

	public static void main(String args[]) {
		java.util.Stack<String> stack = new java.util.Stack<>();
		stack.add("1");
		stack.add("2");
		stack.add("3");
		System.out.println(stack);

		System.out.println(stack.peek());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println(stack.push("4"));
		System.out.println(stack);

		/*
		 * add() and push() both add a new element to stack,
		 * but push() is more stackable than add(), which is function from Vector,
		 * and push() return the element itself, while add() only return boolean
		 */

	}

}
