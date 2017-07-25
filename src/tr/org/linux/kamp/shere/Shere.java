package tr.org.linux.kamp.shere;

import java.util.Scanner;

public class Shere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("Lütfen kürenin yarıçapını giriniz!");
			double r;
			r = input.nextDouble();
			System.out.println("Kürenin Hacmi: " + getHacim(r));
		}

	}

	public static double getHacim(double r) {
		return 4 / 3 * Math.PI * Math.pow(r, 3);
	}

}
