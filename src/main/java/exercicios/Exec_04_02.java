package exercicios;

import java.util.Scanner;

/*
 Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
 mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).  
 */
public class Exec_04_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < numero; i++) {

			int num = sc.nextInt();

			if (num >= 10 && num <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
