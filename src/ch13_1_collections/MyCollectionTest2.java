package ch13_1_collections;

import com.libs.collection.MyIntList;

public class MyCollectionTest2 {
	public static void main(String[] args) {
		
		MyIntList list = new MyIntList(3);
		
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		//ArrayIndexOutBoundsException 해결하기
		list.add(7); //추가로 증가되는 문제

		//삭제 해결하기
		//[1,3,5, ] 3을 삭제시 --> [1,5, ]
		list.remove(1);
		
		//배열의 값을 완전히 초기값으로 돌리려는 메소드(0인상태지 뭐)
		list.clear();
		
		System.out.println(list);
		System.out.println("list[2]의 값 : "+list.get(2));
		System.out.println("size: "+list.size());
		System.out.println("=================================");
	}
}
