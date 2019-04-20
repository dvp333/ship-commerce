package br.com.dvp.tcc.ship_shop_web.model;

import java.io.Serializable;

public class InfoGerencias implements Serializable {

	private static final long serialVersionUID = 1L;

	private double totalVendas;
	private int avaliacoesPositivas, avaliacoesNegativas, entregasSucesso, devolucoes;
	
	public InfoGerencias(double totalVendas,
						 int avaliacoesPositivas,
						 int avaliacoesNegativas,
						 int entregasSucesso,
						 int devolucoes) {
		super();
		this.totalVendas = totalVendas;
		this.avaliacoesPositivas = avaliacoesPositivas;
		this.avaliacoesNegativas = avaliacoesNegativas;
		this.entregasSucesso = entregasSucesso;
		this.devolucoes = devolucoes;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public int getAvaliacoesPositivas() {
		return avaliacoesPositivas;
	}
	public void setAvaliacoesPositivas(int avaliacoesPositivas) {
		this.avaliacoesPositivas = avaliacoesPositivas;
	}
	public int getAvaliacoesNegativas() {
		return avaliacoesNegativas;
	}
	public void setAvaliacoesNegativas(int avaliacoesNegativas) {
		this.avaliacoesNegativas = avaliacoesNegativas;
	}
	public int getEntregasSucesso() {
		return entregasSucesso;
	}
	public void setEntregasSucesso(int entregasSucesso) {
		this.entregasSucesso = entregasSucesso;
	}
	public int getDevolucoes() {
		return devolucoes;
	}
	public void setDevolucoes(int devolucoes) {
		this.devolucoes = devolucoes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avaliacoesNegativas;
		result = prime * result + avaliacoesPositivas;
		result = prime * result + devolucoes;
		result = prime * result + entregasSucesso;
		long temp;
		temp = Double.doubleToLongBits(totalVendas);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoGerencias other = (InfoGerencias) obj;
		if (avaliacoesNegativas != other.avaliacoesNegativas)
			return false;
		if (avaliacoesPositivas != other.avaliacoesPositivas)
			return false;
		if (devolucoes != other.devolucoes)
			return false;
		if (entregasSucesso != other.entregasSucesso)
			return false;
		if (Double.doubleToLongBits(totalVendas) != Double.doubleToLongBits(other.totalVendas))
			return false;
		return true;
	}
	
}
