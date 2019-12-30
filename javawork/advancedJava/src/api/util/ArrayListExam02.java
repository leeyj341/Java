package api.util;

import java.util.ArrayList;

public class ArrayListExam02 {
	public static void main(String[] args) {
		/* ��ȣ	����		�ڹ�		��		android
		 * 1	�嵿��	97		100		88			=> DTO or VO
		 * 2	�̹�ȣ	100		92		91	
		 * 3	���ؿ�	88		96		78
		 */
		ArrayList<StudentDTO> listStudent = new ArrayList<StudentDTO>();
		
		listStudent.add(new StudentDTO(1,"�嵿��",97,100,88));
		listStudent.add(new StudentDTO(2, "�̹�ȣ", 100, 92, 91));
		listStudent.add(new StudentDTO(3, "���ؿ�", 88, 96, 78));
		
		display(listStudent);
	}
	
	//�Ű������� ���޹��� ArrayList�� ����� ������ ������ ����ϱ�
	public static void display(ArrayList<StudentDTO> stdList) {
		int size = stdList.size();
		for (int i = 0; i < size; i++) {
			StudentDTO std = stdList.get(i);
			System.out.print("��ȣ: " + std.getNumber() + "\t�̸�: " + std.getName()
							+ "\t�ڹ�: " + std.getJava() + "\t��: " + std.getWeb()
							+ "\t�ȵ���̵�: " + std.getAndroid() + "\n");
		}
	}
}
