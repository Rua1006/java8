package sec3;

public class Loop4 {

	public static void main(String[] args) {
		//무한 루프 : 조건이 항상 맞으면 계속 반복수행
		int a=0, tot=0;
		for(;;){
			a++;
			tot+=a; //tot=tot+a
			System.out.println("합계 : "+tot);
			
		}
	/*	while(true){
			System.out.println("합계");
	*/	
		
		}
	}

