package api.util;

import java.util.Vector;

//Vector�� ����� ����ϴ� ���
public class VectorTest01 {
	public static void main(String[] args) {
		//���ʸ��� �� �� �ִ� Ÿ���� ���۷��� Ÿ�Թۿ� ��� int�� �ƴ� IntegerŬ������ ����ߴ�.
		Vector<Integer> v = new Vector<Integer>();
		//v.add("java");
		v.add(10);
		System.out.println("vector�� �뷮: " + v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 10; i++) {
			v.add(i);
		}
		System.out.println("vector�� �뷮: " + v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 20; i++) {
			v.add(i);
		}
		System.out.println("vector�� �뷮: " + v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 40; i++) {
			v.add(i);
		}
		System.out.println("vector�� �뷮: " + v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size());
		System.out.println("vector�� �뷮: " + v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 40; i++) {
			v.add(i);
		}
		System.out.println("vector�� �뷮: " + v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size());
		
	}

}
