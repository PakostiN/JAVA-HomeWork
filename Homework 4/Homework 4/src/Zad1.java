
public class Zad1 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ������ ����� �� �������� ����� �������� � �����.");
		int[] MyArray = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		for (int i = 0; i <= MyArray.length; i++) {
			if (i % 2 == 0){
				result += i;
			}
			
		}
		System.out.print(result + " ");
	}

}
