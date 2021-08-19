package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//아이디 비번 검사하기
public class HashtableExample {
	public static void main(String[] args) {
		/**
		 * [Hashtable] implements Map -동기화(sycronized)된 메소드로 구성 : 하나의 스레드가 실행 완료해야만 다른
		 * 스레드 접근 가능
		 * 
		 */

		Map<String, String> map = new Hashtable<>();
		map.put("spring", "345"); // 아이디와 비번을 미리 저장
		map.put("summer", "678");
		map.put("fall", "91011");
		map.put("winter", "1212");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("이이디와 비번을 입력해주세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine().trim(); // 키보드로 입력한 아이디를 읽음

			System.out.print("비밀번호 : ");
			String pw = scanner.nextLine().trim();

			System.out.println();

			// 아이디가 없다면
			if (!map.containsKey(id)) {// 아이디인 키가 존재하는지 확인
				System.out.println("입력하신 id가 존재하지 않습니다. 다시 입력해주세요");
				continue;
			} else {// 아이디가 있다면
				if (!map.get(id).equals(pw)) {// 비밀번호 불일치
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				} else {// 비번일치
					System.out.println("로그인되었습니다.");
					break;
				}
			}
		}
	}
}
