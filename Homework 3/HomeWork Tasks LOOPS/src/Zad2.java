import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N, ����� �� �� ����� �� 3 � 7. ������� N �� ������� �� ���������.");
		Scanner test = new Scanner (System.in);
		System.out.println("���� �������� �����: ");
		int N = test.nextInt();
		for (int i = 0; i <= N; i++) {
			if (i % 3 != 0 && i % 7 != 0){
				System.out.print(i + " ");
				
			}
		}
		test.close();
	}

}
