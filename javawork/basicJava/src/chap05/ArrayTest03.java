package chap05;
// 배열 엑세스하기
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// 배열의 요소의 크기를 출력
		System.out.println("배열 요소의 갯수: " + arr.length);
		System.out.println("==================================");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
