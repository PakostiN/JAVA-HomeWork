import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� �������� ����� ������ 2 ����������� ����� �� ���� � ������� �������� �� ��������� �� �������.");
		System.out.println("�������� ������� �����: ");
		int num = test.nextInt();
		System.out.println("�������� ������� �����: ");
		int num1 = test.nextInt();
		int result = 0;
		result = num % num1;
		System.out.println("�������� �� ��������� �� ����� ����� �: " + result);
		test.close();
	}
	

}
