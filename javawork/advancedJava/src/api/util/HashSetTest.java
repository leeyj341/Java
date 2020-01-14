package api.util;
//집합, 중복을 허용하지 않는다.
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
		
		System.out.println("사이즈 => " + set.size());
		
		//set에 저장된 요소를 추출
		//1. HashSet데이터를 표준 인터페이스
		//	(모든 자료구조에 담긴 데이터를 변환해서 담을 수 있도록 제공되는
		//	추출전용 인터페이스) Iterator로 변환
		Iterator<String> iter = set.iterator();
		//2. 변환 후 추출
		while (iter.hasNext()) {		//Iterator안에 저장된 요소가 있는지 확인 - boolean리턴
			String data = iter.next();	//Iterator에 저장된 요소를 하나 꺼내서 반환
			System.out.println("꺼낸 요소는: " + data);
		}
		
		for (String string : set) {
			System.out.println("set에 저장된 요소 : " + string);
		}
		
		for (Iterator iter1 = set.iterator(); iter1.hasNext();) {
			String string = (String) iter1.next();
			System.out.println("set에 저장된 요소: " + string);
		}
	}

}
