package ch13_1_collections;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() { //name�� age���� ������ ������ hashcode�� ����
		return name.hashCode() + age;
	}          //String�� hashcode() �̿�(String���� ���� �ּҰ����� ǥ��)
	
	//��� ���� �޼ҵ常���ε� ��� ǥ�ð� �Ǳ���
	@Override
	public boolean equals(Object obj) { //name�� age���� ������ true�� ����
		if(obj instanceof Member) {
			Member m1 = (Member) obj;
			return m1.name.equals(name) && (m1.age == age);
		}else {
			return false;
		}
	}
}
