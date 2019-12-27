package api.util;

import java.util.ArrayList;
// collection에 저장할 요소의 타입을 generic형태로 정의한다.
// collection클래스<데이터타입> ;
// ex) ArrayList<String> ;
public class ArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML5");
		list.add("CSS");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
