package models;

public class Supervisor extends Pessoa {

	private int limiteSupervisao;

	public Supervisor(String nomeSup, String contatoSup, int limiteProdSup, int limiteSup) {
		nomeUsuario = nomeSup;
		contatoUsuario = contatoSup;
		limiteProducao = limiteProdSup;
		limiteSupervisao = limiteSup;
	}

	public void editarLimiteSupervisao(int limiteSup) {
		this.limiteSupervisao = limiteSup;
	}

	public void apagarSupervisor() {

	}

	public int getLimiteSupervisao() {
		return limiteSupervisao;
	}

}
