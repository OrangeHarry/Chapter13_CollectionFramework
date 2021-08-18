package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Member 객체를 중복없이 저장하는 HashSet
public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("하헌민", 29)); // 인스턴스는 다르지만 내부 데이터가
		set.add(new Member("오벼리", 17));
		set.add(new Member("하헌민", 29)); // 동일하므로 객체 1개만 저장
		set.add(new Member("오벼리", 30));

		System.out.println("총 객체 수 : " + set.size());
		System.out.println(set);

		Iterator<Member> itr = set.iterator();
		while (itr.hasNext()) {
			Member m = itr.next();
			System.out.println(m.name + "\t" + m.age);
		}
		// 작업완료후 초기화
		itr = set.iterator();
	}
}
