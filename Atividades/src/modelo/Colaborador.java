package modelo;

public class Colaborador extends Pessoa {

	private String funcao;

	public Colaborador(String nomeColab, String contatoColab, int limiteProdColab, String funcaoColab) {
		nomeUsuario = nomeColab;
		contatoUsuario = contatoColab;
		limiteProducao = limiteProdColab;
		funcao = funcaoColab;
	}

	public void apagarColaborador() {

	}

	public void getColaborador() {
		this.toString();
	}

	public String getFuncao() {
		return funcao;
	}

}
