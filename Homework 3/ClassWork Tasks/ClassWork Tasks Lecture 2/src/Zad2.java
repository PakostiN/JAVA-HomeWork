import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println(
				"��������� ��������, ����� ���� ���� ���� ����� �� ���������. ��� ������� � � ��������� �� 1 �� 5, ���� �� ������� ���� � ����� ��� �������. ��� � � ��������� �� 6 �� 15, ���� �� ������� ���� �� ���� �� 3 ��� �������.  ��� �� ������ � ����������� ���������, �� ���� �� �� ����� ���� � �����������, ����������� ��� ����.");
		int num = test.nextInt();
		if (num > 0 && num < 6) {
			if (num % 2 == 0) {
				System.out.println("������� � �����");
			} else {
				System.out.println("������� � �������");
			}
			

		}
		if (num >= 6 && num <= 15 && num % 3 == 0){
			System.out.println("������� �� ���� �� 3 ��� �������");
		}
		else if (num >= 6 && num <= 15 && num % 3 != 0){
			System.out.println("������� �� �� ���� �� 3 ��� �������");
		}
		if (num < 0){
			System.out.println("������� � �����������");
		}
		else if (num > 15){
		 System.out.println("������� � �����������");
		}
		else if (num == 0){
			System.out.println("������� � ����");
		}
		test.close();
}
}