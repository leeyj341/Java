package api.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//InputStream을 이용해서 키보드로 입력받는 한글문자열을 읽기 - Scanner클래스의 next()의 기능을 구현
public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		PrintStream out = System.out;
		
		while (true) {
			try {
				int data = in.read();
				if(data == 13) {
					break;
				}
				out.print((char)data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
