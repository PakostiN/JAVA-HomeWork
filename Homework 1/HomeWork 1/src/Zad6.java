import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ���� �� ��������� ������� �r� �� ���� � ��������� ������� ��������� � ����.");
		System.out.println("�������� ������� �� �������� ���������: ");
		double r = test.nextDouble();
		double result = 0;
		result = 2*3.14*r;
		System.out.println("����������� �� �������� ��������� � : " + result);
		result = 3.14*(r*r);
		System.out.println("������ �� �������� ��������� �: " + result);
		test.close();
	
	}

}
