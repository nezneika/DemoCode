import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		String str = "This is a string that needed to be counted numbers of characters";

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				continue;
			}

			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Character key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}

		// Iterator iterator = map.entrySet().iterator();
		// while (iterator.hasNext()) {
		// Map.Entry mapEntry = (Map.Entry) iterator.next();
		// System.out.println(mapEntry.getKey() + ":" + mapEntry.getValue());
		// }
		//
		// for (Object key : map.keySet()) {
		// System.out.println("Key : " + key.toString() + " Value : " + map.get(key));
		// }

	}
}
