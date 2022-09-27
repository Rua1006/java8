package sec2;

import java.util.Date;

public class Board {
	private int num;
	private String title;
	private String text;
	private String name;
	private Date date;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public void boardWrite(int num,String title,String text,String name,Date date){
		this.num=num; //생성자 만들기 this.머시기
		this.title=title;
		this.text=text;
		this.name=name;
		this.date=date;
	}
	public void boardWrite(){  
		String message;
		message = new String("글제목");
		this.boardWrite(); //생성자 만들기 this.머시기
	}
	public void boardUpdate(int num,String title,String text){
		if(num==this.num){
			this.title=title;
			this.text=text;
		}
	}
	public void boardDelete(int num){
		if(num==this.num){
			try	{
				this.finalize();
			}catch (Throwable e){
				e.printStackTrace();
			}
		}
	}

	public void boardSearch(int num){
		if(num==this.num)
			System.out.println(this.num+"\t"+this.title+"\t"+this.text+"\t"+this.name+"\t"+this.date);
	}
	public void boardSearch(){
		System.out.println();
		System.out.println("글번호"+num);
		System.out.println("글제목"+title);
		System.out.println("글내용"+text);
		System.out.println("작성자"+name);
		System.out.println("작성일"+date);
		
		
	}
}