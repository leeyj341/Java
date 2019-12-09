package chap05;

public class ArgsExam01 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int total = 0;
		if(num < 10 && num > 0)
		{
			for(int i = 1; i * num <= 100; i++)
			{
				total += num * i;
			}	
			System.out.println(total);
		}

	}

}
