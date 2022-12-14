package sec2;

public class Car {
	String name; //멤버 필드 : 객체(인스턴스)가 가지는 특성을 저장
	String fuel;
	int cc = 1000; //멤버 필드(속성)의 초기화
	int speed;
	final static int MAX_SPEED = 500; //멤버 상수 : 값이 한 곳에 저장되어 더 이상 바뀌지 않음 상수는 대문자를 쓴다
	final static int MIN_SPEED = 0;	//멤버 상수는 반드시 초기화가 되어야 하며, 그 값은 바뀌지 않음
	//[접근제한자]	[수정자]	데이터타입  필드명;
	
	public Car() { } //기본 생성자로서 선언 또는 또는 기술하지 않아도 자바에서 자동으로 생성됨(생략 가능) 
	public Car(String name){ this.name = name; }
	public Car(String name, String fuel){ 
		this.name = name; this.fuel = fuel; }
	
	public Car(String name, String fuel, int cc) {
		this(name, fuel, cc, 0); //현재 클래스의 생성자 함수 -> this()
	}
	public Car(String name , String fuel, int cc, int spped){
		this.name = name; this.fuel = fuel; //this.필드명 -> 현재 객체 자신의 필드
		this.cc = cc; this.speed = speed;
	}
	//생성자(Constructor) : 객체를 만드는 함수로서 클래스명과 동일해야 함
	//[접근제한자] 클래스명 (데이터타입 매개변수,.....) { }
	//this = 현재 객체, this() = 생성자 함수
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//메서드(Method) : 객체의 활동, 객체의 행위, 객체가 가지는 기능을 기술하는 것
	//[접근제한자] 반환타입 메서드명 ([데이터타입 매개변수]) { 활동/행위/기능 }
	//getter Method(게터 메서드) : 현재 객체의 속성(멤버 필드)에 저장된 데이터를 가져오기
	//setter Method(세터 메서드) : 현재 객체의 속성(멤버 필드)에 값을 저장하기
	
	//return (반환값)이 없으므로 반환타입에는 void를 지정해야함
	public void bootUp() {
		System.out.println("시동을 켭니다.");
	}
	public void bootdown() {
		System.out.println("시동을 끔니다.");
	}
	//반환 타입이 int이므로 return 해주어야 하는 것은 정수(int)이여야함
	public int speedUp() { 
		System.out.println("엑셀레이터를 밟습니다.");
		if(this.speed<this.MAX_SPEED){	//속도의 증가는 최고 속도까지이므로
			this.speed=this.speed+50;
		}
		return this.speed;
	}
	public int speedDown() {
		System.out.println("브레이크를 밟습니다.");
		if(this.speed>this.MIN_SPEED){ //속도의 감소는 최저속도까지이므로
			this.speed=this.speed-10;
		}
		return this.speed;
	}
	public int speedInfo(){
		return speed;
	}
	public void speedPrint(){
			System.out.println("현재속도 : "+this.speed);
	}
	public String fuelInfo(){
		return fuel;
	}
}