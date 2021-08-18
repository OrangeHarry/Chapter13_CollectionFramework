package ch13_1_collections;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() { //name과 age값이 같으면 동일한 hashcode를 리턴
		return name.hashCode() + age;
	}          //String의 hashcode() 이용(String형을 숫자 주소값으로 표현)
	
	//사실 위에 메소드만으로도 결과 표시가 되긴해
	@Override
	public boolean equals(Object obj) { //name과 age값이 같으면 true를 리턴
		if(obj instanceof Member) {
			Member m1 = (Member) obj;
			return m1.name.equals(name) && (m1.age == age);
		}else {
			return false;
		}
	}
}
