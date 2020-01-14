package api.util;
import java.util.HashSet;
import java.util.Set;
//Set의 주요기능인 합집합 교집합 기능을 구현해보기
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
		
		HashSet<String> set2 = new HashSet<String>(set);
		print(set2, "set2");
	}
	//Set에 저장된 데이터를 꺼내서 출력하기
	public static void print(Set<String> set, String setName) {
		System.out.println("사이즈 => " + set.size());
		for (String data : set) {
			System.out.println(setName + "에 저장된 요소: "+ data);
		}
		System.out.println("==============================================");
	}
}
