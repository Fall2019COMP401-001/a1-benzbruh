package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int itemsInStore = scan.nextInt();
		String[] itemArray = new String[itemsInStore];
		double[] priceArray = new double[itemsInStore];
		double[] purchase = new double[itemsInStore];
		int[] prodCounter = new int[itemsInStore];
		int[] custCounter = new int[itemsInStore];

		for (int j = 0; itemsInStore > j; j++) {

			itemArray[j] = scan.next();
			priceArray[j] = scan.nextDouble();

		}
		int numOfCust = scan.nextInt();
		String[] fullNames = new String[numOfCust];
		double[] totalForAll = new double[numOfCust];

		for (int i = 0; numOfCust > i; i++) {

			String firstName = scan.next();
			String lastName = scan.next();
			fullNames[i] = firstName + " " + lastName;
			int numOfPurchaces = scan.nextInt();

			for (int h = 0; numOfPurchaces > h; h++) {
				int numOfProduce = scan.nextInt();
				String itemName = scan.next();

				for (int j = 0; itemArray.length > j; j++) {
					if (itemName.equals(itemArray[j])) {

						prodCounter[j] += 1;
						custCounter[j] += numOfProduce;

					}

				}

			}

		}

		for (int j = 0; itemArray.length > j; j++) {
			if (prodCounter[j] == 0) {
				System.out.println("No customers bought " + itemArray[j]);
			} else {
				System.out.println(prodCounter[j] + " customers bought " + custCounter[j] + " " + itemArray[j]);
			}
		}
	}
}
