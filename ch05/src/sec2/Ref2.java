package sec2;
import java.util.Calendar;
public class Ref2 {

	public static void main(String[] args) {
		week today = null;
		
		
		Calendar cal = Calendar.getInstance();
		int w = cal.get(Calendar.DAY_OF_WEEK); //오늘 날짜의 요일번호 가져오기
		//System.out.println(w); //1~7
		System.out.println();
		switch(w){
			case 1:
				today=week.SUNDAY;
				break;
			case 2:
				today=week.MONDAY;
				break;
			case 3:
				today=week.TUESDAY;
				break;
			case 4:
				today=week.WENDESDAY;
				break;
			case 5:
				today=week.THURSDAY;
				break;
			case 6:
				today=week.FRIDAY;
				break;
			case 7:
				today=week.SATURDAY;
				break;
		}
		System.out.println("오늘의 요일 : "+today); //여기까지 중요함
		
		System.out.println("name : "+today.name()); //멤버의 이름을 불러옴
		System.out.println("Original : "+today.ordinal()); //0~6
		week day1 = week.SATURDAY;
		System.out.println("요일 비교 : "+today.compareTo(day1)); //1:true, 1이 아닌값 :false
		System.out.println("========================================================");
		week [] days = week.values(); //열거형
		 for(week day : days){
			 System.out.println(day);
		 }
	}

}
