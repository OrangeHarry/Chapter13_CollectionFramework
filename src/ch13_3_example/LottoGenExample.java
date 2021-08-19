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
		 * [로또 번호 생성기] 중복저장되지 않는 HashSet이용
		 */

		// 번호 생성 ? Math.random()
		// set 자료구조에 넣기

		Set<Integer> set = new HashSet<Integer>(COUNT);
		System.out.println("이번주 로또 당첨 번호는~~~!!!");
		int n = 0;

		while (set.size() < COUNT) {
//			int value = (int)(Math.random()*MAX) + 1;
//			set.add(value);
//			System.out.print(value+", ");
			n++; // 중복이 되나 안되나 확인해보는거
			set.add((int) (Math.random() * MAX) + 1);
		}
		System.out.println(set + " " + n + "회"); // 이야 완전 간단해

		List<Integer> lotto = new LinkedList<>(set);
		Collections.sort(lotto);
		System.out.println(lotto + " " + n + "회");

		// 그냥 내가 해본거
//		for(int i=0; i<=COUNT; i++)	{
//			int value = (int)(Math.random()*MAX) + 1;
//			System.out.println(value);
//		}
	}
}
