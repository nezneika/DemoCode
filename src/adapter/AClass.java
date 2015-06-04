package adapter;

public class AClass implements AInterface {

	String mName;

	@Override
	public void setName(String name) {
		mName = name;
	}

	@Override
	public String getName() {

		return mName;
	}

}
