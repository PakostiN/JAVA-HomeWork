import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("��������� ��������, ����� ���� ���� ���� ����� �� ���������. ��� �� � ����������� � � ����� �������� �Negative Even�; ��� �� � ����������� � ������� -> �Negative Odd�; ��� �� � ����������� � ����� -> �Positive Even�; ��� �� � ����������� � �������� -> �Positive Odd�; ��� ������� � ���� �������� �Zero�");
		int num = test.nextInt();
		if (num % 2 == 0 && num < 0) {
			System.out.println("Negative Even");

		} else if (num % 2 != 0 && num < 0) {
			System.out.println("Negative odd");
		} else if (num % 2 == 0 && num > 0) {
			System.out.println("Positive Even");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println("Positive odd");
		} else {
			System.out.println("Zero");
		}
		test.close();
	}
	

}