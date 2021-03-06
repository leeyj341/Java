package chap05;

public class Array2DExam02 {

	public static void main(String[] args) {
		int[][] arr2 = { 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 } };
		
		int total = 0;
		float average = 0.f;
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++)
			{
				total += arr2[i][j];
			}
		}
		
		average = (float)total / (arr2.length * arr2[0].length);
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);

	}

}
