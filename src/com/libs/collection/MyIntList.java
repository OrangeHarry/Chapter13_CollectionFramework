package com.libs.collection;

public class MyIntList {
	// 필드
	private int[] myArr;
	private int cursor;

	// 생성자
	public MyIntList(int amount) {
		this.myArr = new int[amount];
		cursor = 0;
	}
	// 메소드

	public void add(int num) {
		myArr[cursor++] = num;
	}

	public int get(int idx) {
		return myArr[idx];
	}

	public int size() { // 배열의 총 길이가 아니라 값을 갖는 배열의 갯수를 알고 싶어
		return cursor;
	}

	@Override
	public String toString() {
		String tmp = "";
		for (int i : myArr) {
			tmp += i + ",";
		}
		return "[" + tmp + "]";
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
