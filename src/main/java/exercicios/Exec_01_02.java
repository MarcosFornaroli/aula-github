package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec_01_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		area = pi * (raio * raio);

		System.out.printf("Area = " + "%.4f%n", area);

		sc.close();

	}

}
