import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ������ ��-�������� �� ��� ������ �����.");
		Scanner test = new Scanner (System.in);
		System.out.println("�������� ������� �����: ");
		int a = test.nextInt();
		System.out.println("�������� ������� �����: ");
		int b = test.nextInt();
		if (a > b){
			System.out.println("������� �������� ����� � ��-������ �� �������. ");	
		}
		else {
		System.out.println("������� �������� ����� � ��-������ �� �������. ");
		}
		test.close();
	}

}
