package bean;

import java.util.Map;

public class TestListSubject {
	private int entYear;
	private String studentNo;
	private String studentName;
	private String classNum;
	private Map<Integer, Integer> point;

	public int getYear(){
		return entYear;
	}

	public void setEntYear(int entYear){
		this.entYear = entYear;
	}

	public String getStudentNo(){
		return studentNo;
	}

	public void setStudemtNo(String studentNo){
		this.studentNo = studentNo;
	}

	public String getStudentName(){
		return studentName;
	}

	public void setStudentName(String studentName){

		this.studentName = studentName;
	}

	public String getClassNum(){
		return classNum;
	}

	public void setClassNum(String classNum){
		this.classNum = classNum;
	}

	public Map<Integer,Integer> getPoint(){
		return points;
	}

	public void setPoints(Map<Integer, Integer> points){
		this.points = points;
	}

	public String getPoint(int key){
		return points.get(key).toString();
	}

	public void putPoint(int key,int value){
		this.points.put(key, value);
	}


}
