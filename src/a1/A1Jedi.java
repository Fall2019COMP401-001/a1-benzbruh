package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String firstName, lastName;

		int numOfPurchaces;
		int numOfProduce;
		int itemsInStore = scan.nextInt();

		String[] itemArray = new String[itemsInStore];
		double[] priceArray = new double[itemsInStore];

		int[] prodCounter = new int[itemsInStore];
		int[] custCounter = new int[itemsInStore];
		for (int j = 0; itemsInStore > j; j++) {

			itemArray[j] = scan.next();
			priceArray[j] = scan.nextDouble();

		}

		int numOfCust = scan.nextInt();
		// boolean[] bought = new boolean[numOfCust];

		for (int i = 0; numOfCust > i; i++) {
			// bought[i] = false;

			scan.next();
			scan.next();

			numOfPurchaces = scan.nextInt();

			String[] itemName = new String[numOfPurchaces];

			for (int h = 0; numOfPurchaces > h; h++) {

				numOfProduce = scan.nextInt();
				itemName[h] = scan.next();

				// if (itemArray[ind].equals(itemName[h])) {

				// ind++;
				// }
				/*
				 * if (bought[ind]) { prodCounter[ind]++;
				 * 
				 * 
				 * }
				 */

				for (int j = 0; itemArray.length > j; j++) {
					if (itemName[h].equals(itemArray[j])) {
						// bought[i] = true;

						custCounter[j] += numOfProduce;

						// if (bought[i]) {

						prodCounter[j] += 1;

					}

				}

			}

		}
		// for (int j = 0; itemArray.length > j; j++) {

		// if (bought[i]) {

		// prodCounter[j]++;
		// }
		// }

		for (int j = 0; itemArray.length > j; j++) {
			if (prodCounter[j] == 0) {
				System.out.println("No customers bought " + itemArray[j]);
			} else {
				System.out.println(prodCounter[j] + " customers bought " + custCounter[j] + " " + itemArray[j]);
			}
		}

	}
}
