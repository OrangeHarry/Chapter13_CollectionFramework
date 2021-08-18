package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/**[HashSet] implements set
		 * 
		 * List컬렉션(인터페이스)은 객체의 순서를 유지하지만
		 *  -Set컬렉션은 
		 * 
		 */
		Set<String> set = new HashSet<String>();

		//hashcode() + equals()를 이용한 비교
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); 
		set.add("iBATIS");

		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체 수 : " + size);
		
		//반복자를 이용한 루핑
		Iterator<String> itr = set.iterator(); // 반복자 얻기
		while (itr.hasNext()) {// 객체 수만큼 루핑
			String str = itr.next(); // 1개의 객체를 가져옴
			System.out.println("\t" + str);
		}
//		itr = set.iterator(); // 반복자 다시 얻기 
		                     // 한번 돌렸으면 무조건 습관적으로 다시 초기화하자 
		
		set.remove("JDBC"); // 1개의 객체
		set.remove("iBATIS"); // 1개의 객체

		System.out.println("총 객체 수 : " + set.size());
		System.out.println("==============================");

		
		itr = set.iterator(); // 반복자 다시 얻기 , 그냥 위에처럼 써야 실수하지 않는다! 
		for (String str : set) { // 객체 수만큼 루핑
			System.out.println("\t" + str);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음 ["+set.size()+"]");
		}
	}
}
