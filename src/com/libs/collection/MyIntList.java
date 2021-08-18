package com.libs.collection;

/**
 * 2021.08.18 java 211�� >>> ����� int[] �����ϱ� ���� �ڷᱸ��
 * 
 * @author bitcamp
 *
 */
public class MyIntList {
	// [�ʵ�]
	// ��Ҹ� ������ �迭
	private int[] myArr;

	// ���� �迭�� �� ����
	private int capacity;

	// �÷� �� �迭�� �뷮
	private final int amount;

	// �迭 ����� ���� ��ġ��
	private int cursor;

	// [������]
	public MyIntList(int amount) {
		this.myArr = new int[amount];
		this.amount = amount;
		this.capacity = this.amount;
		this.cursor = 0;
	}

	// [�޼ҵ�]
	// ��� �߰�
	public void add(int num) {
		// ���� �뷮�� �ʰ��ϴ��� ���� �˻�
		if (capacity <= cursor) { // �뷮�� �ʰ��ϸ� �迭���� ����
			// ���ο� �迭 ����
			int[] overArr = new int[capacity + amount];
			// ��� ����
//			for(int i=0; i<myArr.length; i++) {
//				overArr[i] = myArr[i]
//			}
			System.arraycopy(myArr, 0, overArr, 0, myArr.length);
			// ���� �� ������ �ؾ���(���� ����)
			myArr = overArr;

			// �迭 �뷮 ������Ʈ
//			capacity = capacity+amount;
			capacity += amount;
		}
		myArr[cursor++] = num;
	}

	// ��� ����
	public void remove(int index) {
		// �����ϰ����ϴ� index�� �������̸� 0���� �ʱ�ȭ
		if (index != cursor - 1) {
			System.arraycopy(myArr, index + 1, myArr, index, (cursor - 1) - index);
		}
		// ������ ������ �ʱ�ȭ //�ϳ� ���ְ� �����ؼ� �°Ŵϱ� ���� ���������� 0���� �������� ���ܿ°�ó�� ����
		myArr[cursor - 1] = 0;
		// ���� ��ġ �缳��
		cursor--;
	}

	// ��� ���
	public int get(int idx) {
		return myArr[idx];
	}

	// ��� ����
	public int size() { // �迭�� �� ���̰� �ƴ϶� ���� ���� �迭�� ������ �˰� �;�
		return cursor;
	}

	// ��� ���
	@Override
	public String toString() {
		String tmp = "";
		for (int i : myArr) {
			tmp += i + ",";
		}
		return "[" + tmp + "]";
	}

	// ��� �ʱ�ȭ
	public void clear() {
		myArr = new int[amount];
	    this.capacity = this.amount;
	    cursor = 0;
	}
}
