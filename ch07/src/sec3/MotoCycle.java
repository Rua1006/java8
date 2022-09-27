package sec3;

public class MotoCycle {
	Tire frontTire = new Tire(10,"앞");
	Tire backTire = new Tire(6,"뒤");
	
	
	public MotoCycle(){}
	
	public int run(){
		System.out.println("오토바이달림");
		if(frontTire.roll()==false){stop(); return 1;}
		if(backTire.roll()==false){stop(); return 2;}
		return 0;	
	}
	public void stop(){
		System.out.println("오토바이 멈춤");
	}
}
