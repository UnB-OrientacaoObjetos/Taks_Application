package modelo;

public class Descricao {

	private String descricao;
	
	private Atividade atividade;

	private String dataInicio;

	private String dataFim;

	private String classificador;

	private Colaborador colaborador;

	private Supervisor supervisor;


	public Descricao(Atividade atv, String dataIni, String dataFm) {
		atividade = atv;
		dataInicio = dataIni;
		dataFim = dataFm;
	}

	public void editarDescricao(String info) {
		descricao = info;
	}

	public void classificar(String tag) {
		classificador = tag;
	}

	public void apagarClassificador() {

	}

	public void escolherColaborador(Colaborador colab) {
		colaborador = colab;
	}

	public void escolherColaborador(Supervisor colab) {
		supervisor = colab;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public String getClassificador() {
		return classificador;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public Atividade getAtividade() {
		return atividade;
	}

}
