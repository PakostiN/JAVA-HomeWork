import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която показва знака (+ или -) от частното на две реални числа, без да го пресмята.");
		Scanner test = new Scanner (System.in);
		System.out.println("Въведете делимо: ");
		int delimo = test.nextInt();
		System.out.println("Въведете делител: ");
		int delitel = test.nextInt();
		int result = 0;
		result = delimo/delitel;
		if (result < 0){
			System.out.println(" - ");
		}
		else if (result > 0){
			System.out.println(" + ");
		}
		test.close();


	}

}