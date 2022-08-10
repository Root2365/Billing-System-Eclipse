import java.util.ArrayList;
import java.util.Scanner;

class Bill{
	String itemName;
	int itemPrice;
	int quantity;
	int subTotal;
	
	Bill(String itemName, int itemPrice, int quantity, int subTotal){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}
	
	public String toString() {
		return itemName+"      "+itemPrice+"      "+quantity+"      "+subTotal;
	}
}

public class LaunchBillingSystem {
	public static void main(String[] args) {
		int itemId=0;
		int itemPrice=0;
		String itemName=null;
		int quantity=0;
		int subTotal = 0;
		int grandTotal=0;
		String choice = "y";
		
		ArrayList<Bill> newItem = new ArrayList<Bill>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our hotel");
		
		System.out.println("Dear customer, please enter your name");
		String name = scan.next();
		
		while(choice.equals("y")) {
			System.out.println("Dear "+ name +", Below is the menu");
			System.out.println("_________________________________________________");
			System.out.println("ItemID            ItemName          ItemPrice");
			System.out.println("_________________________________________________");
			System.out.println("1                  Water              10     ");
			System.out.println("2                  Pepsi              30     ");
			System.out.println("3                  Pizza              100    ");
			System.out.println("4                  Burger             80     ");
			System.out.println("5                  Fries              50     ");
			System.out.println("_________________________________________________");
			
			System.out.println("Enter the item ID");
			itemId = scan.nextInt();
			
			System.out.println("Enter the quantity");
			quantity = scan.nextInt();
			
			switch(itemId) {
			case 1:itemName = "water";
				   itemPrice = 10;
				   subTotal = quantity*itemPrice;
				   break;
			case 2:itemName = "pepsi";
			   itemPrice = 30;
			   subTotal = quantity*itemPrice;
			   break;
			case 3:itemName = "pizza";
			   itemPrice = 100;
			   subTotal = quantity*itemPrice;
			   break;
			case 4:itemName = "burger";
			   itemPrice = 80;
			   subTotal = quantity*itemPrice;
			   break;
			case 5:itemName = "fries";
			   itemPrice = 50;
			   subTotal = quantity*itemPrice;
			   break;
			default:System.out.println("Invalid itemID. Please select itemId between (1-5)");
				break;
			}
			grandTotal += subTotal;
			System.out.println(itemName+"     "+itemPrice+"     "+"      "+quantity+"     "+subTotal);
			newItem.add(new Bill(itemName, itemPrice, quantity, subTotal));
			System.out.println("Would you like to order more(y/n)");
			choice = scan.next();
		}
		
		System.out.println("_________________________________________________");
		System.out.println("ItemName   itemPrice   quantity   subTotal");
		System.out.println("_________________________________________________");
		for(Bill x:newItem) {
			System.out.println(x);
		}
		System.out.println("_________________________________________________");
		System.out.println("Dear "+name+", your total bill is "+grandTotal);
		
	}
}
