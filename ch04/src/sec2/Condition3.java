package sec2;

import java.util.Scanner;

public class Condition3 {
	//성명과 세 과목 (전산, PG, DB)의 점수를 입력받은 후
	//판정은 세 과목의 점수가 모두 70점 이상이면, "합격" 아니면  "탈락" 이며,
	//평균은 세 과목의 점수의 합계에서 3으로 나눈 값으로 하되ㅡ 소수점 이하까지 표시될 수 있도록 실수로 구하며,
	//비고는 세 과목 중에서 어느 하나라도 90점 이상이 있으면, "과목우수"로 하고, 아니면 공백으로 구함
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name=sc.next();
		System.out.println("전산점수 : ");
		int jun=sc.nextInt();
		System.out.println("PG점수 : ");
		int pg=sc.nextInt();
		System.out.println("DB점수 : ");
		int db=sc.nextInt();
		int tot=jun+pg+db;
		double avg=(float)tot/ 3;
		String pan="불합격";
		if(jun>=70 && pg>=70 && db>=70) pan="합격";
		String des="";
		if(jun>=90 || pg>=90 || db>=90) des="과목우수";		
		System.out.println(name+"님의 총점은"+tot+"점 이며, 평균은"+avg+"이고, "+pan+"하셨으며, 비고는 "+des+"입니다.");
		sc.close();
		
	}
	

}
