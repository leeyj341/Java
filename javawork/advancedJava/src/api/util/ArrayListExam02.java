package api.util;

import java.util.ArrayList;

public class ArrayListExam02 {
	public static void main(String[] args) {
		/* 번호	성명		자바		웹		android
		 * 1	장동건	97		100		88			=> DTO or VO
		 * 2	이민호	100		92		91	
		 * 3	류준열	88		96		78
		 */
		ArrayList<StudentDTO> listStudent = new ArrayList<StudentDTO>();
		
		listStudent.add(new StudentDTO(1,"장동건",97,100,88));
		listStudent.add(new StudentDTO(2, "이민호", 100, 92, 91));
		listStudent.add(new StudentDTO(3, "류준열", 88, 96, 78));
		
		display(listStudent);
	}
	
	//매개변수로 전달받은 ArrayList에 저장된 데이터 꺼내서 출력하기
	public static void display(ArrayList<StudentDTO> stdList) {
		int size = stdList.size();
		for (int i = 0; i < size; i++) {
			StudentDTO std = stdList.get(i);
			System.out.print("번호: " + std.getNumber() + "\t이름: " + std.getName()
							+ "\t자바: " + std.getJava() + "\t웹: " + std.getWeb()
							+ "\t안드로이드: " + std.getAndroid() + "\n");
		}
	}
}
