package chap08;
//API�� �޼��带 ȣ���ϴ� ���
//1. API�� �޼��带 ����� �� ����ο� throws�� �߰��Ǿ� ������ �ݵ�� try-catch��
//   ó���ؾ� �Ѵ�.
//2. �޼��尡 RuntimeException�� ���� Exception�� throws�ϴ� ��쿡�� 
//   ���������� Exception�� ���� ó���� �ϵ��� �������� �ʴ´�.
//   => �������� �������� ������ Exception�� throws�ϰ� ������ ó���� �ؾ� �Ѵ�.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.txt");
			System.out.println(fs.read());
			System.out.println(Integer.parseInt("1234"));
			System.out.println(Integer.parseInt("1234"));
		} catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			//������ �ٽ� ������ �� �ֵ��� ó���ϴ� �ڵ� �ʿ�
		} catch (IOException e) {
			System.out.println("������ ���� �� ������ �߻��߽��ϴ�.");
		}
	}
}
