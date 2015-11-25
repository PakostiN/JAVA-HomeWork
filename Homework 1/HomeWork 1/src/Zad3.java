import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		System.out.println("Компания се нуждае от система за съхранение на информация за служители.  Направете програма, която изисква следната информация: Име, Фамилия, Години (0, 120), пол (еднобуквен 'м' или 'ж'), ЕГН, телефон. Подберете подходящите типове данни и декларирайте нужните променливи. Прочетете от конзолата нужната иформация за служител и след това изведете на конзолата");
		System.out.println("Въведете името на клиента: ");
		String name = test.nextLine();
		System.out.println("Въведете фамилията на клиента: ");
		String family = test.nextLine();
		System.out.println("Въведете годините на клиента: ");
		byte years = test.nextByte();
		System.out.println("Въведете полът на клиента: ");
		char gender = test.next().charAt(0);
		System.out.println("Въведете ЕГН на клиента: ");
		long EGN = test.nextLong();
		System.out.println("Въведете телефона на клиента: ");
		int phone = test.nextInt();
		System.out.println(" ");
		System.out.println("Име и Фамилия: " + name + " " + family);
		System.out.println("Години: " + years);
		System.out.println("Пол: " + gender);
		System.out.println("ЕГН: " + EGN);
		System.out.println("Телефон за връзка: " + phone);
		test.close();
	}

}
