
public class Zad8 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ��������� ���� ���� ����� � ����������.");
		int[] MyArray = { 1, 2, 5, 8, 1 };
		for (int i = 0; i < MyArray.length; i++) {
			if (MyArray[i] != MyArray[MyArray.length - i - 1]) {
				System.out.println("������� �� � ����������");
				return;
			} 

		}
		System.out.println("������� � ����������!");

	}

}
