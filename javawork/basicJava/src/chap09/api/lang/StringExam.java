package chap09.api.lang;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "java";
		
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		String str2 = str1.toUpperCase();
		for (int i = str2.length() - 1; i >= 0; i--) {
			System.out.print(str2.charAt(i));
		}

	}

}
