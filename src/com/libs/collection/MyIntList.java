package com.libs.collection;

public class MyIntList {
	// �ʵ�
	private int[] myArr;
	private int cursor;

	// ������
	public MyIntList(int amount) {
		this.myArr = new int[amount];
		cursor = 0;
	}
	// �޼ҵ�

	public void add(int num) {
		myArr[cursor++] = num;
	}

	public int get(int idx) {
		return myArr[idx];
	}

	public int size() { // �迭�� �� ���̰� �ƴ϶� ���� ���� �迭�� ������ �˰� �;�
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
