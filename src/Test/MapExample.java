package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 98);
		map.put("Harry", 100);

		String name = null; // �ְ������� ���� ID����
		int maxScore = 0; // �ְ����� ����
		int totalScore = 0; // ���� �հ� ����

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet.size());

		for (Map.Entry<String, Integer> entry : entrySet) {// ���� for���� �迭������ �����ϸ� �ڿ��� �迭�����̸�, �տ��� �迭������ Ÿ�԰� �̸�(�����)����
															// �Է��Ѵ�.
//			System.out.println(entry.getValue()); //�ؽ��� ������ΰ� �ƴ� �������� ���� ����Ǿ��ִ�.
			if (entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore / map.size();

		System.out.println("������� : " + avgScore);
		System.out.println("�ְ����� : " + maxScore);
		System.out.println("�ְ������� ���� ���̵� : " + name);
	}
}