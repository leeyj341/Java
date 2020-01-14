package api.util;
//����, �ߺ��� ������� �ʴ´�.
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		
		System.out.println("������ => " + set.size());
		
		//set�� ����� ��Ҹ� ����
		//1. HashSet�����͸� ǥ�� �������̽�
		//	(��� �ڷᱸ���� ��� �����͸� ��ȯ�ؼ� ���� �� �ֵ��� �����Ǵ�
		//	�������� �������̽�) Iterator�� ��ȯ
		Iterator<String> iter = set.iterator();
		//2. ��ȯ �� ����
		while (iter.hasNext()) {		//Iterator�ȿ� ����� ��Ұ� �ִ��� Ȯ�� - boolean����
			String data = iter.next();	//Iterator�� ����� ��Ҹ� �ϳ� ������ ��ȯ
			System.out.println("���� ��Ҵ�: " + data);
		}
		
		for (String string : set) {
			System.out.println("set�� ����� ��� : " + string);
		}
		
		for (Iterator iter1 = set.iterator(); iter1.hasNext();) {
			String string = (String) iter1.next();
			System.out.println("set�� ����� ���: " + string);
		}
	}

}
