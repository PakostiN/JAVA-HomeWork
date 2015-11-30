import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която отпечатва на конзолата числата от 1 до N. Числото N се въвежда от конзолата.");
		Scanner test = new Scanner (System.in);
		System.out.println("Моля въведете число: ");
		int num = test.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			
		}
		test.close();

	}

}
