package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoGenExample {

	static final int MAX = 45;
	static final int COUNT = 6;

	public static void main(String[] args) {
		/**
		 * [�ζ� ��ȣ ������] �ߺ�������� �ʴ� HashSet�̿�
		 */

		// ��ȣ ���� ? Math.random()
		// set �ڷᱸ���� �ֱ�

		Set<Integer> set = new HashSet<Integer>(COUNT);
		System.out.println("�̹��� �ζ� ��÷ ��ȣ��~~~!!!");
		int n = 0;

		while (set.size() < COUNT) {
//			int value = (int)(Math.random()*MAX) + 1;
//			set.add(value);
//			System.out.print(value+", ");
			n++; // �ߺ��� �ǳ� �ȵǳ� Ȯ���غ��°�
			set.add((int) (Math.random() * MAX) + 1);
		}
		System.out.println(set + " " + n + "ȸ"); // �̾� ���� ������

		List<Integer> lotto = new LinkedList<>(set);
		Collections.sort(lotto);
		System.out.println(lotto + " " + n + "ȸ");

		// �׳� ���� �غ���
//		for(int i=0; i<=COUNT; i++)	{
//			int value = (int)(Math.random()*MAX) + 1;
//			System.out.println(value);
//		}
	}
}
