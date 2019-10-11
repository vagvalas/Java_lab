import java.util.Scanner;
public class Product {
	//IDIOTITES - PEDIA - METAVLITES STIGMIOTYPOU
private String name;
private double price;
private int score;

//kataskeuastis
public Product()
{
	name = "";
	price = 1;
	score = 0;
	
	}

public Product (String aName, double aPrice, int aScore) {
	
	name = aName;
	price = aPrice;
	score = aScore;
	
	
}

public void read()
{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter product name:");
	name = keyboard.nextLine();
	System.out.println("Enter product price:");
	price = keyboard.nextDouble();
	System.out.println("Enter product score:");
	score = keyboard.nextInt();
	}
public boolean is_better_than(Product other) {

	if ( score/price > other.score/other.price)
		return true;
	return false;
	// return ( score/price > other.score/other.price) THA MPOROUSA
}
}
