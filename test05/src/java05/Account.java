package java05;

public class Account {
	private String acnm;
    private String name;
    private int money;
 
    public Account(String acnm, String name, int money) {
        this.acnm = acnm;
        this.name = name;
        this.money = money;
    }
 
    public String getAcnm() { return acnm; }
    public void setAcnm(String acnm) { this.acnm = acnm; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }
}
