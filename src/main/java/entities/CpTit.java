package entities;

import repository.Soma;

public class CpTit implements Soma {

	private int idTit;
	private String fornecedor;
	private double valor;

	public int getIdTit() {
		return idTit;
	}

	public void setIdTit(int idTit) {
		this.idTit = idTit;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int insereTitulo(int idTit, String fornecedor, double valor) {
		this.idTit = idTit;
		this.fornecedor = fornecedor;
		this.valor = valor;

		return this.idTit;
	}

	public String consultaDadosTitulo(int tipoDado) {
		String resultado = null;

		if (tipoDado == 1) {
			resultado = "Id Titulo: " + getIdTit();
		} else if (tipoDado == 2) {
			resultado = "Fornecedor: " + getFornecedor();
		} else if (tipoDado == 3) {
			resultado = "Valor Titulo: " + getValor();

		} else {
			resultado = "Tipo dado solicitado é inválido. Informe um valor de 1 a 3!!!";
		}

		return resultado;
	}

	public void somandoValores(int qtd, double valor) {
		double valorTotal = 0;

		for (int i = 0; i < qtd; i++) {
			valorTotal += valor;
		}
		System.out.println("Valor total: " + valorTotal);

	}

}
