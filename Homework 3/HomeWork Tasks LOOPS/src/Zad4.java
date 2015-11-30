import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N). ");
		Scanner test = new Scanner(System.in);
		System.out.println("Въведете първото число: ");
		int Fact1 = 1;
		int Fact2 = 1;
		int N = test.nextInt();
		if (N < 0) {
			System.out.println("Числото трябва да бъде положително!");
		} else {
			for (int i = 1; i <= N; i++) {
				Fact1 = Fact1 * i;

			}

		}
		System.out.println("Въведете второто число: ");
		int K = test.nextInt();
		if (K < 0) {
			System.out.println("Числото трябва да бъде положително!");
		} else {
			for (int i = 1; i <= K; i++) {
				Fact2 = Fact2 * i;

			}

		}

		System.out.print("N!/K! = ");
		System.out.print(Fact1 / Fact2);
		test.close();
	}

}


