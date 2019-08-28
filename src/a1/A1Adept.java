package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int itemsInStore = scan.nextInt();
		String[] itemArray = new String[itemsInStore];
		double[] priceArray = new double[itemsInStore];
		double[] purchase = new double[itemsInStore];
		// getMin(totalForAll);

		// String custName = "null";

		for (int j = 0; itemsInStore > j; j++) {

			itemArray[j] = scan.next();
			priceArray[j] = scan.nextDouble();

			// System.out.println(itemArray[j]);

		}
		int numOfCust = scan.nextInt();
		String[] fullNames = new String[numOfCust];
		double[] totalForAll = new double[numOfCust];

		for (int i = 0; numOfCust > i; i++) {

			String firstName = scan.next();
			String lastName = scan.next();
			fullNames[i] = firstName + " " + lastName;
			int numOfPurchaces = scan.nextInt();
			// int[] numOfProduc = new int[numOfPurchaces];
			// String[] itemNam = new String[numOfPurchaces];

			for (int h = 0; numOfPurchaces > h; h++) {
				int numOfProduce = scan.nextInt();
				String itemName = scan.next();
				for (int j = 0; itemArray.length > j; j++) {
					if (itemName.equals(itemArray[j])) {
						totalForAll[i] += numOfProduce * priceArray[j];
					}
				}
				// System.out.println(totalForAll[0]);

			}
			// System.out.println(totalForAll.length);

		}

		double max = getMax(totalForAll);
		double min = getMin(totalForAll);
		double avg = getAverage(totalForAll);
		String fullNameMax = null;
		String fullNameMin = null;
		// System.out.println(avg);

		for (int y = 0; y < totalForAll.length; y++) {

			if (max == totalForAll[y]) {
				fullNameMax = fullNames[y];
				// System.out.println(totalForAll[y]);
			}
			if (min == totalForAll[y]) {
				fullNameMin = fullNames[y];
				// System.out.println("Smallest: " + fullNames[y] + " (" + String.format("%.2f",
				// min) + ")");
			}
			// System.out.println("Average:" + " " + String.format("%.2f", avg));

		}
		System.out.println("Biggest: " + fullNameMax + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + fullNameMin + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average:" + " " + String.format("%.2f", avg));

		// System.out.println(fullNameMin);
	}

	public static double getMax(double[] totalForAll) {
		double max = totalForAll[0];
		for (int y = 1; y < totalForAll.length; y++) {
			if (max < totalForAll[y]) {
				max = totalForAll[y];
			}

		}
		// System.out.println(max);
		return max;
	}

	public static double getMin(double[] totalForAll) {
		double min = totalForAll[0];
		for (int z = 1; z < totalForAll.length; z++) {
			if (min > totalForAll[z]) {
				min = totalForAll[z];
			}

		}
		// System.out.println("Smallest:"+ fullNames[z] + min);
		return min;
	}

	public static double getAverage(double[] totalForAll) {

		double sum = 0;
		for (double tot : totalForAll) {
			sum += tot;

		}
		double average = sum / totalForAll.length;

		// System.out.println("The average is" + average);
		return average;
	}

}
//