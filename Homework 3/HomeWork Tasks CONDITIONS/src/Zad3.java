import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		System.out.println("�������� ��������, ����� ������ ���-�������� �� ��� ������ �����.");
		System.out.println("�������� ������� �����: ");
		int a = test.nextInt();
		System.out.println("�������� ������� �����: ");
		int b = test.nextInt();
		System.out.println("�������� ������� �����: ");
		int c = test.nextInt();
		if (a > b & a > c){
			System.out.println("������� �������� ����� � ���-������!");
		}
		else if (b > a && b > c){
			System.out.println("������� �������� ����� � ���-������!");
		}
		else {
			System.out.println("���������� �������� ����� � ���-������!");
		}
		test.close();

	}

}
