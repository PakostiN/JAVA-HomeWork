import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("Направете програма, която чете едно цяло число от конзолата. Ако то е отрицателно и е четно изведете „Negative Even”; Ако то е отрицателно и нечетно -> „Negative Odd”; Ако то е положително и четно -> „Positive Even”; Ако то е положително и нечетено -> „Positive Odd”; Ако числото е нула изведете „Zero”");
		int num = test.nextInt();
		if (num % 2 == 0 && num < 0) {
			System.out.println("Negative Even");

		} else if (num % 2 != 0 && num < 0) {
			System.out.println("Negative odd");
		} else if (num % 2 == 0 && num > 0) {
			System.out.println("Positive Even");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println("Positive odd");
		} else {
			System.out.println("Zero");
		}
		test.close();
	}
	

}