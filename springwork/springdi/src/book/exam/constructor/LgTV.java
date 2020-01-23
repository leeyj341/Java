package book.exam.constructor;

public class LgTV implements TV {
	Speaker speaker;
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
		speaker.soundUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
		speaker.soundDown();
	}
}
