package sec2;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car("람보르기니", "가솔린", 4000);
		
		car1.bootUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println("현재속도 : "+car1.speedInfo());
		
		car1.speedDown();
		car1.speedDown();
		car1.speedUp();
		
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		
		
		car1.speedPrint();
	
		
		for(int i=0;i<100;i++){
			car1.speedDown();
		}
		System.out.println("현재속도 : "+car1.speedInfo());
		car1.bootdown();
		System.out.println("최고속도 : "+Car.MAX_SPEED);
		System.out.println("최저속도 : "+Car.MIN_SPEED);
		
		Car[] car;
	}

}