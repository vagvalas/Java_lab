import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/* antikeimeno
		 */
		Scanner keyboard = new Scanner(System.in);
		Product best = new Product("", 1, 0);
		
		
		/* dilwseis */
		String best_name = "";
		double best_price = 1;
		int best_score = 0;
		
		boolean more = true;
		while (more) {
			Product current = new Product();
			
			
			
			current.read();
			
			if ( current.is_better_than(best)) 
			{
				best = current;
				
			}
			System.out.print("More data ? 1 or 2");
			int answer= keyboard.nextInt();
			if (answer==2)
				more=false;
			
			keyboard.nextLine();
			
		}
		System.out.println("The best product is" + best_name + "\n" + best_price + best_score);
		
		

}
}