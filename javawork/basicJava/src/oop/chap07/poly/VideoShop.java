package oop.chap07.poly;
public class VideoShop {
	// 배열에 다형성을 적용한 예
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("기생충","new");
		content[1] = new Video("탐정","comic");
		content[2] = new Video("헬로카봇","child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
