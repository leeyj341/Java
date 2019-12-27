package ncs.exam;
import java.util.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("���:");
		String password = key.next();
		System.out.print("�̸�:");
		String name = key.next();
		System.out.print("����Ʈ:");
		int point = key.nextInt();
		System.out.print("�ּ�:");
		String addr = key.next();
		
	
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		//int result = dao.insert(id, title, content);
		CustomerDTO customer = new CustomerDTO(id, password, name, point, addr);
		int result = dao.insert(customer);
		//���ó��
		if(result > 0) {
			System.out.println("�Խñ� ��� ����");
		} else {
			System.out.println("�� ��� ����");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, addr);
		//���ó��
		if(result > 0) {
			System.out.println("�Խñ� ���� ����");
		} else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(id);
		//���ó��
		if(result > 0) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}


















