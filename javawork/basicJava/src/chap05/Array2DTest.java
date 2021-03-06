package chap05;
// 2차원 배열 작성 연습
public class Array2DTest {

	public static void main(String[] args) {
		// 2차원 배열의 선언과 생성
		int[][] myArr = new int[2][3];
		
		// 2차원 배열의 초기화
		myArr[0][0] = 100;
		myArr[1][1] = 200;
		
		System.out.println("myArr의 2번째 요소가 참조하는 배열의 0번 요소의 값 : " + myArr[1][0]);
		System.out.println("myArr의 1번째 요소가 참조하는 배열의 0번 요소의 값 : " + myArr[0][0]);
		
		// 다차원 배열의 요소의 갯수
		System.out.println("배열 요소의 갯수 => " + myArr.length);
		System.out.println("myArr의 0번 요소가 참조하는 배열 요소의 갯수 => " + myArr[0].length);
		System.out.println("myArr의 1번 요소가 참조하는 배열 요소의 갯수 => " + myArr[1].length);
		
		// 전체 배열의 요소를 엑세스하기 - length를 직접 쓰고 접근하기
		for(int outer = 0 ; outer < 2; outer++)
		{
			for(int i = 0; i < 3; i++)
			{
				System.out.print(myArr[outer][i] + "\t");
			}
			System.out.println();
		}
		
		// 전체 배열의 요소를 엑세스하기 - 배열의 length변수를 이용해서 접근하기
		for(int outer = 0 ; outer < myArr.length; outer++)
		{
			for(int i = 0; i < myArr[outer].length; i++)
			{
				System.out.print(myArr[outer][i] + "\t");
			}
			System.out.println();
		}

	}

}
