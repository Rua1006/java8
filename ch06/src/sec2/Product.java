package sec2;

public class Product {
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	public Product(){}
	public Product(String pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}
	public Product(String pid, String pname, int amount, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
	

	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int calcMoney(){
		int money=amount*price;
		return money;
	}
	public String calcRank(){
		int price=0;
		String rank;
		if(price>=100000){
			rank="고가";
		}else if(price>=50000){
			rank="중저가";
		}else {
			rank="저가";
		}
		return rank;
	} 
	public void printImg(){
		this.img=img;
	}
	public void printProduct(){
		System.out.println("제품의 아이디"+pid+"제품명"+pname+"제품수량"+amount+"제품가격"+price+"제품이미지"+img);
	}
	}