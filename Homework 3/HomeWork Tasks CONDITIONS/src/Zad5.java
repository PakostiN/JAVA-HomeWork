import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("�������� ��������, ����� ������ ��� ���� �����. �������� �� ��������� ���� ���� �� ���� ���� ��������� ���������� � ������� �� ��������  �� ���������� ��� �����.");
		System.out.println("�������� ������� �������: ");
		int a = test.nextInt();
		System.out.println("�������� ������� �������: ");
		int b = test.nextInt();
		System.out.println("�������� ������� �������: ");
		int c = test.nextInt();
		if (a < b + c && b < a + c && c < a + b){
			System.out.println("���� �� ���� ��������� ���������� ��� ���������� �� ��� �������!");
		}
		else {
			System.out.println("������ �� ���� ��������� ���������� ��� ���������� �� ��� �������!");
		}
		
		test.close();

	}

}
