package chap05;

public class ArgsTest {

	public static void main(String[] args) {
		/*
		 * args = new String[2]
		 * 					---
		 * 					명령행 매개변숭의 갯수만큼 설정
		 * args[0] = "100";
		 * args[1] = "200";	
		*/
		System.out.println("명령행 매개변수 -> " + args[0]);
		System.out.println("명령행 매개변수 -> " + args[1]);
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		//String으로 입력받은 매개변수를 int로 변환
		//								String => int로 변환
		System.out.println("합 => " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));

		
	}

}
