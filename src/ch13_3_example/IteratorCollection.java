package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		itr = list.iterator(); //다시한번 초기화 //초기화를 생략하면 그 다음엔 출력이 안된다.
		System.out.println();
		System.out.println("================================");
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}
}
