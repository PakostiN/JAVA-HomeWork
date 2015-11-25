import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Напишете проргама която приема 2 целочислени числа за вход и извежда остатъка от делението на числата.");
		System.out.println("Въведете първото число: ");
		int num = test.nextInt();
		System.out.println("Въведете второто число: ");
		int num1 = test.nextInt();
		int result = 0;
		result = num % num1;
		System.out.println("Остатъка от делението на двете числа е: " + result);
		test.close();
	}
	

}
