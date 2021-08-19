package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/**
		 * 키(Key)객체, 값(Value) 객체로 구성된 Map.Entry 객체를 저장하는 구조 :Entry는 Map 인터페이스 내부에 선언 된
		 * 중첩 인터페이스 {홍길동=95, 신용권=85, 하헌민=100} {Map.Entry, Map.Entry, Map.Entry} //위에꺼랑
		 * 같은거라 보면 된다
		 * 
		 * 
		 * -키는 중복저장 될 수 없지만 값은 중복저장 가능
		 * 
		 */
		// Map 컬렉션 생성, 이름과 점수를 저장하는 자료구조
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", new Integer(85));
		map.put("홍길동", 80); // 오토박싱
		map.put("하헌민", 100);
		map.put("홍길동", 95); // 키가 같으므로 마지막 저장값으로 대체한다.
		System.out.println("총 Entry 수 : " + map.size());

		// 객체 찾기 : 키 값으로 가져오기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		// 키 검색
		System.out.println("Key 존재 여부 : " + map.containsKey("하헌민") + "\n");

		// 객체 루핑처리 Set<key>이용
		Set<String> keys = map.keySet(); //
		Iterator<String> keyItr = keys.iterator();
		while (keyItr.hasNext()) {
			String key = keyItr.next();
			Integer value = map.get(key);
			System.out.printf("Key: %s, Value: %d\n", key, value);
		}
		keyItr = keys.iterator();
		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());

		// 객체를 하나씩 처리 Set<Map.Entry>이용
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // map.EntrySet 얻기
		Iterator<Map.Entry<String, Integer>> entryItr = entrySet.iterator();

		while (entryItr.hasNext()) {
			Map.Entry<String, Integer> entry = entryItr.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("Key: %s, Value: %d\n", key, value);
		}
		entryItr = entrySet.iterator();
		System.out.println();

		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
