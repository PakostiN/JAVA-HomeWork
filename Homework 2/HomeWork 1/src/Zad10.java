import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Направете програма, която приема две цели числа - съответно страната и височината на триъгълник. Пресметнете лицето на дадения триъгълник и я изведете на конзолата.");
		System.out.println("Въведете страната на триъгълника: ");
		int a = test.nextInt();
		System.out.println("Въведете височината на триъгълника: ");
		int ha = test.nextInt();
		System.out.println("Формулата за намиране лицето на триъгълника е: a*ha/2");
		int result = 0;
		result = (a*ha)/2;
		System.out.println("Лицето на дадения триъгълник е: " + result);
		test.close();

	}

}
