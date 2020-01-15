package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			int sum = 0;
			int count = 0;
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				String[] arrStr = data.split(",");
				System.out.println(arrStr[0] + "ÀÇ Á¡¼ö´Â " + arrStr[1] + "Á¡");
				sum += Integer.parseInt(arrStr[1]);
				count++;
			}
			System.out.println("ÃÑÁ¡: " + sum);
			System.out.println("Æò±Õ: " + (sum / count));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
