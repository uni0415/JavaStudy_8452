package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "경운1");
		hashMap.put("나", "경운2");
		hashMap.put("다", "경운3");
		hashMap.put("라", "경운4");
		hashMap.put("마", "경운5");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println();
		System.out.println(hashMap.containsValue("경운5"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "경운6"));
		System.out.println();
	}
}
