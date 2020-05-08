package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir.
 Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
 Apresente a m�dia ponderada para cada um destes conjuntos de 3 valores, sendo que o
 primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.  
 */
public class Exec_04_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}