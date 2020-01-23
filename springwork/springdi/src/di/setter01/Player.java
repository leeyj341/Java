package di.setter01;

//Player가 갖고 있는 Dice를 외부에서(스프링컨테이너) Injection받아 사용해야 하므로
//Injection받을 수 있도록 미리 준비해야 한다.
//==> Constructor or Setter메서드
public class Player implements AbstractPlayer {
	AbstractDice d;
	int totalValue=0;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractDice getD() {
		return d;
	}
	public void setD(AbstractDice d) {
		System.out.println("player setter");
		this.d = d;
	}

	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}