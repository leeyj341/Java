package book.exam.constructor;

public class LgTV implements TV {
	Speaker speaker;
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
