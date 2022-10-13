package java05;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		while(run){
				System.out.println("-----------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("-----------------------------------------------");
				System.out.print("선택 > ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1){
					createAccount();
				} else if(selectNo == 2){
					accountList();
				} else if(selectNo == 3){
					deposit();
				} else if(selectNo == 4){
					withdraw();
				} else if(selectNo == 5){
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
		
		private static void createAccount() {
			System.out.println("--------------");
			System.out.println("  계좌 생성   ");
			System.out.println("--------------");
			
			System.out.print("계좌번호 : ");
			String acnm = scanner.next();
			
			System.out.print("계좌주 : ");
			String name = scanner.next();
			
			System.out.print("초기 입금액 : ");
			int money = scanner.nextInt();
			
			Account acc = new Account(acnm, name, money);
			
			for(int i=0;i<accountArray.length;i++){
				if(accountArray[i] == null){
					accountArray[i] = acc;
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;
				}
			}
		}

		private static void accountList() {
			System.out.println("--------------");
			System.out.println("  계좌 목록   ");
			System.out.println("--------------");
			System.out.println("계좌번호\t계좌주\t잔액");
			for(int i=0;i<accountArray.length;i++){
				if(accountArray[i]==null) break;
				System.out.println(accountArray[i].getAcnm()+"\t"
						+accountArray[i].getName()+"\t"
						+accountArray[i].getMoney());
			}
		}
		private static void deposit(){
			System.out.println("--------------");
			System.out.println("  예금하기   ");
			System.out.println("--------------");
			
			System.out.print("계좌번호 : ");
			String acnm = scanner.next();
			
			System.out.print("예금액 : ");
			int money = scanner.nextInt();
			
			Account acc = findAccount(acnm);
			
			if(acc==null){
				System.out.println("결과 : 계좌가 존재하지 않습니다.");
				return;
			}
			
			acc.setMoney(acc.getMoney()+money);
			System.out.println("결과 : "+money+"가 성공적으로 입금처리 되었습니다.");
		}
		
		private static void withdraw(){
			System.out.println("--------------");
			System.out.println("  출금하기   ");
			System.out.println("--------------");
			
			System.out.print("계좌번호 : ");
			String acnm = scanner.next();
			
			System.out.print("출금액 : ");
			int money = scanner.nextInt();
			
			Account acc = findAccount(acnm);
			
			if(acc==null){
				System.out.println("결과 : 계좌가 존재하지 않습니다.");
				return;
			}
			
			if(acc.getMoney()<money) {
				System.out.println("예금액이 출금액보다 적어서 출금할 수 없습니다.");
				return;
			}
			
			acc.setMoney(acc.getMoney()-money);
			System.out.println("결과 : "+money+"가 성공적으로 출금처리 되었습니다.");		
		}
		
		private static Account findAccount(String acnm){
			Account acc = null;
			for(int i=0;i<accountArray.length;i++){
				if(accountArray[i]!=null){
				if(accountArray[i].getAcnm().equals(acnm)){
				acc = accountArray[i];
				break;
				}
			}
		}
		return acc;
	}
}