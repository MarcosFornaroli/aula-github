package exercicios;

import java.util.Scanner;

public class Exec_01_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d, dif;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		dif = a * b - c * d;

		System.out.println("Diferença:" + dif);

		sc.close();

	}

}
