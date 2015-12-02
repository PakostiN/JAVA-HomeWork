
public class Zad9 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която обръща стойностите на един масив.");
		int[] MyArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int temp[] = new int[MyArray.length];
		for (int i = 0; i < MyArray.length; i++) {
			temp[i] = MyArray[MyArray.length - i-1];
			System.out.print(temp[i] + " ");
		}

	}
}
