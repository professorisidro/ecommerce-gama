package br.com.isidrocorp.ecommerce.dto;

public class FaturamentoMensal {
	private Integer mes;
	private Double  valorTotal;
		
	public FaturamentoMensal(Integer mes, Double valorTotal) {
		super();
		this.mes = mes;
		this.valorTotal = valorTotal;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
