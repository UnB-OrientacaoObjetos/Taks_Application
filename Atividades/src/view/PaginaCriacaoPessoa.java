package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;

public class PaginaCriacaoPessoa extends JDialog{

	PaginaCriacaoPessoa(JFrame owner) {
		    super(owner, "Criar Pessoa", true);
		    setSize(500, 500);
		    setLocationRelativeTo(null);
		    JPanel escopo = new JPanel();
		    escopo.add(new JLabel("This is the person page"));
		    add(escopo);
        
	}
	
}
