package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Moeda;

public class Exec_06_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Moeda moeda = new Moeda();
		System.out.println("Qual o valor do dolar? ");
		moeda.valorDolar = sc.nextDouble();
		sc.nextLine();

		System.out.println("Quantos dólares quer comprar? ");
		moeda.qtdDolar = sc.nextDouble();
		sc.nextLine();

		System.out.printf("Valor pago em reais = " + "%.2f%n", moeda.converteMoeda());

		sc.close();

	}

}
