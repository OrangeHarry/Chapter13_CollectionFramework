package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Member ��ü�� �ߺ����� �����ϴ� HashSet
public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("�����", 29)); // �ν��Ͻ��� �ٸ����� ���� �����Ͱ�
		set.add(new Member("������", 17));
		set.add(new Member("�����", 29)); // �����ϹǷ� ��ü 1���� ����
		set.add(new Member("������", 30));

		System.out.println("�� ��ü �� : " + set.size());
		System.out.println(set);

		Iterator<Member> itr = set.iterator();
		while (itr.hasNext()) {
			Member m = itr.next();
			System.out.println(m.name + "\t" + m.age);
		}
		// �۾��Ϸ��� �ʱ�ȭ
		itr = set.iterator();
	}
}
