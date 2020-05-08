package tests;

import entities.CpTit;

public class InsereTitulo {

	public static void main(String[] args) {

		CpTit tit = new CpTit();

		int titulo = tit.insereTitulo(1, "Marcos", 150.99);

		if (titulo > 0) {
			System.out.println(tit.consultaDadosTitulo(1));
			System.out.println(tit.consultaDadosTitulo(2));
			System.out.println(tit.consultaDadosTitulo(3));
		} else {
			System.out.println("Erro ao inserir titulo!!!");
		}

		tit.somandoValores(5, 5);
	}

}
