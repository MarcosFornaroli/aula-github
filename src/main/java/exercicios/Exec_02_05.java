package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 A seguir, calcule e mostre o valor da conta a pagar. 
 */
public class Exec_02_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String produto = null;
		int codigo = sc.nextInt();
		int qtd = 0;
		double valor = 0.0;
		double valorPagar = 0.0;

		if (codigo >= 1 && codigo <= 5) {
			qtd = sc.nextInt();
		}
		switch (codigo) {
		case 1:
			valor = 4.00;
			produto = "Cachorro Quente";
			break;
		case 2:
			valor = 4.50;
			produto = "X-Salada";
			break;
		case 3:
			valor = 5.00;
			produto = "X-Bacon";
			break;
		case 4:
			valor = 2.00;
			produto = "Torrada Simples";
			break;
		case 5:
			valor = 1.50;
			produto = "Refrigerante";
			break;
		default:
			System.out.println("Código produto informado não existe!!!");
			break;
		}

		if (codigo >= 1 && codigo <= 5) {
			valorPagar = qtd * valor;
			System.out.printf("O valor total a pagar do(a) " + produto + " é de R$ " + "%.2f%n", valorPagar);
		}
		sc.close();
	}

}
