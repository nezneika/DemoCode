public class CharCode {

	public static void main(String[] args) {
		// String checkText = "hamiုပ္ငန္းခြင္ထhami ဲမွာဘယ္ tran လ";// "ぁあぃ゠ァアヽヾ・	ーヽヾヿ";
		String checkText = "က-႟";
		for (int i = 0; i < checkText.length(); i++) {
			System.out.println(checkText.codePointAt(i));
		}

		String regex = "[က-႟]*";

		// if (checkText.matches("^[U+1000-U+109F]*$")) {
		if (checkText.matches("(.*)[က-႟](.*)")) {
			// if (checkText.matches(regex)) {
			System.out.println("oh it matches");
		}
	}
}
