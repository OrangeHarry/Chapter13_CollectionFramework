package com.libs.collection;
/**
 * �ڷᱸ�� ������ ���� �޼ҵ� �԰��� ������ �������̽� �ۼ�
 * @author bitcamp
 *���׸��� �̿��غ���
 */
public interface MyList<E> {
	public abstract void add(E num);
	public abstract E get(int idx);
	public abstract int size();
	public abstract void remove(int index);
	public abstract void clear();
}
