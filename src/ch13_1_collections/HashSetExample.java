package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/**[HashSet] implements set
		 * 
		 * List�÷���(�������̽�)�� ��ü�� ������ ����������
		 *  -Set�÷����� 
		 * 
		 */
		Set<String> set = new HashSet<String>();

		//hashcode() + equals()�� �̿��� ��
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); 
		set.add("iBATIS");

		int size = set.size(); // ����� ��ü �� ���
		System.out.println("�� ��ü �� : " + size);
		
		//�ݺ��ڸ� �̿��� ����
		Iterator<String> itr = set.iterator(); // �ݺ��� ���
		while (itr.hasNext()) {// ��ü ����ŭ ����
			String str = itr.next(); // 1���� ��ü�� ������
			System.out.println("\t" + str);
		}
//		itr = set.iterator(); // �ݺ��� �ٽ� ��� 
		                     // �ѹ� �������� ������ ���������� �ٽ� �ʱ�ȭ���� 
		
		set.remove("JDBC"); // 1���� ��ü
		set.remove("iBATIS"); // 1���� ��ü

		System.out.println("�� ��ü �� : " + set.size());
		System.out.println("==============================");

		
		itr = set.iterator(); // �ݺ��� �ٽ� ��� , �׳� ����ó�� ��� �Ǽ����� �ʴ´�! 
		for (String str : set) { // ��ü ����ŭ ����
			System.out.println("\t" + str);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("��� ���� ["+set.size()+"]");
		}
	}
}
