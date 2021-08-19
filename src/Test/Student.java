package Test;

public class Student {
	private int studentNum;
	private String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) return false;
			Student st1 = (Student) obj;
		if (st1.studentNum != studentNum)return false;
			return true;
		}
	}

