package api.util;
import java.util.HashSet;
import java.util.Set;
//Set�� �ֿ����� ������ ������ ����� �����غ���
public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		print(set, "set");
		
		//�������� �����ϴ� ����� => Set��ü�� ������ �� ���������� ǥ���� set�� �������� �Ű������� ����
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		print(set2, "set2");
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");  
		set3.add("jdbc");  
		set3.add("oracle");
		set3.add("hive");
		print(set3, "set3");
		
		//set2�� set3�� ������ ���ϱ�
		set.retainAll(set3);	
		//set�� set3�� ����� ��� �� �ߺ��Ǵ� ��Ҹ� ������ ���ο� set������ ���������.
		//set�� set3�� ���ؼ� ��ġ�ϴ� �͸� ����� �������� ���ŵȴ�.
		print(set, "������set");
	}
	//Set�� ����� �����͸� ������ ����ϱ�
	public static void print(Set<String> set, String setName) {
		System.out.println("������ => " + set.size());
		for (String data : set) {
			System.out.println(setName + "�� ����� ���: "+ data);
		}
		System.out.println("==============================================");
	}
}