package sec4;

public class Ex3 {

	public static void main(String[] args) {
		int tot=0;
		for(int a=3; a<=100; a++){
			if(a%3==0){
				tot+=a;					
			}
		}
		System.out.println("3의배수의 합 : "+tot);
	}
}


