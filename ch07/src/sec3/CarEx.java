package sec3;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		for(int i=1; i<10; i++){
			int errorLocation = car1.run();
			
			switch(errorLocation){
				case 1:
					System.out.println("앞왼쪽 바퀴  KumhoTire로 교체");
					car1.frontLeftTire = new KumhoTire(12,"앞왼쪽");
					break;
				case 2:
					System.out.println("앞오른쪽 바퀴  KumhoTire로 교체");
					car1.frontRightTire = new KumhoTire(7,"앞오른쪽");
					break;
				case 3:
					System.out.println("뒤왼쪽 바퀴  KumhoTire로 교체");
					car1.backLeftTire = new KumhoTire(4,"뒤왼쪽");
					break;
				case 4:
					System.out.println("뒤오른쪽 바퀴  KumhoTire로 교체");
					car1.backRightTire = new KumhoTire(8,"뒤오른쪽");
					break;
					
			}
		}
	}

}
