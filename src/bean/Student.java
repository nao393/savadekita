package bean;

public class Student {
	private String no;
	private String name;
	private String entYear;
	private boolean isAttend;
	private String classNum;
	private School school;
	
	public Student() {
		
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEntYear() {
		return entYear;
	}
	
	public void setEntYear(String entYear) {
		this.entYear = entYear;
	}
	
	public boolean isAttend() {
		return  isAttend;
	}
	
	public void setAttend(boolean isAttend) {
		this.isAttend = isAttend;
	}
	
	public String getClassNum() {
		return classNum;
	}
	
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School School) {
		this.school = school;
	}

}


