import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� �����, ����� �� ��������� ���� ������ ���� ����� � ����� ��� �������. �������� ����������.");
		System.out.println("�������� �������: ");
		int num = test.nextInt();
		boolean result = num % 2 == 0;
		System.out.println("������� � �����: " + result);
		boolean result1 = num % 2 != 0;
		System.out.println("������� � �������: " + result1);
		test.close();				
	}

}
