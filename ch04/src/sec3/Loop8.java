package sec3;

public class Loop8 {

	public static void main(String[] args) {
		// 이중 for문을 활용하여 아래와 같은 형태의 구구단을 출력
/*
		2*1=2 3*1=3 ......... 9*1=9
		2 2
		............................
		2*9=18 ..........		
*/
		System.out.println("구구단");
	for(int i=1; i<10; i++){
		System.out.println("");
		for(int j=2; j<10; j++){
        System.out.print(j+"x"+i+"="+(i*j)+"\t");

		}

	}
	}

}
