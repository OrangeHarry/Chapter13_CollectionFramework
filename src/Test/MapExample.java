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

		String name = null; // 최고점수를 받은 ID저장
		int maxScore = 0; // 최고점수 저장
		int totalScore = 0; // 점수 합계 저장

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet.size());

		for (Map.Entry<String, Integer> entry : entrySet) {// 향상된 for문은 배열에서만 가능하며 뒤에는 배열변수이름, 앞에는 배열변수의 타입과 이름(만들기)으로
															// 입력한다.
//			System.out.println(entry.getValue()); //해쉬라서 순서대로가 아닌 랜덤으로 값이 저장되어있다.
			if (entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore / map.size();

		System.out.println("평균점수 : " + avgScore);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}
}
