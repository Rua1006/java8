package sec2;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성명 : ");
		String name=sc.next();
		System.out.println("\n점수 : ");
		int jum = sc.nextInt();
		String pan="";
		
		if(jum>=90) {
			pan="A";
		}else if(jum>=80) {
			pan="B";
		}	else if(jum>=70) {
				pan="C";
		}	else if(jum>=60) {
				pan="D";
		}	else {
				pan="집에가시오";
			}
		System.out.println("당신의 이름은"+name+"이며, 점수는"+jum+"이고, 학점은"+pan+"입니다.");
		sc.close();
	}
	}
