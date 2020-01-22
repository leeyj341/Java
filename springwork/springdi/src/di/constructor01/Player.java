package di.constructor01;

public class Player extends AbstractPlayer {
	Dice d = new Dice();
	int totalValue=0;
	
	public Player(Dice d) {
		super();
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