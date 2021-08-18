package com.libs.collection;
/**
 * 자료구조 구현을 위한 메소드 규격을 정의한 인터페이스 작성
 * @author bitcamp
 *제네릭을 이용해보자
 */
public interface MyList<E> {
	public abstract void add(E num);
	public abstract E get(int idx);
	public abstract int size();
	public abstract void remove(int index);
	public abstract void clear();
}
