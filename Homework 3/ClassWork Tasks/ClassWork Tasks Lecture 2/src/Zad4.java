import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ���� ����������� �� ������� ����� � �� ������. ���� �� ���������� ��������, ���������� ������ ����������� ������ ������� 0.");
		int num = 0;
		int result = 0;
		for (;;) {
			System.out.println("�������� �����:");
			num = test.nextInt();
			result += num;
			if (num == 0) {
				System.out.println("���");
				break;

			}

			System.out.println("������ �:  " + result);

		}
		test.close();
	}

}
