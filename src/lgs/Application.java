package lgs;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		/* Array of helm materials */
		// String[] list = { "wood", "iron", "alcantara", "leather", "rubber" };

		List<String> list1 = new ArrayList<>();
		list1.add("wood");
		list1.add("iron");
		list1.add("alcantara");
		list1.add("leather");
		list1.add("rubber");

		/*
		 * random and array declaration The number of rows and columns defines on start
		 * by random but is constant till the end of the Application
		 */
		Random random = new Random();
		int x = random.nextInt(9) + 1; // rows, +1 (from 1 till 10)
		int y = random.nextInt(9) + 1; // columns +1 (from 1 till 10)
		// 10 - is the limit of numbers

		List<ArrayList<Auto>> autos = new ArrayList<>();

		/* Console block declaration */
		MainMenu mainMenu = new MainMenu();
		Menu2 menu2 = new Menu2();
		Scanner sc = new Scanner(System.in);
		String menuSting;
		InputMenuString inputMenuString;

		/* printing of both menus */
		mainMenu.printMenu();
		menu2.printMenu();

		/* Starting of the console menu block */
		while (true) {
			inputMenuString = new InputMenuString(sc.next());
			menuSting = inputMenuString.getString();

			if (inputMenuString.flag) {

				switch (menuSting) {
				case "1": {

					if (!autos.isEmpty()) {
						autos.clear();
					}

					/*
					 * fill each element of the array with random auto(constructor with all random
					 * elements)
					 */
					for (int i = 0; i < x; i++) {

						ArrayList<Auto> autos1 = new ArrayList<>();
						for (int j = 0; j < y; j++) {

							Auto auto = new Auto(random.nextInt(500), (random.nextInt(120) + 1900),
									new Helm(random.nextFloat(), list1.get(random.nextInt(list1.size()))),
									new Engine(random.nextInt(24)));
							autos1.add(auto);
							// System.out.println(auto + " " + j); -- checking of correction

						}
						autos.add(autos1);
						// System.out.println(autos1 + " " + i); -- checking of correction

					}

					System.out.println("Random filled array [ " + x + " ] [ " + y + "]  printed:");
					System.out.println(autos);
					System.out.println("Make a choise to continue...");
					menu2.printMenu();

					break;
				}

				case "2": {
					if (autos.isEmpty()) {
						System.out.println("Array is empty, input [1] first, please!"); // when input [2] first then the
																						// ArrayList will be empty. User
																						// needs to press [1] first

					} else {
						Auto autoRandom = new Auto(random.nextInt(500), (random.nextInt(120) + 1900),
								new Helm(random.nextFloat(), list1.get(random.nextInt(list1.size()))),
								new Engine(random.nextInt(24)));
						for (int i = 0; i < autos.size(); i++) {

							for (int j = 0; j < autos.get(i).size(); j++) {
								autos.get(i).set(j, autoRandom);
							}
						}

						System.out.println("Filled array [ " + x + " ] [ " + y + "]  printed:");
						System.out.println(autos);
					}

					System.out.println("Make a choise to continue...");
					menu2.printMenu();
					break;
				}

				case "menu": {
					mainMenu.printMenu();
					break;
				}

				case "q": {
					System.out.println("Application closed. Buy!");
					System.exit(0);
					sc.close();
				}

				default: {

					break;
				}

				}

			}

		}

	}

}