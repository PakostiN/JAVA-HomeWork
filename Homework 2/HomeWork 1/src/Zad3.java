import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		System.out.println("�������� �� ������ �� ������� �� ���������� �� ���������� �� ���������.  ��������� ��������, ����� ������� �������� ����������: ���, �������, ������ (0, 120), ��� (���������� '�' ��� '�'), ���, �������. ��������� ����������� ������ ����� � ������������ ������� ����������. ��������� �� ��������� ������� ��������� �� �������� � ���� ���� �������� �� ���������");
		System.out.println("�������� ����� �� �������: ");
		String name = test.nextLine();
		System.out.println("�������� ��������� �� �������: ");
		String family = test.nextLine();
		System.out.println("�������� �������� �� �������: ");
		byte years = test.nextByte();
		System.out.println("�������� ����� �� �������: ");
		char gender = test.next().charAt(0);
		System.out.println("�������� ��� �� �������: ");
		long EGN = test.nextLong();
		System.out.println("�������� �������� �� �������: ");
		int phone = test.nextInt();
		System.out.println(" ");
		System.out.println("��� � �������: " + name + " " + family);
		System.out.println("������: " + years);
		System.out.println("���: " + gender);
		System.out.println("���: " + EGN);
		System.out.println("������� �� ������: " + phone);
		test.close();
	}

}
