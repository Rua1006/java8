package sec4;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("구구단");
		System.out.print("2단\t3단\t4단\t5단\t6단\t7단\t8단\t9단");
	for(int i=1; i<10; i++){
		System.out.println();
		for(int j=2; j<10; j++){
        System.out.print(j+"x"+i+"="+(i*j)+"\t");
    
				}
		}
		System.out.println("\n");
		System.out.println("팩토리얼의 합계 ");
		int mul=1; 
		long res=0;
		for(int a=1;a<11;a++){
			mul*=a;
			res+=mul;
		}
		System.out.println("10! = "+res);
		}
	}
