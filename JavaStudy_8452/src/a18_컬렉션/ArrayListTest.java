package a18_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();

		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);

		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		

		System.out.println(intList.size());
		System.out.println(strList.size());

		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i));
		}
		System.out.println();
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.print(strList.get(i));
		}
		System.out.println();
		
		for(int num : intList) {
			System.out.println(num);
		}
		
		strList.set(2, "q");
		strList.set(3, "q");
		strList.set(4, "q");
		
		System.out.println();
		for(String str : strList) {
			System.out.println(str);
		}
		//리스트가 비어있지 않으면 계속 반복하며 가장 뒤에 있는 값을 삭제
//		while(!strList.isEmpty()) {
//			strList.remove(strList.size()-1);
//			System.out.println();
//			System.out.println(strList);
//		}
		
		//리스트에 q가 존재하면 해당 위치의 값을 삭제
		while(strList.contains("q")) {
			System.out.println(strList);
			System.out.println(strList.remove("q"));
		}
		System.out.println(strList);
		
		if(!strList.isEmpty()) {
			strList.clear();
		}
		System.out.println(strList);
		
	}
}
