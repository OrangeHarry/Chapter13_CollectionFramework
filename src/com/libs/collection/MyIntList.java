package com.libs.collection;

/**
 * 2021.08.18 java 211기 >>> 하헌민 int[] 관리하기 위한 자료구조
 * 
 * @author bitcamp
 *
 */
public class MyIntList {
	// [필드]
	// 요소를 저장할 배열
	private int[] myArr;

	// 현재 배열의 총 길이
	private int capacity;

	// 늘려 줄 배열의 용량
	private final int amount;

	// 배열 요소의 현재 위치값
	private int cursor;

	// [생성자]
	public MyIntList(int amount) {
		this.myArr = new int[amount];
		this.amount = amount;
		this.capacity = this.amount;
		this.cursor = 0;
	}

	// [메소드]
	// 요소 추가
	public void add(int num) {
		// 현재 용량을 초과하는지 조건 검사
		if (capacity <= cursor) { // 용량을 초과하면 배열복사 진행
			// 새로운 배열 생성
			int[] overArr = new int[capacity + amount];
			// 요소 복사
//			for(int i=0; i<myArr.length; i++) {
//				overArr[i] = myArr[i]
//			}
			System.arraycopy(myArr, 0, overArr, 0, myArr.length);
			// 복사 후 적용을 해야지(참조 변경)
			myArr = overArr;

			// 배열 용량 업데이트
//			capacity = capacity+amount;
			capacity += amount;
		}
		myArr[cursor++] = num;
	}

	// 요소 삭제
	public void remove(int index) {
		// 삭제하고자하는 index가 마지막이면 0으로 초기화
		if (index != cursor - 1) {
			System.arraycopy(myArr, index + 1, myArr, index, (cursor - 1) - index);
		}
		// 마지막 데이터 초기화 //하나 없애고 복사해서 온거니깐 가장 마지막꺼를 0으로 만들어줘야 땡겨온거처럼 되지
		myArr[cursor - 1] = 0;
		// 현재 위치 재설정
		cursor--;
	}

	// 요소 얻기
	public int get(int idx) {
		return myArr[idx];
	}

	// 요소 갯수
	public int size() { // 배열의 총 길이가 아니라 값을 갖는 배열의 갯수를 알고 싶어
		return cursor;
	}

	// 요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for (int i : myArr) {
			tmp += i + ",";
		}
		return "[" + tmp + "]";
	}

	// 요소 초기화
	public void clear() {
		myArr = new int[amount];
	    this.capacity = this.amount;
	    cursor = 0;
	}
}
