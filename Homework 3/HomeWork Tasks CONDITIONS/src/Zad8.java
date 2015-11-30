import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("Въведете число на позиция 'а' : ");
		int a = test.nextInt();
		System.out.println("Въведете число на позиция 'b' : ");
		int b = test.nextInt();
		System.out.println("Въведете число на позиция 'c' : ");
		int c = test.nextInt();
		double x1 = 0;
		double x2 = 0;
		double D = b * b - 4 * a * c;
		if (D > 0) {
			x1 = (-b + Math.sqrt(D))/2 * a;
			x2 = (-b - Math.sqrt(D))/2 * a;
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if (D < 0) {
			System.out.println("Няма реални корени!");
		} else {
			x1 = x2 = (-b)/2 * a;
			System.out.println("x1 = x2 = " + x1);
		}
		test.close();
	}

}
