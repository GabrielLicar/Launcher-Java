package me.nykoo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import me.nykoo.gui.componentes.Botoes;
import me.nykoo.gui.componentes.Imagem;
import me.nykoo.gui.componentes.TelaPanel;

import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends TelaPanel{

    private JTextField txtLogin = new JTextField();
    private JPasswordField txtSenha = new JPasswordField();

    private Botoes botao;

    public LoginPanel(JPanel telas, JFrame janela) {
        super(telas, janela);

        JLabel usuario = new JLabel("Digite seu usuario");
        usuario.setBounds(530, 250, 200, 25);
        usuario.setForeground(Color.WHITE);
        txtLogin.setBounds(530, 272, 200, 25);


        JLabel password = new JLabel("Digite sua senha");
        password.setBounds(530, 305, 200, 25);
        password.setForeground(Color.WHITE);
        txtSenha.setBounds(530, 328, 200, 25);

        botao = new Botoes("Logar");
        botao.addActionListener(this);

        this.add(usuario);
        this.add(password);
        this.add(botao);
        this.add(txtLogin);
        this.add(txtSenha);
    }

    
    private String loguinho = "Nykoo";

    public void executeButton(ActionEvent e) {
        trocarTela("Tela voltar");
        
    }
    
}
