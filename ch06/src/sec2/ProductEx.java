package sec2;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
/*		Product pr1 = new Product ();
		pr1.setPid("a01");
		pr1.setPname("냉장고");
		pr1.setAmount(3);
		pr1.setPrice(80000);
		pr1.setImg("icetank01.jpg");
		
		System.out.println("\t"+"아이디"+"\t"+"제품명"+"\t"+"제품수량"+"\t"+"제품가격"+"\t"+"제품이미지");	
		System.out.println();
		System.out.println("입고처리 : "+"\t"+pr1.getPid()+"\t"+pr1.getPname()
				+"\t"+pr1.getAmount()+"\t"+pr1.getPrice()+"\t"+pr1.getImg());
*/
		Scanner sc = new Scanner(System.in);
		Product pr1 = new Product ();
		System.out.print("제품코드 : ");
		pr1.setPid(sc.next());
		System.out.print("제품명 : ");
		pr1.setPname(sc.next());
		System.out.print("제품수량 : ");
		pr1.setAmount(sc.nextInt());
		System.out.print("제품가격 : ");
		pr1.setPrice(sc.nextInt());
		System.out.print("이미지 : ");
		pr1.setImg(sc.next());
		System.out.println("아이디"+"\t"+"제품명"+"\t"+"제품수량"+"\t"+"제품가격"+"\t"+"제품이미지");
		System.out.println(pr1.getPid()+"\t"+pr1.getPname()+"\t"+pr1.getAmount()+"\t"+pr1.getPrice()+"\t"+pr1.getImg());
		
		
		pr1.setPid("a01");
		pr1.setPname("냉장고");
		pr1.setAmount(3);
		pr1.setPrice(80000);
		pr1.setImg("icetank01.jpg");
		
		sc.close();
	}

}
