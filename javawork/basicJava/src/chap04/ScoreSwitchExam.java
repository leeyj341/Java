package chap04;

import java.util.Scanner;

public class ScoreSwitchExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score > 100 | score < 0)
		{
			System.out.println("잘못입력");
		}
		else
		{
			switch (score / 10) {
				case 10: case 9: 
					System.out.println("A");
					break;
				case 8: 
					System.out.println("B");
					break;	
				case 7: 
					System.out.println("C");
					break;
				case 6: 
					System.out.println("D");
					break;
				default:
					System.out.println("F");
					break;
			}
		}
		

	}

}
