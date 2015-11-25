import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("Напишете програма, която кара потребителя за въвежда числа и ги сумира. Края на програмата настъпва, единствено когато потребителя въведе числото 0.");
		int num = 0;
		int result = 0;
		for (;;) {
			System.out.println("Въведете число:");
			num = test.nextInt();
			result += num;
			if (num == 0) {
				System.out.println("Чао");
				break;

			}

			System.out.println("Сумата е:  " + result);

		}
		test.close();
	}

}
