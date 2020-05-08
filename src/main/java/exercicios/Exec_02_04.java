package exercicios;

import java.util.Scanner;

/*
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
 sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
 mínima de 1 hora e máxima de 24 horas. 
 */
public class Exec_02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hrInicial = sc.nextInt();
		int hrFinal = sc.nextInt();
		int duracao = 0;

		if (hrInicial > 24) {

			System.out.println("Hora inicial não pode ser superior a 24 horas!");

		}
		if (hrFinal > 24) {
			System.out.println("Hora final não pode ser superior a 24 horas!");
		}

		if (hrFinal > hrInicial) {
			duracao = hrFinal - hrInicial;

		} else {
			duracao = (24 - hrInicial) + hrFinal;
		}

		System.out.println("O jogo durou " + duracao + " hora(s).");

		sc.close();
	}

}
