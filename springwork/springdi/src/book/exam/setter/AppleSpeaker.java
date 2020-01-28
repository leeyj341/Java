package book.exam.setter;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker °´Ã¼ »ý¼º");
	}

	public void soundUp() {
		System.out.println("AppleSpeakerÀÇ º¼·ý ¾÷!!!");
	}
	
	public void soundDown() {
		System.out.println("AppleSpeakerÀÇ º¼·ý ´Ù¿î...");
	}
}
