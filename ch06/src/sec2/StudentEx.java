package sec2;

public class StudentEx {

	public static void main(String[] args) {
		Student student1 = new Student("김기태",90,80,90);
		
		student1.calcTot();
		System.out.println("점수합계 :"+student1.calcTot());
	}

}
