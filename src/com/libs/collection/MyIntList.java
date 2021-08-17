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
		if (myArr.length < num) {
			try {
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("�迭�� �ε��� ������ �ʰ��߽��ϴ�. �ٽ� �������ּ���");
			}
		}
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

	public boolean remove(int index) {
		return false;
	}

	public int clear(int index) {
		myArr[index] = 0;
		return myArr[index];

	}
}
