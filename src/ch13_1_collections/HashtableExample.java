package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//���̵� ��� �˻��ϱ�
public class HashtableExample {
	public static void main(String[] args) {
		/**
		 * [Hashtable] implements Map -����ȭ(sycronized)�� �޼ҵ�� ���� : �ϳ��� �����尡 ���� �Ϸ��ؾ߸� �ٸ�
		 * ������ ���� ����
		 * 
		 */

		Map<String, String> map = new Hashtable<>();
		map.put("spring", "345"); // ���̵�� ����� �̸� ����
		map.put("summer", "678");
		map.put("fall", "91011");
		map.put("winter", "1212");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ����� �Է����ּ���");
			System.out.print("���̵� : ");
			String id = scanner.nextLine().trim(); // Ű����� �Է��� ���̵� ����

			System.out.print("��й�ȣ : ");
			String pw = scanner.nextLine().trim();

			System.out.println();

			// ���̵� ���ٸ�
			if (!map.containsKey(id)) {// ���̵��� Ű�� �����ϴ��� Ȯ��
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				continue;
			} else {// ���̵� �ִٸ�
				if (!map.get(id).equals(pw)) {// ��й�ȣ ����ġ
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				} else {// �����ġ
					System.out.println("�α��εǾ����ϴ�.");
					break;
				}
			}
		}
	}
}
