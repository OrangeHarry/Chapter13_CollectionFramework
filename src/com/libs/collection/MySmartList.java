package com.libs.collection;

public class MySmartList<E> implements MyList<E> {

	// [�ʵ�]
	// ��Ҹ� ������ �迭
	private Object[] elementData;

	// ���� �迭�� �� ����
	private int capacity;

	// �÷� �� �迭�� �뷮
	private final int amount; 

	// �迭 ����� ���� ��ġ��
	private int cursor;

	// [������]
	MySmartList(int amount) {
		this.amount = amount;
		capacity = amount;
		elementData = new Object[amount];
		cursor = 0;
	}

	public MySmartList() {
		this(3);
	}

	// [�޼ҵ�]
	@Override
	public void add(E e) {
		if (capacity <= cursor) {
			Object[] overArr = new Object[capacity + amount];
			System.arraycopy(elementData, 0, overArr, 0, elementData.length);

			elementData = overArr;
			capacity += amount;
		}
		elementData[cursor++] = e;
	}

	@SuppressWarnings("unchecked") // �׳� ��� ǥ�þ�
	@Override
	public E get(int idx) {
		return (E) elementData[idx]; // ����Ÿ���� Object�ϱ� EŸ������ ����ȯ
	}

	@Override
	public int size() {
		return cursor;
	}

	@Override
	public void remove(int index) {
		if (index != cursor - 1) {
			System.arraycopy(elementData, index + 1, elementData, index, (cursor - 1) - index);
		}
		elementData[cursor - 1] = 0;
		cursor--;
	}

	@Override
	public void clear() {
		elementData = new Object[amount];
		this.capacity = this.amount;
		cursor = 0;
	}

	// ��� ���
	@Override
	public String toString() {
		String tmp = "";
		for (Object e : elementData) { // ���� for��
			tmp += (E) e + ", ";
		}
		return "[" + tmp + "]";
	}
}
