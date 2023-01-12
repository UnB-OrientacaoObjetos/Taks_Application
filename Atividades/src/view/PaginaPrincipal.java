package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaPrincipal {
	public static void main ( String[]  args) {
		
		// INSTANCIAÇÃO DO OBJETO A DEFINIR MÉTRICAS DA RESPONSIVIDADE NA PÁGINA:
		GridBagConstraints metricas = new GridBagConstraints();
		
		// DECLARAÇÃO DO FRAME PRINCIPAL:
		JFrame principal = new JFrame ("Task's Application");
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// DEFINIÇÃO DO ESPAÇO NA NAVBAR:
		JPanel nav = new JPanel(new GridBagLayout());
		
		metricas.fill = GridBagConstraints.HORIZONTAL;
	    metricas.weightx = 0.5;
	    metricas.gridx = 0;
	    metricas.gridy = 0;
	    nav.add(new JLabel("Task Application"));
	    
		metricas.fill = GridBagConstraints.HORIZONTAL;
	    metricas.weightx = 0.5;
	    metricas.gridx = 1;
	    metricas.gridy = 0;
	    JButton direcionarAtividade = new JButton("Criar Tarefa");
	    nav.add(direcionarAtividade);
	    
	    direcionarAtividade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaginaCriacaoAtividade criarAtvPage = new PaginaCriacaoAtividade(principal);
                criarAtvPage.setVisible(true);
            }
        });
	    
	    metricas.fill = GridBagConstraints.HORIZONTAL;
	    metricas.weightx = 0.5;
	    metricas.gridx = 2;
	    metricas.gridy = 0;
	    JButton direcionarPessoa = new JButton("Adicionar Pessoa");
	    nav.add(direcionarPessoa);
	    
	    direcionarPessoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaginaCriacaoPessoa criarPsoaPage = new PaginaCriacaoPessoa(principal);
                criarPsoaPage.setVisible(true);
            }
        });
	    
		
		// DEFINIÇÃO DA ZONA DO TÍTULO DA APLICAÇÃO:
		JPanel zonaTitulo = new JPanel();
		JLabel title = new JLabel("Organize a sua demanda abaixo ou crie uma tarefa!");
		zonaTitulo.add(title);
		
		// DEFINIÇÃO DA ZONA DAS ATIVIDADES:
		JPanel zonaGrupos = new JPanel();
		
		// DEFINIÇÃO DA RESPONSIVIDADE DA PÁGINA COMO ESCOPO:
		JPanel escopo = new JPanel(new GridBagLayout());
		
		 metricas.fill = GridBagConstraints.HORIZONTAL;
	     metricas.weightx = 0.5;
	     metricas.gridx = 0;
	     metricas.gridy = 0;
	     escopo.add(nav, metricas);
	     
	     metricas.fill = GridBagConstraints.HORIZONTAL;
	     metricas.weightx = 0.5;
	     metricas.gridx = 0;
	     metricas.gridy = 1;
	     escopo.add(zonaTitulo, metricas);
	     
	     metricas.fill = GridBagConstraints.HORIZONTAL;
	     metricas.weightx = 0.5;
	     metricas.weighty = 1;
	     metricas.gridx = 0;
	     metricas.gridy = 2;
	     escopo.add(zonaGrupos, metricas);

	     principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		 principal.add(escopo, BorderLayout.NORTH);
	     principal.pack();
	     principal.setVisible(true);
		
	}
}
