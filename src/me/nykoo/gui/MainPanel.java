package me.nykoo.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JPanel implements ActionListener{
    private JPanel telas;
    private CardLayout controleTela;
    
    public MainPanel(JPanel telas) {
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();

        JLabel msg = new JLabel("Conteudo Painel Principal");

        JButton botao = new JButton("Back");
        botao.addActionListener(this);

        this.add(msg);
        this.add(botao);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controleTela.show(telas, "Tela de Login");
        
    }

}