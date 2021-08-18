package ch13_1_collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/**
		 * [Vector] implements List
		 * 
		 * -ArrayList와 동일한 내부구조 -동기화된(sychronized) 메소드로 구성 :멀티 스레드가 동시에 Vector메소드 실행 불가,
		 * 하나의 스레드가 메소드 실행을 완료해야만 다른 스레드가 메소드 실행가능(thread safe)
		 */

		List<Board> list = new Vector<Board>();

		// Board 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		System.out.println(list);
		System.out.println(list.get(0).getContent());

		list.remove(2); // 2번 인덱스 객체(제목3) 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(3); // 3번인덱스(제목5) 삭제

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.printf("%s\t%s\t%s\n", board.getSubject(), board.getContent(), board.getWriter());
		}                                
	}
}
