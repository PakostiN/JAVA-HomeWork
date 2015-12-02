
public class Zad3 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която създава масив с 10 елемента от целочислен тип и инициализира елементите със стойност индекса  умножен по 10.");
		int[] MyArray = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		for (int i = 0; i <= MyArray.length; i++) {
			result = i * 10;
			System.out.print(result + " ");
			
		}
		

	}

}
