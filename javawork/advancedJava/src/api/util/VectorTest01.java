package api.util;

import java.util.Vector;

//Vector를 만들고 사용하는 방법
public class VectorTest01 {
	public static void main(String[] args) {
		//제너릭에 올 수 있는 타입은 레퍼런스 타입밖에 없어서 int가 아닌 Integer클래스를 사용했다.
		Vector<Integer> v = new Vector<Integer>();
		//v.add("java");
		v.add(10);
		System.out.println("vector의 용량: " + v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 10; i++) {
			v.add(i);
		}
		System.out.println("vector의 용량: " + v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 20; i++) {
			v.add(i);
		}
		System.out.println("vector의 용량: " + v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 40; i++) {
			v.add(i);
		}
		System.out.println("vector의 용량: " + v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size());
		System.out.println("vector의 용량: " + v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size());
		
		System.out.println("==========================================");
		for (int i = 0; i < 40; i++) {
			v.add(i);
		}
		System.out.println("vector의 용량: " + v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size());
		
	}

}
