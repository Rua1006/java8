package sec2;

public class Board {
	private int num;
	private String title;
	private String text;
	private String name;
	private String date;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void boardWrite(int num,String title,String text,String name,String date){
		this.boardWrite(num, title, text, name, date); //생성자 만들기 this.머시기
	}
	public void boardUpdate(){
		this.boardUpdate();
	}
	public void boardDelete(){
		this.boardDelete();
	}
	public void boardSearch(){
		
	}
}



