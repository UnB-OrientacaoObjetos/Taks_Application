package models;

public class Grupo {

	private String nomeGrupo;

	private String cor;

	public Grupo(String nomeGrup) {
		this.nomeGrupo = nomeGrup;
	}

	public void escolherCor(String corGrup) {
		cor = corGrup;
	}

	public void editarGrupo(String novoNomeGrup) {
		nomeGrupo = novoNomeGrup;
	}

	public void apagarGrupo() {

	}

	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public String getCor() {
		return cor;
	}

}
