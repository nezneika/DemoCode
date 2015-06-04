package adapter;

public class AdapterTest {

	public static void main(String[] args) {
		AClass a = new AClass();
		a.setName("Hami Nezneika");

		AToBAdapter a2bAdapter = new AToBAdapter(a);
		System.out.println(a2bAdapter.getFirstName());
		System.out.println(a2bAdapter.getLastName());
	}
}
