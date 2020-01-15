package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		// c:\iot\iotest 폴더의 하위 폴더 및 파일을 출력
		//[출력형태]
		//a ---------------[폴더]
		//b ---------------[폴더]
		//ArrayTest01.java ------------------ [파일:(파일의 사이즈 출력)]
		//.
		//.
		//.
		//마지막 접속한 날짜를 년 월 일의 형식으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		File f = new File("c:/iot/iotest");
		
		File[] arrFile = f.listFiles();
		
		for (File file : arrFile) {
			System.out.print(file.getName() + " ------------- ");
			if(file.isDirectory()) {
				System.out.print("[폴더]");
			} else {
				System.out.print("[파일]: " + file.length());
			}
			System.out.println("\t" + sdf.format(file.lastModified()));
		}
	}

}
