import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("��������� ��������, ����� ������ ��� ���� ����� - ��������� �������� � ���������� �� ����������. ����������� ������ �� ������� ���������� � � �������� �� ���������.");
		System.out.println("�������� �������� �� �����������: ");
		int a = test.nextInt();
		System.out.println("�������� ���������� �� �����������: ");
		int ha = test.nextInt();
		System.out.println("��������� �� �������� ������ �� ����������� �: a*ha/2");
		int result = 0;
		result = (a*ha)/2;
		System.out.println("������ �� ������� ���������� �: " + result);
		test.close();

	}

}
