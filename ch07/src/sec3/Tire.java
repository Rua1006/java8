package sec3;

public class Tire {
	//멤버 필드
	public int maxRotation; //최대회전수
	public int accumulatedRotation; //회전수
	public String location; //위치
	//생성자
	public Tire(int maxRotation, String location){
		this.maxRotation = maxRotation;
		this.location = location;
		
	}
	//맴버 메서드
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+"Tire 수명:"+(maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println("***"+location+"Tire 펑크****");
			return false;
		} 
	}
}
