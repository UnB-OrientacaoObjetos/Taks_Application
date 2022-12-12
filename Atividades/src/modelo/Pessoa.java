package modelo;

public abstract class Pessoa {

	protected String nomeUsuario;

	protected String emailUsuario;

	protected String contatoUsuario;

	protected int limiteProducao;

	public void editarNome(String novoNomePes) {
		nomeUsuario = novoNomePes;
	}

	public void editarContato(String novoContato) {
		contatoUsuario = novoContato;
	}

	public void definirEmail(String conta) {
		emailUsuario = conta;
	}

	public void editarLimiteProducao(int limiteProd) {
		limiteProducao = limiteProd;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public String getContatoUsuario() {
		return contatoUsuario;
	}

	public int getLimiteProducao() {
		return limiteProducao;
	}

}
