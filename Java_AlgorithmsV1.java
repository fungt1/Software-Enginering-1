package Algorithms;
/**
 * Algorithms class. This is just a rough sketch of the algorithms for the project. 
 * It is a simple menu selection of the different functions.
 * Pseudo Code of algorithms.
 * Team Performance = Standard Labor Hours / Hours Spent Writing Slots * 100.
 * Productivity = Total Labor Hours Worked / Total Amount of Slots Written.
 * Closure Rate = Closed Leads / Successful Leads * 100.
 * 
 * Tyler Fung
 * 04/16/19
 */

import java.util.Scanner;

public class Driver {
	// SLH = Standard Labor Hours. HSWS = Hours Spent Writing Slots.
	public double TeamPerformance(double SLH, double HSWS) {
		return SLH * 100 / HSWS;
	}

	// TLHW = Total Labor Hours Worked. TASW = Total Amount of Slots Written
	public double Productivity(double TLHW, double TASW) {
		return TLHW / TASW;
	}

	// SL = Successful Leads. CS = Closed Sales
	public double ClosureRates(double SL, double CS) {
		return SL * 100 / CS;
	}

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Algorithms Calculator " 
			+ "\nAuthor: Tyler Fung" 
			+ "\n" 
			+ "\nSelect an Option:");
			do {

				System.out.println("MENU" 
				+ "\n1 - Team Performance" 
				+ "\n2 - Productivity" 
				+ "\n3 - Closure Rate"
				+ "\n4 - Quit" 
				+ "\n");

				char i = sc.next().charAt(0);
				switch (i) {
				case '1': {
					Driver x = new Driver();
					System.out.print("Enter Standard Labor Hours:");
					double SLH = sc.nextDouble();
					System.out.println("Enter Hours Spent Writing Slots:");
					double HSWS = sc.nextDouble();
					System.out.println("Team Performance is: " + x.TeamPerformance(SLH, HSWS) + "%");
				}
					break;
				case '2': {
					Driver x = new Driver();
					System.out.print("Enter Total Labor Hours Worked:");
					double TLHW = sc.nextDouble();
					System.out.println("Enter Total Amount of Slots Written:");
					double TASW = sc.nextDouble();
					System.out.println("Productivity is: " + x.Productivity(TLHW, TASW));
				}
					break;
				case '3': {
					Driver x = new Driver();
					System.out.print("Enter Closed Sales:");
					double CS = sc.nextDouble();
					System.out.println("Enter Successful Leads:");
					double SL = sc.nextDouble();
					System.out.println("Closure Rates is: " + x.ClosureRates(CS, SL) + "%");
				}

					break;
				case '4':
					break;

				default:
					break;
				}
				if (i == '4')
					break;
			} while (true);
		} catch (Exception e) {
		}
		return;
	}
}

