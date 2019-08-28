package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int total = scan.nextInt();

		String[] firstName = new String[total];
		String[] lastName = new String[total];
		double[] totalInt = new double[total];
		for (int i = 0; i < total; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int numPurch = scan.nextInt();
			double[] totalProd = new double[numPurch];
			// System.out.println(numPurch);
			for (int y = 0; y < numPurch; y++) {
				int count = scan.nextInt();
				String product = scan.next();
				double price = scan.nextDouble();
				totalProd[y] = price * count;

				totalInt[i] += totalProd[y];
			}

			System.out.println(firstName[i].charAt(0) + ". " + lastName[i] + ": " + String.format("%.2f", totalInt[i]));

		}
	}

	// Your code follows here.

}
