import java.util.Scanner;

public abstract class Zad9 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		System.out.println("�������� ��������, ����� ������ ���-�������� �� ��� ������ �����.");
		System.out.println(" ");
		System.out.println("�������� ������� �����: ");
		int num1 = test.nextInt();
		System.out.println("�������� ������� �����: ");
		int num2 = test.nextInt();
		System.out.println("�������� ������� �����: ");
		int num3 = test.nextInt();
		System.out.println("�������� ���������� �����: ");
		int num4 = test.nextInt();
		System.out.println("�������� ������ �����: ");
		int num5 = test.nextInt();
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
			System.out.println("�������: " + num1 + " � ���-������ �� ���������� �� ��� �����!" );
		}
		else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
			System.out.println("�������: " + num2 + " � ���-������ �� ���������� �� ��� �����!" );
		}
		else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
			System.out.println("�������: " + num3 + " � ���-������ �� ���������� �� ��� �����!" );
		}
		else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
			System.out.println("�������: " + num4 + " � ���-������ �� ���������� �� ��� �����!" );
		}
		else {
			System.out.println("�������: " + num5 + " � ���-������ �� ���������� �� ��� �����!" );
		}
		test.close();

	}
	

}
