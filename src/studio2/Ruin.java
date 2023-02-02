package studio2;

import java.util.Scanner;

public class Ruin {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// gathering info

		System.out.print("What's your starting amount?");
		double startAmount = in.nextDouble();
		System.out.print("What's the win chance?");
		double money = startAmount;
		double winChance = in.nextDouble(); 
		System.out.print("What's your win limit?");
		double winLimit = in.nextDouble();

		int totalGambles = 0;
		System.out.print("How many simulations do you want to run?");
		double totalSimulations = in.nextDouble();



		for (int days = 1; days <= totalSimulations; days++) {
			while (money < winLimit &&  money > 0) {
				totalGambles ++;
				double rand = Math.random();
				boolean winOrNot = rand > winChance; 
				if (winOrNot != false) {
					money ++;
				}
				else {
					money --;
				}
			}

			if (money == winLimit) {
				System.out.println("Simulation: " + days + ", " + totalGambles + " WIN"); 
			}
			else if (money == 0) {
				System.out.println("Simulation: " + days + ", " + totalGambles + " LOSE");
			}
			money = startAmount;
			totalGambles = 0;
		}
	}

}
