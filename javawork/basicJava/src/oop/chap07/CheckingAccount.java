package oop.chap07;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {
		
	}
	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, balance, ownerName);
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public void pay(int amount, String cardNo) {
		if(this.cardNo.equals(cardNo) & amount <= getBalance()) {
			withdraw(amount);
		}
		else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	
}
