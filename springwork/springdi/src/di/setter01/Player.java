package di.setter01;

//Player�� ���� �ִ� Dice�� �ܺο���(�����������̳�) Injection�޾� ����ؾ� �ϹǷ�
//Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
//==> Constructor or Setter�޼���
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