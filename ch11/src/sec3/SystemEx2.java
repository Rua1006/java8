package sec3;

import sec2.Student;

public class SystemEx2 {
	public static void main(String[] args) {
		//
		Student st;
		st = new Student(1,"남송유"); //의미없음
		st = null;	//의미없음
		st = new Student();	//의미없음
		st = new Student(2,"김기태");
		
		System.out.println(st.sno+", "+st.sname);
		System.gc(); // Garbage Collection
	}

}
