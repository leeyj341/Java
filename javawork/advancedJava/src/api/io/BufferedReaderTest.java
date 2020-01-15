package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader로 한 문장씩 읽기
public class BufferedReaderTest {

	public static void main(String[] args) {
		//FileReader fr = null;
		BufferedReader br = null;
		try {
			//BufferedReader는 보조스트림으로 원시데이터와 연결할 수 없으므로
			//원시데이터를 읽을 수 있는 기본스트림을 생성해서 넘겨주어야 한다.
			int count = 0;
			long start = System.nanoTime();
			br = new BufferedReader(new FileReader("src/api/io/FileTest01.java"));//보조스트림
			while (true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				count++;
				System.out.println(data);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수 => " + count);
			System.out.println("실행시간 => " + (end - start));
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
