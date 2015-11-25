import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println(
				"Направете програма, която чете едно цяло число от конзолата. Ако числото е в интервала от 1 до 5, нека да изписва дали е четно или нечетно. Ако е в интервала от 6 до 15, нека да извежда дали се дели на 3 без остатък.  Ако не попада в споменатите интервали, то нека да ни казва дали е положително, отрицателно или нула.");
		int num = test.nextInt();
		if (num > 0 && num < 6) {
			if (num % 2 == 0) {
				System.out.println("Числото е четно");
			} else {
				System.out.println("Числото е нечетно");
			}
			

		}
		if (num >= 6 && num <= 15 && num % 3 == 0){
			System.out.println("Числото се дели на 3 без остатък");
		}
		else if (num >= 6 && num <= 15 && num % 3 != 0){
			System.out.println("Числото НЕ СЕ дели на 3 без остатък");
		}
		if (num < 0){
			System.out.println("Числото е отрицателно");
		}
		else if (num > 15){
		 System.out.println("Числото е положително");
		}
		else if (num == 0){
			System.out.println("Числото е НУЛА");
		}
		test.close();
}
}