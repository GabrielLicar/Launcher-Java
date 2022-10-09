package me.nykoo.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel implements ActionListener{
    private JPanel telas;
    private CardLayout controleTela;

    public LoginPanel(JPanel telas) {
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();
        JLabel msg = new JLabel("Acesso ao Login");
        

        JButton botao = new JButton("Sign-in");
        botao.addActionListener(this);

        this.add(msg);
        this.add(botao);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controleTela.show(telas, "Tela voltar");
    }
    
}
