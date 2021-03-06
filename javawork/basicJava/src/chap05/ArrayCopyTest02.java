package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {
		int[] firstArr = new int[5];
		// 배열에 값을 할당하기 위한 for문
		for(int i = 0; i < firstArr.length; i++)
		{
			firstArr[i] = 10 + i;
		}
		
		//firstArr를 복사할 배열을 선언
		int[] secondArr = new int[firstArr.length * 2];
		
		//firstArr배열의 0번부터 firstArr.length까지의 범위를 복사해 secondArr의 0번부터 붙여넣기
		System.arraycopy(firstArr, 2, secondArr, 5, firstArr.length - 2);
		
		for(int i = 0; i < secondArr.length; i++)
		{
			System.out.print(secondArr[i] + "\t");
		}
		System.out.println();
	}

}
