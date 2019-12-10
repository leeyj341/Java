package workbook;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public double getAvg() {
		return (double)(korean + english + math + science) / 4;
	}
	public String getGrade() {	
		double avg = getAvg();
		if(avg >= 90 & avg <= 100) {
			return "A����";
		} else if(avg >= 70) {
			return "B����";
		} else if(avg >= 50) {
			return "C����";
		} else if(avg >= 30) {
			return "D����";
		} else {
			return "F����";
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	

}