import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("��������� ��������, ����� ������ ��� ����� � ������� ������� ��������� ��������� � �������� �� ������������. ����������� ������ �� ������� ������������ � � �������� �� ���������");
		System.out.println("�������� �������� '�' �� �������������: ");
		double a = test.nextDouble();
		System.out.println("�������� �������� 'b' �� �������������: ");
		double b = test.nextDouble();
		double result = 0;
		System.out.println("S = a*b");
		result = a*b;
		System.out.println("������ �� ������ ������������ �: " + result);
		test.close();

	}
	

}
