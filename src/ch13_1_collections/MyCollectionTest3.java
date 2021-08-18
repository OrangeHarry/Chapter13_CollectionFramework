package ch13_1_collections;

import com.libs.collection.MyList;
import com.libs.collection.MySmartList;

class MySecondClass{}

public class MyCollectionTest3 {
	public static void main(String[] args) {
		
		
		MyList<String> list = new MySmartList<String>(); 
		
		list.add("1");
		list.add("2");
		list.add("★");
		
		System.out.println(list);
		System.out.println("list[2]의 값 : "+list.get(2));
		System.out.println("size: "+list.size());
		System.out.println("=================================");
		
		MyList<Integer> list2 = new MySmartList<>(); 
		
		list2.add(new Integer(100));
		list2.add(300);//Auto Boxing
		
		System.out.println(list2);
		System.out.println("list2[2]의 값 : "+list2.get(2));
		System.out.println("size: "+list2.size());
		System.out.println("=================================");
		
		MyList<Object> list3 = new MySmartList<>(); 
		
		list3.add("dsad");
		list3.add(4563);
		list3.add(4.5f);
		list3.add('A');//Auto Boxing(new Character('A');
		list3.add(new MySecondClass());
		
		System.out.println(list3);
		System.out.println("list3[2]의 값 : "+list3.get(2));
		System.out.println("size: "+list3.size());
		System.out.println("=================================");
		
	}
}
//list2의 생성형태를 제일 많이 사용한다.