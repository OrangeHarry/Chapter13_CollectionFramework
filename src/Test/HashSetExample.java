package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�")); // �й��� �����Ƿ� ������� ����

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Student stu1 = (Student) iterator.next();
			System.out.println(stu1.getStudentNum() + " : " + stu1.getName());
		}
		iterator = set.iterator();
	}
}
