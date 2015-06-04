package adapter;

public class AToBAdapter implements BInterface {

	private AClass mAObject;
	private String mFirstName;
	private String mLastName;

	public AToBAdapter(AClass a) {
		mAObject = a;
		mFirstName = mAObject.getName().split(" ")[0];
		mLastName = mAObject.getName().split(" ")[1];
	}

	@Override
	public void setFirstName(String fn) {
		mFirstName = fn;
	}

	@Override
	public void setLastName(String ln) {
		mLastName = ln;
	}

	@Override
	public String getFirstName() {

		return mFirstName;
	}

	@Override
	public String getLastName() {

		return mLastName;
	}

}
