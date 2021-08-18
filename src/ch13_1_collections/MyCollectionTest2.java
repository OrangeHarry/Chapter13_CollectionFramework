package ch13_1_collections;

import com.libs.collection.MyIntList;

public class MyCollectionTest2 {
	public static void main(String[] args) {
		
		
		MyIntList list = new MyIntList(3);
		
		list.add(1);
		list.add(3);
		list.add(5);
		//ArrayIndexOutBoundsException �ذ��ϱ�
		list.add(7); //�߰��� �����Ǵ� ����
		
		System.out.println(list);
		System.out.println("list[2]�� �� : "+list.get(2));
		System.out.println("size: "+list.size());
		System.out.println("=================================");

		//���� �ذ��ϱ�
		//[1,3,5, ] 3�� ������ --> [1,5,0 ]
		list.remove(1);
		
		System.out.println(list);
		System.out.println("list[2]�� �� : "+list.get(2));
		System.out.println("size: "+list.size());
		System.out.println("=================================");
		
		//�迭�� ���� ������ �ʱⰪ���� �������� �޼ҵ�(0�λ����� ��)
		// |0|0|0|0...
		list.clear();
		
		System.out.println(list);
		System.out.println("list[2]�� �� : "+list.get(2));
		System.out.println("size: "+list.size());
		System.out.println("=================================");
		
	}
}
