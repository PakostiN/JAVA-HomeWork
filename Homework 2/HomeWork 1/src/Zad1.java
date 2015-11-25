import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Направете програма, която приема две числа с плаваща запетая съответно дължината и ширината на правоъгълник. Пресметнете лицето на дадения правоъгълник и я изведете на конзолата");
		System.out.println("Въведете страната 'а' на правоъгълника: ");
		double a = test.nextDouble();
		System.out.println("Въведете страната 'b' на правоъгълника: ");
		double b = test.nextDouble();
		double result = 0;
		System.out.println("S = a*b");
		result = a*b;
		System.out.println("Лицето на вашият правоъгълник е: " + result);
		test.close();

	}
	

}
