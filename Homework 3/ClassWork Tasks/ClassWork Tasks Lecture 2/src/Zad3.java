import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ������ ��� ����� N � M. ���������� ������ �� ��������� ����� � N �� ������ �.");
		System.out.println("�������� ������ �����: ");
		int n = test.nextInt();
		System.out.println("�������� �������� �� �������: ");
		int m = test.nextInt();
		int res = 1;
		for (int i = 0; i < m; i++) {
			res = res * n;
			
		}
		System.out.println("��������� �� ������ ����� �� ������ N � :" + res);
		test.close();

	}
	

}
