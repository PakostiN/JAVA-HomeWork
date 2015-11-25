import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		System.out.println("Напишете програма, която намира най-голямото от три дадени числа.");
		System.out.println("Въведете първото число: ");
		int a = test.nextInt();
		System.out.println("Въведете второто число: ");
		int b = test.nextInt();
		System.out.println("Въведете третото число: ");
		int c = test.nextInt();
		if (a > b & a > c){
			System.out.println("Първото въведено число е най-голямо!");
		}
		else if (b > a && b > c){
			System.out.println("Второто въведено число е най-голямо!");
		}
		else {
			System.out.println("Последното въведено число е най-голямо!");
		}
		test.close();

	}

}
