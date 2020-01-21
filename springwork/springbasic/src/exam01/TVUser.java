package exam01;

import java.util.Scanner;

public class TVUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TV tv = null;
		String brand = scan.next();
		if(brand.equals("samsung")) {
			tv = new SamsungTV();
		} else if(brand.equals("lg")) {
			tv = new LgTV();
		}
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
