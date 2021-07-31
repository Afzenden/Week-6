package War;

public class Card {
	
	public String name;
	public int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describeCard() {
		System.out.println("This card is the " + name + ", and is worth " + value + " points.");
	}
	
	Card (String n, int v) { //Card Object Constructor
		name = n;
		value = v;
		//System.out.println("Card created: " + n + " " + v);
	}
	
	

}
