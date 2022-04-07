package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("경운1");
		strSet.add("경운2");
		strSet.add("경운3");
		strSet.add("경운4");
		
		System.out.println(strSet);
		strSet.remove("경운3");
		
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("경운4")) {
				System.out.println(str);
			}
		}
	}
}
