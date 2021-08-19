package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/**
		 * Ű(Key)��ü, ��(Value) ��ü�� ������ Map.Entry ��ü�� �����ϴ� ���� :Entry�� Map �������̽� ���ο� ���� ��
		 * ��ø �������̽� {ȫ�浿=95, �ſ��=85, �����=100} {Map.Entry, Map.Entry, Map.Entry} //��������
		 * �����Ŷ� ���� �ȴ�
		 * 
		 * 
		 * -Ű�� �ߺ����� �� �� ������ ���� �ߺ����� ����
		 * 
		 */
		// Map �÷��� ����, �̸��� ������ �����ϴ� �ڷᱸ��
		Map<String, Integer> map = new HashMap<>();

		// ��ü ����
		map.put("�ſ��", new Integer(85));
		map.put("ȫ�浿", 80); // ����ڽ�
		map.put("�����", 100);
		map.put("ȫ�浿", 95); // Ű�� �����Ƿ� ������ ���尪���� ��ü�Ѵ�.
		System.out.println("�� Entry �� : " + map.size());

		// ��ü ã�� : Ű ������ ��������
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		// Ű �˻�
		System.out.println("Key ���� ���� : " + map.containsKey("�����") + "\n");

		// ��ü ����ó�� Set<key>�̿�
		Set<String> keys = map.keySet(); //
		Iterator<String> keyItr = keys.iterator();
		while (keyItr.hasNext()) {
			String key = keyItr.next();
			Integer value = map.get(key);
			System.out.printf("Key: %s, Value: %d\n", key, value);
		}
		keyItr = keys.iterator();
		System.out.println();

		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());

		// ��ü�� �ϳ��� ó�� Set<Map.Entry>�̿�
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // map.EntrySet ���
		Iterator<Map.Entry<String, Integer>> entryItr = entrySet.iterator();

		while (entryItr.hasNext()) {
			Map.Entry<String, Integer> entry = entryItr.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("Key: %s, Value: %d\n", key, value);
		}
		entryItr = entrySet.iterator();
		System.out.println();

		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());
	}
}
