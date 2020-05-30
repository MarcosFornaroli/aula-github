package entities;

import java.util.Date;

public class Contrato {
	private Date dataContrato;
	private Double valorHora;
	private int qtdHoras;

	public Contrato() {
		super();
	}

	public Contrato(Date dataContrato, Double valorHora, int qtdHoras) {
		super();
		this.dataContrato = dataContrato;
		this.valorHora = valorHora;
		this.qtdHoras = qtdHoras;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double valorContrato() {
		return qtdHoras * valorHora;
	}

}
