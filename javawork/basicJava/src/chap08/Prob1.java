package chap08;

import java.util.Scanner;
public class Prob1 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		//���⸦ �ۼ��Ͻʽÿ�. try-catch�� ����ó��
		try {
			int result = convert(str);
			System.out.println("��ȯ�� ���ڴ� " + result + " �Դϴ�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException {
		if(str == null | str.length() == 0) {
			throw new IllegalArgumentException("���ܰ� �߻��Ǿ����ϴ�. ���ڿ��� �Է����� �ʰ� Enter Ű\r\n" + 
					"�� �����̽��ϴ�");
		}
		return Integer.parseInt(str);
	}
}