package br.com.poo.modelo;

public class Ingresso {
	public int qnt;
	private double valor;

	public Ingresso(int qnt, double valor) {
		this.qnt = qnt;
		this.valor = valor;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public String impressao() {
		StringBuilder dados = new StringBuilder();
		dados.append("Quantidade de ingressos disponíveis: ");
		dados.append(qnt);
		dados.append("\n");
		dados.append("Valor do ingresso: R$ ");
		dados.append(valor);
		return dados.toString();

	}

}
