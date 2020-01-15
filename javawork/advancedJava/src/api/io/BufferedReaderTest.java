package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader�� �� ���徿 �б�
public class BufferedReaderTest {

	public static void main(String[] args) {
		//FileReader fr = null;
		BufferedReader br = null;
		try {
			//BufferedReader�� ������Ʈ������ ���õ����Ϳ� ������ �� �����Ƿ�
			//���õ����͸� ���� �� �ִ� �⺻��Ʈ���� �����ؼ� �Ѱ��־�� �Ѵ�.
			int count = 0;
			long start = System.nanoTime();
			br = new BufferedReader(new FileReader("src/api/io/FileTest01.java"));//������Ʈ��
			while (true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				count++;
				System.out.println(data);
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ�� => " + count);
			System.out.println("����ð� => " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
