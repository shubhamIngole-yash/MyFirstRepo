package Assignment6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("nagpur", 1200000);
		map.put("amravati", 4000000);
		map.put("jalgaon", 7800000);
		map.put("akola", 4600000);
		map.put("indore", 3200000);

		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.putAll(map);

		// System.out.println(treemap);

		for (Map.Entry<String, Integer> entry : treemap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

}
