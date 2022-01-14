package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("1","One");
		map.put("2", "Two");
		map.put("3","Three");
		int size = map.size();
		System.out.println(size);
		System.out.println(map.get("1"));
		System.out.println(map.containsKey("4"));
		System.out.println(map.containsValue("One"));
		System.out.println(map.entrySet());
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println("Remove "+map.remove("1"));
		System.out.println(map.remove("1", "Two"));
		System.out.println(map.values());
		map.clear();
		System.out.println(map.entrySet());
		
	}

}
