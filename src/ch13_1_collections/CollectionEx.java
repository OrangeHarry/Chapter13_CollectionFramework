package ch13_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class MyClass {
}

public class CollectionEx {
	public static void main(String[] args) {
		

		// 값을 저장하는 배열
		int[] arr1 = new int[3];
		arr1[0] = 1;
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));

		// 번지를 저장하는 배열
		MyClass[] arr2 = new MyClass[3];
		arr2[0] = new MyClass();
		System.out.println(arr2[0]);
		System.out.println(Arrays.toString(arr2));

		// 배열의 한계

		// Collection 자료구조 등장(파이썬 같은건가...)
		List<String> list1 = new ArrayList<>(); // 이야 list가 좋은거네 완전
		// 참조형 타입만 가능, 기본타입은 wrapper클래스를 이용해서 넣으면 된다.
		list1.add("korea");
		list1.add("1"); // string형이니깐 숫자만 넣으면 당연히 에러가 나징
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(3)); // 원래는 이렇게 써줘야하지만
		list2.add(2); // 오토박싱(이클립스 짱)
		System.out.println(list2.get(1)); //인덱스 1번 값 //언박싱, 형변환을 해주네 이거
		System.out.println(list2);

		List<Character> list3 = new Vector<Character>();
		list3.add('e');
		list3.add('f');
		System.out.println(list3);
		
		List<Float> list4 = new LinkedList<Float>();
		list4.add(0.1f);
		list4.add(1.1f);
		
		List<Double> list5 = new LinkedList<Double>();
		list5.add(0.1);
		list5.add(0.1);
		list5.add(0.1);
		System.out.println(list5);
		
		
		Set<Double> set = new HashSet<Double>(); //Set은 중복을 받아들이지 않는다.
		set.add(0.1);
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(211, "강남");
		map.put(201, "종로");
		System.out.println(map);
		
	}
}
