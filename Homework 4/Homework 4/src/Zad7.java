
public class Zad7 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ����� ����� � ����� �� ����� � ����� ������� �� ������� �������� �����.");
		int n = 75;
		int[] MyArray = { 42, 47, 65, 75, 83, 29, 12, 144 };
		for (int row = 0; row < MyArray.length; row++) {

			if (n == MyArray[row]) {
				row = n;
				System.out.println("������� �� ������� �������� ����� �: " + row);
				break;
			}

		}
	}

}
