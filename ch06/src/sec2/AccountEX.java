package sec2;

public class AccountEX {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountnumber("303-20-55555555");
		account.setAccountholder("kbs");
		
		account.runDeposit(150000);
		account.runWithdraw(90000);
		System.out.println("잔액조회"+account.runBalance());
		account.printAccount();
	}

}
