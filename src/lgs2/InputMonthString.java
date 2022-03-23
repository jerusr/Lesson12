package lgs2;

public class InputMonthString {
	/*
	 * This class checks month input from the user and assigns value of string, when
	 * it's correct
	 */

	Months[] monMas = Months.values();
	private String string;
	boolean flag = false;

	public InputMonthString(String string) {
		super();
		// boolean flag = false;
		for (Months m : monMas) {
			if (m.name().equals(string)) {
				System.out.println("�������� ����� " + string + " ����");
				flag = true;
			}
		}

		if (flag) {
			this.string = string;
		} else {
			try {
				throw new WrongInputConsoleParametersException("������ ����� �� ����, ��������� ��:");
			} catch (WrongInputConsoleParametersException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public String getString() {
		return string;
	}

}
