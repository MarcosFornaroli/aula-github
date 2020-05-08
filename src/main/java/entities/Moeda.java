package entities;

public class Moeda {
	public double valorDolar;
	public double qtdDolar;
	public double valorReais;

	public double converteMoeda() {
		double valorReais = valorDolar * qtdDolar;
		return valorReais + (valorReais * 6 / 100);
	}
}
