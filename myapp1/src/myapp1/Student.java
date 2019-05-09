package myapp1;

public class Student {
	private Integer sid;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + "]";
	}

}
