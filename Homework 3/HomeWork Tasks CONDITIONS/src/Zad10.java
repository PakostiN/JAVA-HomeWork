import java.util.Scanner;

public class Zad10 {
	


	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("Input Number");
		int num = test.nextInt();
		if (num < 0 && num > 999) {
			System.out.println("Wrong number");
			String hundreds = "";
			String tens = "";
			String ones = "";
			int st = num / 100;
			switch (st) {
			case 0:
				break;
			case 1:
				hundreds = "One Hundred";
				break;
			case 2:
				hundreds = "Two Hundred";
				break;
			case 3:
				hundreds = "Three Hundred";
				break;
			case 4:
				hundreds = "Four Hundred";
				break;
			case 5:
				hundreds = "Five Hundred";
				break;
			case 6:
				hundreds = "Six Hundred";
				break;
			case 7:
				hundreds = "Seven Hundred";
				break;
			case 8:
				hundreds = "Eight Hundred";
				break;
			case 9:
				hundreds = "Nine Hundred";
				break;
			}

			int Ostatak = num % 100;
			if (Ostatak < 20 && Ostatak > 9) {
				switch (Ostatak) {
				case 10:
					tens = "Ten";
					break;
				case 11:
					tens = "Eleven";
					break;
				case 12:
					tens = "Twelve";
					break;
				case 13:
					tens = "Thirteen";
					break;
				case 14:
					tens = "Fourteen";
					break;
				case 15:
					tens = "Fifteen";
					break;
				case 16:
					tens = "Sixteen";
					break;
				case 17:
					tens = "Seventeen";
					break;
				case 18:
					tens = "Eighteen";
					break;
				case 19:
					tens = "Nineteen";
					break;
				}
				System.out.println(hundreds + " " + tens);
			} else {
				int tenz = Ostatak / 10;
				switch (tenz) {
				case 2:
					tens = "Twenty";
					break;
				case 3:
					tens = "Thirty";
					break;
				case 4:
					tens = "Fourty";
					break;
				case 5:
					tens = "Fifty";
					break;
				case 6:
					tens = "Sixty";
					break;
				case 7:
					tens = "Seventy";
					break;
				case 8:
					tens = "Eighty";
					break;
				case 9:
					tens = "Ninety";
					break;
				}

			}
			int onez = Ostatak % 10;
			switch (onez) {
			case 0:
				break;
			case 1:
				ones = "One";
				break;
			case 2:
				ones = "Two";
				break;
			case 3:
				ones = "Three";
				break;
			case 4:
				ones = "Four";
				break;
			case 5:
				ones = "Five";
				break;
			case 6:
				ones = "Six";
				break;
			case 7:
				ones = "Seven";
				break;
			case 8:
				ones = "Eight";
				break;
			case 9:
				ones = "Nine";
				break;
			}
			System.out.println(hundreds + " " + tens + " " + ones);
			test.close();
		}
	}

}
