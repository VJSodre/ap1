package br.com.poo.modelo;

public class ShowA {
	private String name;
	private Ingresso ingresso;

	public ShowA(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	public String impressao() {
		StringBuilder dados = new StringBuilder();
		dados.append("Endere�o: Salvador Shopping");
		dados.append("");

		return dados.toString();

	}

}
