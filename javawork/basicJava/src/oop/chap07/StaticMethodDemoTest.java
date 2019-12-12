package oop.chap07;

import java.util.Random;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
		// API�� static �޼��� �����ϱ�
		// => static ����� �ν��Ͻ��� ������ �ƴϹǷ� ������ Ŭ���������� �����Ѵ�.
		// static�޼���(Ŭ���� �޼���)�� ȣ��
		System.out.println(Math.PI);
		System.out.println(Math.random());
		// non-static�޼���(�Ϲ� �޼��� - �ν��Ͻ� �޼���)
		// ��ü������ �� �Ŀ� ���������� ���ؼ� ������
		Random rand = new Random();
		System.out.println(rand.nextInt());

	}

}