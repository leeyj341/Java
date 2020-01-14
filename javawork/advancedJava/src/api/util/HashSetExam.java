package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		//������ ���� ���������� HashSet��ü 2�� �ۼ��ϱ�
		//set1 -> 1���� 10������ ����
		//set2 -> 5���� 15������ ����
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			set1.add(i + 1);
			set2.add(i + 5);
		}
		set2.add(15);
		print(set1, "set1");
		print(set2, "set1");
		
		//������
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		set3.addAll(set2);
		print(set3, "set3");
		//������
		set1.retainAll(set2);
		print(set1, "set1");

	}
	public static void print(HashSet<Integer> set, String setName) {
		System.out.println("������ => " + set.size());
		for (Integer data : set) {
			System.out.println(setName + "�� ����� ���: "+ data);
		}
		System.out.println("==============================================");
	}

}
