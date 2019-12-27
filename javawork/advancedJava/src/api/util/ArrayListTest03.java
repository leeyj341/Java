package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		String[] arr = {"java","oracle","jdbc","html5","css"};
		ArrayList<String> list = changeData(arr);
		//변환되어 리턴된 ArrayList에 저장된 값을 꺼내서 출력하기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	// 배열을 ArrayList로 변환해서 리턴하는 메서드
	public static ArrayList<String> changeData(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
}
