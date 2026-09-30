package demo2;

public class LeapYear2 {
	public static void main(String[] args) {
		int[] years = { 2026, 2024, 2000, 1900 };
		for (int i = 0; i < years.length; i++) {
			if (isLeapYear(years[i])) {
				System.out.println(years[i] + " 是闰年");
			} else {
				System.out.println(years[i] + " 不是闰年");
			}
		}
	}

	static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
