package ncs.exam;

import java.util.Scanner;
public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("**************");
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.updateMenu();
				break;
			case 3:
				ui.deleteMenu();
				break;
		}
	}
}













