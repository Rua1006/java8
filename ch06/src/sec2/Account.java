package sec2;

public class Account {
	private String accountnumber;
	private String accountholder;
	private int	balance;
	private int deposit;
	
	public Account(){}
	
	public Account(String accountnumber, String accountholder, int balace, int deposit){
		this.accountnumber=accountnumber; this.accountholder=accountholder; 
		this.balance=balance; this.deposit=deposit;}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountholder() {
		return accountholder;
	}

	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void runDeposit(int money){
		this.balance+=money;
	}
	public void runWithdraw(int money){
		if(this.balance-money>0)
			this.balance-=money;
		
	}
	public int runBalance(){
		return balance;
	}
	public void printAccount(){
		System.out.println("계좌번호  :"+accountnumber+"계좌주"+accountholder+"잔액"+balance);
	}
	}