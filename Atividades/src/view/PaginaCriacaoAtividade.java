package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.BorderLayout;

public class PaginaCriacaoAtividade extends JDialog{
		
	PaginaCriacaoAtividade(JFrame owner) {
		
			// ACESSO AO MÉTODO CONTRUTOR DA CLASSE JDIALOG DO JAVA COM SUPER:
			super(owner, "Criar Atividade", true);
		
			// INSTANCIAÇÃO DO OBJETO A DEFINIR MÉTRICAS DA RESPONSIVIDADE NO MODAL:
			GridBagConstraints metricas = new GridBagConstraints();
			
			// DEFINIÇÃO DO ESPAÇO ESCOPO DO MODAL:
			JPanel escopo = new JPanel(new GridBagLayout());
	        
	        // DEFINIÇÃO DOS ESPAÇOS E METRIFICAÇÃO DA RESPONSIVIDADE SECCIONADO POR DADOS A SEREM PREENCHIDAS:
	        
		     	// INSTRUÇÃO DO MODAL::
	        	JPanel divisaoInstrucaoModal = new JPanel();
	        	divisaoInstrucaoModal.add(new JLabel("Preencha os campos abaixo:"), BorderLayout.CENTER);
			    
	        	// TITULO DA ATIVIDADE:
	        	JPanel divisaoNomeAtv = new JPanel(new GridBagLayout());
	        	metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 0;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 30, 0, 0);
			    divisaoNomeAtv.add(new JLabel("Nome da Atividade:"), metricas);
			    
			    metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 1;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 0, 0, 30);
			    JTextField nomeAtvInput = new JTextField();
			    divisaoNomeAtv.add(nomeAtvInput, metricas);
			    
			    // INICIO DA ATIVIDADE:
	        	JPanel divisaoInicioAtv = new JPanel(new GridBagLayout());
	        	metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 0;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 30, 0, 0);
			    divisaoInicioAtv.add(new JLabel("Data de Inicio:"), metricas);
			    
			    metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 1;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 0, 0, 30);
			    JTextField inicioAtvInput = new JTextField();
			    divisaoInicioAtv.add(inicioAtvInput, metricas);
			    
			    // FINALIZAÇÃO DA ATIVIDADE:
	        	JPanel divisaoFimAtv = new JPanel(new GridBagLayout());
	        	metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 0;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 30, 0, 0);
			    divisaoFimAtv.add(new JLabel("Data de Finalização:"), metricas);
			    
			    metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 1;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 0, 0, 30);
			    JTextField fimAtvInput = new JTextField();
			    divisaoFimAtv.add(fimAtvInput, metricas);
			    
			    // DESCRICAO DA ATIVIDADE
	        	JPanel divisaoInfoAtv = new JPanel(new GridBagLayout());
	        	metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 0;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 30, 0, 0);
			    divisaoInfoAtv.add(new JLabel("Descreva a Atividade:"), metricas);
			    
			    metricas.fill = GridBagConstraints.HORIZONTAL;
			    metricas.weightx = 0.5;
			    metricas.gridx = 1;
			    metricas.gridy = 0;
			    metricas.insets = new Insets(0, 0, 0, 30);
			    JTextField infoAtvInput = new JTextField();
			    divisaoInfoAtv.add(infoAtvInput, metricas);
			    
			    // BOTÃO DE ENVIO O CONTROLLER:
			    JPanel divisaoBotaoModal = new JPanel();
			    divisaoBotaoModal.add(new JButton("Adicionar Atividade"), BorderLayout.CENTER);
			    
			    
			// METRIFICAÇÕES DO ESPAÇO ESCOPO PARA RESPONSIVIDADE:
			metricas.fill = GridBagConstraints.HORIZONTAL;
			metricas.weightx = 0.5;
			metricas.gridx = 0;
			metricas.gridy = 0;
			metricas.ipady = 50;
			escopo.add(divisaoInstrucaoModal, metricas);
			
			metricas.fill = GridBagConstraints.HORIZONTAL;
			metricas.weightx = 0.5;
			metricas.gridx = 0;
			metricas.gridy = 1;
			escopo.add(divisaoNomeAtv, metricas);
			
			metricas.fill = GridBagConstraints.HORIZONTAL;
			metricas.weightx = 0.5;
			metricas.gridx = 0;
			metricas.gridy = 2;
			escopo.add(divisaoInicioAtv, metricas);
			
			metricas.fill = GridBagConstraints.HORIZONTAL;
			metricas.weightx = 0.5;
			metricas.gridx = 0;
			metricas.gridy = 3;
			escopo.add(divisaoFimAtv, metricas);
			
			metricas.fill = GridBagConstraints.HORIZONTAL;
			metricas.weightx = 0.5;
			metricas.gridx = 0;
			metricas.gridy = 4;
			escopo.add(divisaoInfoAtv, metricas);
			
			metricas.fill = GridBagConstraints.HORIZONTAL;
			metricas.weightx = 0.5;
			metricas.gridx = 0;
			metricas.gridy = 5;
			escopo.add(divisaoBotaoModal, metricas);
			
			
			setSize(550, 500);
			setLocationRelativeTo(null);
	        add(escopo, BorderLayout.NORTH);
	        
    }
}
