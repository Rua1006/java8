package sec2;

public class ProductEx {

	public static void main(String[] args) {
		Product pr1 = new Product ();
		pr1.setPid("a01");
		pr1.setPname("냉장고");
		pr1.setAmount(3);
		pr1.setPrice(80000);
		pr1.setImg("icetank01.jpg");
		
		System.out.println("\t"+"아이디"+"\t"+"제품명"+"\t"+"제품수량"+"\t"+"제품가격"+"\t"+"제품이미지");	
		System.out.println();
		System.out.println("입고처리 : "+"\t"+pr1.getPid()+"\t"+pr1.getPname()
				+"\t"+pr1.getAmount()+"\t"+pr1.getPrice()+"\t"+pr1.getImg());

	
		
	}

}