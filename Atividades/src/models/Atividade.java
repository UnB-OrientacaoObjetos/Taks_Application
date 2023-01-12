package models;

import java.util.Date;

public class Atividade {

	private String nomeAtividade;

	private boolean conclusaoAtividade;

	private String descricao;

	private Date dataInicio;

	private Date dataFim;

	private String classificador;

	private Prioridade prioridade;

	private Colaborador[] colaborador;
	
	private Supervisor[] supervisor;

	public Atividade(String nomeAtiv, Date inicio, Date Fim, String infoAtividade) {

	}

	public void editarNomeAtividade(String novoNomeAtv) {

	}

	public void apagarAtividade() {

	}

	public void definirPrioridade(Prioridade prioridadeAtv) {

	}

	public void escolherAgrupacao(Grupo grupoAtv) {

	}

	public void concluirAtividade() {

	}

	public void desconcluirAtividade() {

	}

	public void escolherSupervisor(Supervisor Sup) {

	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public boolean isConclusaoAtividade() {
		return conclusaoAtividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public String getClassificador() {
		return classificador;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public Colaborador[] getColaborador() {
		return colaborador;
	}

	public Supervisor[] getSupervisor() {
		return supervisor;
	}

}

