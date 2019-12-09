package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {
		int[] firstArr = new int[5];
		// �迭�� ���� �Ҵ��ϱ� ���� for��
		for(int i = 0; i < firstArr.length; i++)
		{
			firstArr[i] = 10 + i;
		}
		
		//firstArr�� ������ �迭�� ����
		int[] secondArr = new int[firstArr.length * 2];
		
		//firstArr�迭�� 0������ firstArr.length������ ������ ������ secondArr�� 0������ �ٿ��ֱ�
		System.arraycopy(firstArr, 2, secondArr, 5, firstArr.length - 2);
		
		for(int i = 0; i < secondArr.length; i++)
		{
			System.out.print(secondArr[i] + "\t");
		}
		System.out.println();
	}

}