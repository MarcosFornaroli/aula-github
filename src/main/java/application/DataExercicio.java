package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.CpTitData;

public class DataExercicio {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdFormat = new SimpleDateFormat("dd/MM/YYYY");

		System.out.println("Informe o id do título: ");
		Integer idTitulo = sc.nextInt();
		sc.nextLine();

		System.out.println("Informe a data de vencimento do título: ");
		Date dtVcto = sdFormat.parse(sc.next());

		System.out.println("Informa o valor do título: ");
		Double vlrTitulo = sc.nextDouble();

		CpTitData tit = new CpTitData(idTitulo, dtVcto, vlrTitulo);

		System.out.println(tit);

		System.out.println("Data formatada: " + sdFormat.format(dtVcto));
		sc.close();
	}

}
