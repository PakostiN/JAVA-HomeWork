import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ������� ����� (+ ��� -) �� �������� �� ��� ������ �����, ��� �� �� ��������.");
		Scanner test = new Scanner (System.in);
		System.out.println("�������� ������: ");
		int delimo = test.nextInt();
		System.out.println("�������� �������: ");
		int delitel = test.nextInt();
		int result = 0;
		result = delimo/delitel;
		if (result < 0){
			System.out.println(" - ");
		}
		else if (result > 0){
			System.out.println(" + ");
		}
		test.close();


	}

}