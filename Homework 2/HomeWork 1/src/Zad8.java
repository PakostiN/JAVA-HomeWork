import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Напишете израз, който да проверява дали дадено цяло число е четно или нечетно. Изведете резултатът.");
		System.out.println("Въведете числото: ");
		int num = test.nextInt();
		boolean result = num % 2 == 0;
		System.out.println("Числото е четно: " + result);
		boolean result1 = num % 2 != 0;
		System.out.println("Числото е нечетно: " + result1);
		test.close();				
	}

}
