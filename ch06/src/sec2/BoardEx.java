package sec2;

import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		boolean run = true;
		BoardEx br1 = new BoardEx();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("---------------------");
			System.out.println("1[글쓰기]\t2[글수정]\t3[글삭제]\t4[글검색]");
			System.out.println("---------------------");
			System.out.print("번호입력 :");
			
		int a =sc.nextInt();
		String write=sc.next();
		
		switch(a){
		case 1:
			System.out.print("[글쓰기]");
			write=sc.next();
			break;
		case 2:
			System.out.println("[글수정]");
			
			break;
		case 3:
			System.out.println("[글삭제]");
			break;
		case 4:
			System.out.println("[글검색]");
			break;
		default :
			System.out.println("게시판종료");
		 	run=false;
		}
		
		}
		
		
		
		
		
	}

}
