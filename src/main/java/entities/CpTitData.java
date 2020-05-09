package entities;

import java.util.Date;

public class CpTitData {
	Integer IdTit;
	Date dtVcto;
	Double valor;

	public CpTitData(Integer idTit, Date dtVcto, Double valor) {
		IdTit = idTit;
		this.dtVcto = dtVcto;
		this.valor = valor;
	}

	public Integer getIdTit() {
		return IdTit;
	}

	public void setIdTit(Integer idTit) {
		IdTit = idTit;
	}

	public Date getDtVcto() {
		return dtVcto;
	}

	public void setDtVcto(Date dtVcto) {
		this.dtVcto = dtVcto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Dados do Título: id = " + IdTit + ", Data Vencimento " +  dtVcto + ", Valor = "
				+ String.format("%.2f%n", valor);
	}

}
