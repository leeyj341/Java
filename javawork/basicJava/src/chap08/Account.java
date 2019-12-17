package chap08;

public class Account {
	private String account;
	private int balance;			//책에는 int지만 보통 돈을 담는 변수는 long으로 선언한다
	private double interestRate;
	
	public Account() {
		
	}
	public Account(String account, int balance, double interestRate)
	{
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalace() {
		return balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance * (interestRate / 100);
	}
	public void deposit(int money) throws Exception {
		if(money < 0) {
			throw new Exception("입금 금액이 0보다 적습니다.");
		}
		balance += money;
	}
	public void withdraw(int money) throws Exception {
		if(money < 0 | money > balance) {
			throw new Exception();
		}
		balance -= money;
	}
	public void print() {
		System.out.println("계좌정보: " + account + " 현재잔액: " + balance);
	}
}
