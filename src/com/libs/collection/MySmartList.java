package com.libs.collection;

public class MySmartList<E> implements MyList<E> {

	// [필드]
	// 요소를 저장할 배열
	private Object[] elementData;

	// 현재 배열의 총 길이
	private int capacity;

	// 늘려 줄 배열의 용량
	private final int amount; 

	// 배열 요소의 현재 위치값
	private int cursor;

	// [생성자]
	MySmartList(int amount) {
		this.amount = amount;
		capacity = amount;
		elementData = new Object[amount];
		cursor = 0;
	}

	public MySmartList() {
		this(3);
	}

	// [메소드]
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

	@SuppressWarnings("unchecked") // 그냥 경고 표시야
	@Override
	public E get(int idx) {
		return (E) elementData[idx]; // 현재타입이 Object니깐 E타입으로 형변환
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

	// 요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for (Object e : elementData) { // 향상된 for문
			tmp += (E) e + ", ";
		}
		return "[" + tmp + "]";
	}
}
