package chap04;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println("출력할 단: " + num);
		for(int i = 1; i <= 9; i++)
		{
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

}
