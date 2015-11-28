import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		System.out.println("Напишете програма, която преобразува дадено число в интервала [0,999] в текст, съответващ на английското произношение. Пример:  0 -> zero; 11 -> eleven; 81 -> eighty one; 817 -> eight hundred seventeen");
		int num = test.nextInt();
		if (num < 0 || num > 999) {
			System.out.println("Невалидно число!");
		}
		if (num == 0) {
			System.out.println("Zero");
		} else if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else if (num == 4) {
			System.out.println("Four");
		} else if (num == 5) {
			System.out.println("Five");
		} else if (num == 6) {
			System.out.println("Six");
		} else if (num == 7) {
			System.out.println("Seven");
		} else if (num == 8) {
			System.out.println("Eight");
		} else if (num == 9) {
			System.out.println("Nine");
		} else if (num == 10) {
			System.out.println("Ten");
		} else if (num == 111) {
			System.out.println("Eleven");
		} else if (num == 12) {
			System.out.println("Twelve");
		} else if (num == 13) {
			System.out.println("Thirteen");
		} else if (num == 14) {
			System.out.println("Fourteen");
		} else if (num == 15) {
			System.out.println("Fifteen");
		} else if (num == 16) {
			System.out.println("Sixteen");
		} else if (num == 17) {
			System.out.println("Seventeen");
		} else if (num == 18) {
			System.out.println("Eighteen");
		} else if (num == 19) {
			System.out.println("Nineteen");
		}
		if (num >= 20 && num <= 29) {
			System.out.print("Twenty ");
			if (num > 20 && num < 22) {
				System.out.print("One");
			}
		}

		else if (num > 21 && num < 23) {
			System.out.print("Two");
		} else if (num > 22 && num < 24) {
			System.out.print("Three");
		} else if (num > 23 && num < 25) {
			System.out.print("Four");
		} else if (num > 24 && num < 26) {
			System.out.print("Five");
		} else if (num > 25 && num < 27) {
			System.out.print("Six");
		} else if (num > 26 && num < 28) {
			System.out.print("Seven");
		} else if (num > 27 && num < 29) {
			System.out.print("Eight");
		} else if (num > 28 && num < 30) {
			System.out.print("Nine");
		}
		if (num >= 30 && num <= 39) {
			System.out.print("Thirty ");
			if (num > 30 && num < 32) {
				System.out.print("One");
			}
		}

		else if (num > 31 && num < 33) {
			System.out.print("Two");
		} else if (num > 32 && num < 34) {
			System.out.print("Three");
		} else if (num > 33 && num < 35) {
			System.out.print("Four");
		} else if (num > 34 && num < 36) {
			System.out.print("Five");
		} else if (num > 35 && num < 37) {
			System.out.print("Six");
		} else if (num > 36 && num < 38) {
			System.out.print("Seven");
		} else if (num > 37 && num < 39) {
			System.out.print("Eight");
		} else if (num > 38 && num < 40) {
			System.out.print("Nine");
		}
		if (num >= 40 && num <= 49) {
			System.out.print("Fourty ");
			if (num > 40 && num < 42) {
				System.out.print("One");
			}
		}

		else if (num > 41 && num < 43) {
			System.out.print("Two");
		} else if (num > 42 && num < 44) {
			System.out.print("Three");
		} else if (num > 43 && num < 45) {
			System.out.print("Four");
		} else if (num > 44 && num < 46) {
			System.out.print("Five");
		} else if (num > 45 && num < 47) {
			System.out.print("Six");
		} else if (num > 46 && num < 48) {
			System.out.print("Seven");
		} else if (num > 47 && num < 49) {
			System.out.print("Eight");
		} else if (num > 48 && num < 50) {
			System.out.print("Nine");
		}
		if (num >= 50 && num <= 59) {
			System.out.print("Fifty ");
			if (num > 50 && num < 52) {
				System.out.print("One");
			}
		}

		else if (num > 51 && num < 53) {
			System.out.print("Two");
		} else if (num > 52 && num < 54) {
			System.out.print("Three");
		} else if (num > 53 && num < 55) {
			System.out.print("Four");
		} else if (num > 54 && num < 56) {
			System.out.print("Five");
		} else if (num > 55 && num < 57) {
			System.out.print("Six");
		} else if (num > 56 && num < 58) {
			System.out.print("Seven");
		} else if (num > 57 && num < 59) {
			System.out.print("Eight");
		} else if (num > 58 && num < 60) {
			System.out.print("Nine");
		}
		if (num >= 60 && num <= 69) {
			System.out.print("Sixty ");
			if (num > 60 && num < 62) {
				System.out.print("One");
			}
		} else if (num > 61 && num < 63) {
			System.out.print("Two");
		} else if (num > 62 && num < 64) {
			System.out.print("Three");
		} else if (num > 63 && num < 65) {
			System.out.print("Four");
		} else if (num > 64 && num < 66) {
			System.out.print("Five");
		} else if (num > 65 && num < 67) {
			System.out.print("Six");
		} else if (num > 66 && num < 68) {
			System.out.print("Seven");
		} else if (num > 67 && num < 69) {
			System.out.print("Eight");
		} else if (num > 68 && num < 70) {
			System.out.print("Nine");
		}
//		if (num >= 100 && num <= 199) {
//			System.out.print("One Hundred ");
//			if (num >= 120 && num <= 129) {
//				System.out.print("Twenty ");
//			}
//
//		}
//
//		else if (num > 120 && num < 122) {
//			System.out.print("One");
//		} else if (num > 121 && num < 123) {
//			System.out.println("Two");
//		}
	}


	}
