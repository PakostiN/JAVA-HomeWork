import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N. ������� N �� ������� �� ���������.");
		Scanner test = new Scanner (System.in);
		System.out.println("���� �������� �����: ");
		int num = test.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			
		}
		test.close();

	}

}
