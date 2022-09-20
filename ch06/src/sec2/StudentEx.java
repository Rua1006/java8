package sec2;

public class StudentEx {

	public static void main(String[] args) {
		Student studen1 = new Student();
		
		Student student1 = new Student("김기태",90,80,90);
		
		student1.calcTot();
		System.out.println("점수합계 :"+student1.calcTot());
		
		student1.calcAvg();
		System.out.println("점수평균 :"+student1.calcAvg());
		
		student1.calcHak();
		System.out.println("학점 :"+student1.calcHak());
		
		student1.calcRes();
		System.out.println("판정 :"+student1.calcRes());
	}

}
