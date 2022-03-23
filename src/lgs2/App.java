package lgs2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class App {

	public static void main(String[] args) {

		/* arrays for Months and Seasons enums for for-loops iterations */
//		Months[] monMas = Months.values();
//		Seasons[] seasMas = Seasons.values();

		List<Months> monList = new ArrayList<>();
		List<Seasons> seasList  = new ArrayList<>();
		
		if (!monList.isEmpty()) {
			monList.clear();
		} else {
			Collections.addAll(monList, Months.values());
		}
		
		if (!seasList.isEmpty()) {
			seasList.clear();
		} else {
			Collections.addAll(seasList, Seasons.values());
		}
		
		
//		System.out.println(monList);   - checking
//		System.out.println(seasList);   - checking
	
		
		Scanner sc;
		String menuSting;
		Menu menu = new Menu();
		Menu2 menu2 = new Menu2();

		while (true) {
			System.out.println("Введіть місяць, будь-ласка: ");
			sc = new Scanner(System.in);
			String month;

			/* checking of string 'month' from user */
			InputMonthString inputMonthString = new InputMonthString(sc.next().toUpperCase());
			month = inputMonthString.getString();

			if (inputMonthString.flag) {

				Months m = Months.valueOf(month);
				String season = m.getSeasons().name().toString(); // name of the relative season
				int days = m.getDays();

				menu.printMenu();
				menu2.printMenu();

				while (true) {

					/* checking of menuString from the user */
					InputMenuString inputMenuString = new InputMenuString(sc.next().toLowerCase());

					menuSting = inputMenuString.getString();

					if (inputMenuString.flag) {
						switch (menuSting) {
						case "1": {

							System.out.println("Всі місяці з такою ж порою року: ");
							for (Months mon : monList) {
								if (mon.getSeasons().name().equals(season)) {
									printMonthName(mon);
								}

							}

							break;

						}

						case "2": {

							System.out.println("Всі місяці, які мають таку саму кількість днів: ");
							for (Months mon : monList) {
								if (mon.getDays() == days) {
									printMonthName(mon);
								}

							}
							break;

						}

						case "3": {
							System.out.println("Всі місяці, які мають меншу кількість днів: ");
							for (Months mon : monList) {

								if (mon.getDays() < days) {
									printMonthName(mon);

								}

							}

							if (days == 28) {
								System.out.println("немає таких місяців");
							}
							break;

						}

						case "4": {

							System.out.println("Всі місяці, які мають більшу кількість днів: ");
							for (Months mon : monList) {

								if (mon.getDays() > days) {
									printMonthName(mon);

								}

							}

							if (days == 31) {
								System.out.println("немає таких місяців");
							}
							break;

						}

						case "5": {
							String nextSeason;
							int ordinal = m.getSeasons().ordinal();
							if (ordinal == (seasList.size() - 1)) {
								ordinal = 0;
								nextSeason = seasList.get(ordinal).toString();
							}

							else {
								nextSeason = seasList.get(ordinal + 1).toString();
							}

							System.out.println("Наступна пора року " + nextSeason);

							break;

						}

						case "6": {
							String beforeSeason;
							int ordinal = m.getSeasons().ordinal();
							if (ordinal == 0) {
								ordinal = (seasList.size() - 1);
								beforeSeason = seasList.get(ordinal).toString();
							}

							else {
								beforeSeason = seasList.get(ordinal - 1).toString();
							}

							System.out.println("Попередня пора року " + beforeSeason);
							break;

						}

						case "7": {

							System.out.println("Всі місяці, які мають парну кількість днів: ");
							for (Months mon : monList) {
								if ((mon.getDays() % 2) == 0) {
									printMonthName(mon);
								}

							}

							break;

						}

						case "8": {
							System.out.println("Всі місяці, які мають непарну кількість днів: ");
							for (Months mon : monList) {
								if ((mon.getDays() % 2) == 1) {
									printMonthName(mon);
								}

							}

							break;

						}

						case "9": {
							if ((days % 2) == 0) {
								System.out.print("Місяць " + month + " має парну кількість днів");
							} else {
								System.out.print("Місяць " + month + " має непарну кількість днів");
							}
							System.out.println(", а саме " + days);
							break;

						}

						case "menu": {

							menu.printMenu();
							break;
						}

						case "month": {

							System.out.println("Було введений такий місяць: " + month);
							break;
						}

						case "q": {

							System.out.println("Програму завершено... До побачення!");
							System.exit(0);
							sc.close();
						}

						}
						menu2.printMenu();
					}
				}

			}

		}

	}

	/* Method that prints month name in simple way */
	private static void printMonthName(Months month) {
		System.out.println(month.name().toString());
	}

}