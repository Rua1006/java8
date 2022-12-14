 package sec2;

import java.util.Date;
import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//임의의 Board 객체 배열 100개 생성
		Board [] board = new Board[100];
		for(int i=0; i<board.length; i++){ //객체의 배열은 선언 및 초기화가 필요
			board[i] = new Board();
		}
		
		boolean sw = true; //작업 계속 여부
		int cnt = 0; //배열의 개수 카운트
		
		while(sw){
			System.out.print("작업번호 입력 : ");
			int job = sc.nextInt();
			int num;
			String title;
			String text;
			String name;
			
			switch(job){
				case 1: 
					System.out.println("***** 글쓰기  *****");
					System.out.print("제목 : ");
					title = sc.next();
					System.out.print("내용 : ");
					text = sc.next();
					System.out.print("작성자 : ");
					name = sc.next();
					Date date = new Date();
					board[cnt].boardWrite(cnt, title, text, name, date);
					cnt++;
					break;
				case 2:
					System.out.println("***** 글수정 *****");
					System.out.print("글 번호 : ");
					num = sc.nextInt();
					System.out.print("제목 : ");
					title = sc.next();
					System.out.print("내용 : ");
					text = sc.next();
					for(int a=0; a<=cnt; a++){
						board[a].boardUpdate(num, title, text);
					}
					break;
				case 3:
					System.out.println("***** 글삭제 *****");
					System.out.print("글 번호 : ");
					num = sc.nextInt();
					for(int a=0; a<=cnt; a++){
						board[a].boardDelete(num);
					}
					break;
				case 4:
					System.out.println("***** 글검색 *****");
					System.out.print("글 번호 : ");
					num = sc.nextInt();
					for(int a=0; a<=cnt; a++){
						board[a].boardSearch(num);
					}
					break;
				default:
					System.out.println("프로그램 종료");
					sw=false;
			}
						
		}
		sc.close();
	}
		
}		
		/*boolean run = true;
=======
		
		
>>>>>>> Stashed changes
		while(run){
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("1[글쓰기]\t2[글수정]\t3[글삭제]\t4[글검색]");
			System.out.println("--------------------------------");
			System.out.println();
			System.out.print("번호입력 :");
		Scanner sc = new Scanner(System.in);	
		BoardEx br1 = new BoardEx();
		int a =sc.nextInt();
				
		switch(a){
		case 1:
<<<<<<< Updated upstream
			System.out.print("[글쓰기]");			
=======
			System.out.print("[글쓰기]");
			write=sc.next();
			System.out.println("작성내용  :"+write);
>>>>>>> Stashed changes
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
*/