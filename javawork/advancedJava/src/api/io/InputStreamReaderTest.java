package api.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//InputStream�� �̿��ؼ� Ű����� �Է¹޴� �ѱ۹��ڿ��� �б� - ScannerŬ������ next()�� ����� ����
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
