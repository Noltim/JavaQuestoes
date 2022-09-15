package entities;

import java.util.Date;

public class Carro {

	private String chassi;
	private String cor;
	private int anoFabricacao;
	private int anoModelo;
	private Date dataEntrada;
	
	public Carro() {
		
	}

	public Carro(String chassi, String cor, int anoFabricacao, int anoModelo, Date dataEntrada) {
		this.chassi = chassi;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.dataEntrada = dataEntrada;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}
