package chap05;
// 2차원 배열의 선언과 생성
public class Array2DTest02 {

	public static void main(String[] args) {
		// 2차원 배열부터 배열이 참조하는 배열의 요소를 각각 다르게 정의할 수 있다.
		int[][] myArr = new int[3][];
		myArr[0] = new int[3];
		myArr[1] = new int[2];
		myArr[2] = new int[1];
		
		for(int i = 0; i < myArr.length; i++)
		{
			for(int j = 0; j < myArr[i].length; j++)
			{
				System.out.print(myArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
