package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		// c:\iot\iotest ������ ���� ���� �� ������ ���
		//[�������]
		//a ---------------[����]
		//b ---------------[����]
		//ArrayTest01.java ------------------ [����:(������ ������ ���)]
		//.
		//.
		//.
		//������ ������ ��¥�� �� �� ���� �������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		File f = new File("c:/iot/iotest");
		
		File[] arrFile = f.listFiles();
		
		for (File file : arrFile) {
			System.out.print(file.getName() + " ------------- ");
			if(file.isDirectory()) {
				System.out.print("[����]");
			} else {
				System.out.print("[����]: " + file.length());
			}
			System.out.println("\t" + sdf.format(file.lastModified()));
		}
	}

}
