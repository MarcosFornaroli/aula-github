package exercicios;

import java.util.Scanner;

import entities.Retangulo;

public class Exec_06_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retangulo ret = new Retangulo();

		System.out.println("Informe a altura do retangulo: ");
		ret.altura = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe a largura do retangulo: ");
		ret.largura = sc.nextDouble();

		System.out.println("A area do retangulo é de " + ret.area());
		System.out.println("O perimetro do retangulo é de " + ret.perimetro());
		System.out.println("A diagonal do retangulo é de " + ret.diagonal());

		sc.close();
	}

}
