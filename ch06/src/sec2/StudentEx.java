package sec2;

public class StudentEx {

	public static void main(String[] args) {
		Student studen1 = new Student();
				
		Student student1 = new Student("김기태",90,80,90);
		System.out.println("이름\t총점\t평균\t학점\t판정");
		System.out.println(student1.name+"\t"+student1.calcTot()
				+"\t"+ student1.calcAvg()+"\t"+student1.calcHak()
				+"\t"+student1.calcRes());
		

	}

}
