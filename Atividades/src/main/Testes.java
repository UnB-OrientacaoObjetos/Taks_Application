package main;

import modelo.Atividade;
import modelo.Colaborador;
import modelo.Descricao;
import modelo.Grupo;
import modelo.Supervisor;
import modelo.Prioridade;

public class Testes {

	public static void main(String[] args) {
		
		
		// Teste com Colaborador:
		
		// Uso de construtor para Sets:
		Colaborador colaborador1 = new Colaborador("João", "(61) 99999-9999", 3, "Pesquisador");
		Colaborador colaborador2 = new Colaborador("Maria", "(61) 88888-8888", 5, "BackEnd");
		
		// Teste de Get:
		System.out.print("Colaborador1: \n" + colaborador1.getNomeUsuario() + "\n" +
				colaborador1.getEmailUsuario() + "\n" + colaborador1.getContatoUsuario() + "\n" +
				colaborador1.getLimiteProducao() + "\n" + colaborador1.getFuncao() + "\n \n");
		
		//Teste de Set de Email:
		colaborador2.definirEmail("maria@example.com");
		
		// Teste de Get:
		System.out.println("Colaborador2: \n" + colaborador2.getNomeUsuario() + "\n" +
				colaborador2.getEmailUsuario() + "\n" + colaborador2.getContatoUsuario() + "\n" +
				colaborador2.getLimiteProducao() + "\n" + colaborador2.getFuncao() + "\n \n");
		
		
		
		
		// Teste com Supervisor:
		
//		// Uso de construtor para Sets:
//		Supervisor supervisor1 = new Supervisor("Matheus", "(61) 98888-8888", 2, 5);
//		Supervisor supervisor2 = new Supervisor("Gabriel", "(61) 97777-7777", 0, 7);
//		
//		// Teste de Get:
//		System.out.print("Supervisor 1: \n" + supervisor1.getNomeUsuario() + "\n" +
//				supervisor1.getEmailUsuario() + "\n" + supervisor1.getContatoUsuario() + "\n" +
//				supervisor1.getLimiteProducao() + "\n" + supervisor1.getLimiteSupervisao() + "\n \n");
//		
//		// Teste de set no Email:
//		supervisor2.definirEmail("gabriel.santos@example.com");
//		
//		// Teste de Get:
//		System.out.print("Supervisor 2: \n" + supervisor2.getNomeUsuario() + "\n" +
//				supervisor2.getEmailUsuario() + "\n" + supervisor2.getContatoUsuario() + "\n" +
//				supervisor2.getLimiteProducao() + "\n" + supervisor2.getLimiteSupervisao());
		
		
		
		
		// Teste com Grupos:
		
//		// Uso de construtor para Sets:
//		Grupo grupo1 = new Grupo("BackLog");
//		Grupo grupo2 = new Grupo("Ativas");
//		
//		// Teste de Get:
//		System.out.print("Grupo 1: \n" + grupo1.getNomeGrupo() + "\n" + grupo1.getCor() + " \n \n");
//		
//		// Teste de Set:
//		grupo2.escolherCor("Vermelho");
//		
//		//Teste de Get:
//		System.out.print("Grupo 2: \n" + grupo2.getNomeGrupo() + "\n" + grupo2.getCor());
		
		
		
		// Teste com Atividades:
		
//		// Uso de construtor para Sets:
//		Atividade atividade1 = new Atividade("Fazer o UML", true);
//		Atividade atividade2 = new Atividade("Realizar o Código da UML", false);
//		
//		// Teste de Get:
//		System.out.print("Atividade 1: \n" + atividade1.getNomeAtividade() + "\n" + atividade1.getConclusaoAtividade() + "\n"
//		+ atividade1.getPrioridade() + "\n" + atividade1.getGrupo() + "\n" + atividade1.getSupervisor() +"\n \n");
//		
//		
//		//Criacão de Grupo e SUpervisor para Sets:
//		Grupo grupo1 = new Grupo("BackLog");
//		Supervisor supervisor1 = new Supervisor("Matheus", "(61) 98888-8888", 2, 5);
//		
//		// Testes de Sets:
//		atividade2.escolherAgrupacao(grupo1);
//		atividade2.definirPrioridade(Prioridade.URGENTE);
//		atividade2.escolherSupervisor(supervisor1);
//		
//		// Teste de Get:
//		System.out.print("Atividade 2: \n" + atividade2.getNomeAtividade() + "\n" + atividade2.getConclusaoAtividade() + "\n" +
//		atividade2.getPrioridade() + "\n" + atividade2.getGrupo() + atividade2.getSupervisor());
		
		
		// Teste com Descricão:
		
//		// Criação de Atividades para sets de Descrições:
//		Atividade atividade1 = new Atividade("Fazer o UML", true);
//		Atividade atividade2 = new Atividade("Realizar o Código da UML", false);
//		
//		// Testes de sets com Construtor:
//		Descricao descricao1 = new Descricao(atividade1, "01/12/2022", "12/12/2022");
//		Descricao descricao2 = new Descricao(atividade2, "12/12/2022", "18/02/2023");
//		
//		// Teste de Gets:
//		System.out.print("Descrição 1: \n" + descricao1.getDescricao() + "\n" + descricao1.getAtividade() + "\n"
//				+ descricao1.getDataInicio() + "\n" + descricao1.getDataFim() + "\n" + descricao1.getClassificador()
//				+ "\n" + descricao1.getColaborador() + "\n \n");
//		
//		// Criacao de Colaboradores:
//		Colaborador colaborador1 = new Colaborador("João", "(61) 99999-9999", 3, "Pesquisador");
//		
//		// Teste de Sets:
//		descricao2.classificar("Orientação à Objetos");
//		descricao2.editarDescricao("Código será feito através da linguagem Java");
//		descricao2.escolherColaborador(colaborador1);
//		
//		// Teste de Get:
//		System.out.print("Descrição 2: \n" + descricao2.getDescricao() + "\n" + descricao2.getAtividade() + "\n"
//				+ descricao2.getDataInicio() + "\n" + descricao2.getDataFim() + "\n" + descricao2.getClassificador()
//				+ "\n" + descricao2.getColaborador());
		
		
	}
	
}
