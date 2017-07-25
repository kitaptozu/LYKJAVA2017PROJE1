package tr.org.linux.kamp.ucgenhipotenus;

import java.util.Scanner;

public class UcgenIslemler {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a;
		double b;

		System.out.println("Lütfen üçgenin a ve b kenar uzunluklarını giriniz!");
		System.out.println("a kenarını giriniz!");
		a = input.nextInt();
		System.out.println("b kenarını giriniz!");
		b = input.nextInt();

		System.out.println("Hipotenüs: " + getHypo(a, b));
		System.out.println("Çevre: " + getPerimate(a, b));
		System.out.println("Alan: " + getArea(a, b));

		input.close();

	}

	public static double getHypo(double a, double b) {
		return Math.hypot(a, b);
	}

	public static double getPerimate(double a, double b) {
		return Math.hypot(a, b) + a + b;
	}

	public static double getArea(double a, double b) {
		return (a * b) / 2;
	}

}
