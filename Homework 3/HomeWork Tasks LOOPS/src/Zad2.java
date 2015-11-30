import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7. Числото N се въвежда от конзолата.");
		Scanner test = new Scanner (System.in);
		System.out.println("Моля въведете число: ");
		int N = test.nextInt();
		for (int i = 0; i <= N; i++) {
			if (i % 3 != 0 && i % 7 != 0){
				System.out.print(i + " ");
				
			}
		}
		test.close();
	}

}
