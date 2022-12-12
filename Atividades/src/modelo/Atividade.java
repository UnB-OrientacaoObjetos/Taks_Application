package modelo;

public class Atividade {

	private String nomeAtividade;

	private boolean conclusaoAtividade;

	private Prioridade prioridade;
	
	private Grupo grupo;
	
	private Supervisor supervisor;

	public Atividade(String nomeAtiv, boolean conclAtv) {
		nomeAtividade = nomeAtiv;
		conclusaoAtividade = conclAtv;
	}

	public void editarNomeAtividade(String novoNomeAtv) {
		nomeAtividade = novoNomeAtv;
	}

	public void apagarAtividade() {

	}

	public void definirPrioridade(Prioridade prioridadeAtv) {
		
		prioridade = prioridadeAtv;
		
	}

	public void escolherAgrupacao(Grupo grupoAtv) {
		grupo = grupoAtv;
	}

	public void concluirAtividade() {

	}

	public void desconcluirAtividade() {

	}

	public void escolherSupervisor(Supervisor Sup) {
		supervisor = Sup;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public boolean getConclusaoAtividade() {
		return conclusaoAtividade;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}
	
	

}
