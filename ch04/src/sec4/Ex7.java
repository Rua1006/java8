package sec4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
	 boolean run = true;
	 
	 int balance = 0;
	 Scanner sc=new Scanner(System.in);
	 
	 while(run){
		 System.out.println("---------------------");
		 System.out.println("1.예금|2.출금|3.잔고|4.종료");
		 System.out.println("---------------------");
		 System.out.print("선택> ");
		 
		 int job=sc.nextInt();
		 int money=0;
		 switch(job){
		 	case 1:
		 		System.out.print("예금액> ");
		 		money=sc.nextInt();
		 		balance=balance+money;
		 		break;
		 	case 2:
		 		System.out.print("출금액> ");
		 		money=sc.nextInt();
		 		balance=balance-money;
		 		break;
		 	case 3:
		 		System.out.println("잔고> "+balance);
		 		break;
		 	case 4 :
		 		System.out.println("프로그램 종료");
		 		run=false;
		 }
			
		 }
		 
	 }
	  
	}

