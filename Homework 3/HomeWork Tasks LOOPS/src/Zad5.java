import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� �������� N!*K!/(N-K)! �� ������ N � K. ");
		Scanner test = new Scanner(System.in);
		int Fact1 = 1;
		int Fact2 = 1;
		int result1 = 1;
		int result2 = 1;
		System.out.println("�������� ������� �����: ");
		int N = test.nextInt();
		if (N < 0) {
			System.out.println("������� ������ �� ���� �����������! ");
		} else {
			for (int i = 1; i < N; i++) {
				Fact1 = Fact1 * i;

			}
		}

		System.out.println("�������� ������� �����: ");
		int K = test.nextInt();
		if (K < 0) {
			System.out.println("������� ������ �� ���� �����������! ");
		} else {
			for (int i = 1; i < K; i++) {
				Fact2 = Fact2 * i;
			}
		}
		for (int i = 1; i < Fact1 - Fact2; i++) {
			result2 = result2 * i;
		}
		result1 = Fact1 * Fact2;
		System.out.print("N!*K!/(N-K)! = ");
		System.out.print(result1 / result2);
		test.close();

	}

}
