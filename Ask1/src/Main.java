import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/* antikeimeno
		 */
		Scanner keyboard = new Scanner(System.in);
		
		/* dilwseis */
		String best_name = "";
		double best_price = 1;
		int best_score = 0;
		
		boolean more = true;
		while (more) {
			
			String next_name;
			double next_price;
			int next_score;
			System.out.println("Enter product name:");
			next_name = keyboard.nextLine();
			System.out.println("Enter product price:");
			next_price = keyboard.nextDouble();
			System.out.println("Enter product score:");
			next_score = keyboard.nextInt();
			
			if (next_score/next_price > best_score/best_price) 
			{
				best_name = next_name;
				best_price = next_price;
				best_score = next_score;
				
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