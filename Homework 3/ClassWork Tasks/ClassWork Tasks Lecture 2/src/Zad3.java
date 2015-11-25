import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Напишете програма, която приема две числа N и M. Програмата трябва да пресметне колко е N на степен М.");
		System.out.println("Въведете вашето число: ");
		int n = test.nextInt();
		System.out.println("Въведете степента на числото: ");
		int m = test.nextInt();
		int res = 1;
		for (int i = 0; i < m; i++) {
			res = res * n;
			
		}
		System.out.println("Резултата от вашето число на степен N е :" + res);
		test.close();

	}
	

}
