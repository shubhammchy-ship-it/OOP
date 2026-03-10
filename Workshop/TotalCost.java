package Workshop;

import java.util.Scanner;

public class TotalCost {

		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter quantity: ");
			double quantity = sc.nextDouble();
			System.out.print("Enter price: ");
			double price = sc.nextDouble();
			double cost = quantity * price;
			System.out.println("Total Cost: " + cost);
			sc.close();
		

	
	}

}
