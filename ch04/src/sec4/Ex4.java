package sec4;

public class Ex4 {

	public static void main(String[] args) {

	 int a=0, b=0;		
	 while(a+b!=5){
		a=(int)(Math.random()*6)+1;
		b=(int)(Math.random()*6)+1;
		System.out.println("("+a+","+b+")");


	}
	 	for(int i=0; i<6; i++){
	 		int su=(int)(Math.random()*45)+1;
	 		System.out.print(su+"\t");
	 	}
}
}
