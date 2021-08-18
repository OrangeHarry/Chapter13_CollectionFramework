package ch13_1_collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/**
		 * [Vector] implements List
		 * 
		 * -ArrayList�� ������ ���α��� -����ȭ��(sychronized) �޼ҵ�� ���� :��Ƽ �����尡 ���ÿ� Vector�޼ҵ� ���� �Ұ�,
		 * �ϳ��� �����尡 �޼ҵ� ������ �Ϸ��ؾ߸� �ٸ� �����尡 �޼ҵ� ���డ��(thread safe)
		 */

		List<Board> list = new Vector<Board>();

		// Board ��ü�� ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		System.out.println(list);
		System.out.println(list.get(0).getContent());

		list.remove(2); // 2�� �ε��� ��ü(����3) ����(���� �ε����� 1�� ������ �����)
		list.remove(3); // 3���ε���(����5) ����

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.printf("%s\t%s\t%s\n", board.getSubject(), board.getContent(), board.getWriter());
		}                                
	}
}
