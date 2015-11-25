import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която намира по-голямото от две дадени числа.");
		Scanner test = new Scanner (System.in);
		System.out.println("Въведете първото число: ");
		int a = test.nextInt();
		System.out.println("Въведете второто число: ");
		int b = test.nextInt();
		if (a > b){
			System.out.println("Първото въведено число е по-голямо от второто. ");	
		}
		else {
		System.out.println("Второто въведено число е по-голямо от първото. ");
		}
		test.close();
	}

}
