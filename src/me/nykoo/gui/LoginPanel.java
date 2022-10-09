package me.nykoo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import me.nykoo.gui.componentes.Botoes;
import me.nykoo.gui.componentes.Imagem;
import me.nykoo.gui.componentes.TelaPanel;

import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends TelaPanel{

    private JTextField txtLogin = new JTextField();

    private Botoes botao;

    public LoginPanel(JPanel telas, JFrame janela) {
        super(telas, janela);
        JLabel msg = new JLabel("Acesso ao Login");
        
        
        txtLogin.setBounds(530, 272, 200, 25);

        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(530, 328, 200, 25);
        
        botao = new Botoes("Logar");
        botao.addActionListener(this);

        this.add(msg);
        this.add(botao);
        this.add(txtLogin);
        this.add(txtSenha);
    }

    public void executeButton(ActionEvent e) {
        trocarTela("Tela voltar");
    }
    
}
