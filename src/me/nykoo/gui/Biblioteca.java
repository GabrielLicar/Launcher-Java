package me.nykoo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import me.nykoo.gui.componentes.TelaPanel;

import java.awt.*;
import java.awt.event.*;

public class Biblioteca extends TelaPanel {
    private JButton botaoVoltar;

    public Biblioteca(JPanel telas, JFrame janela) {
        super(telas, janela);
        JLabel msg = new JLabel("Conteudo Painel Principal");

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(this);

        this.add(msg);
        this.add(botaoVoltar);
    }

    public void executeButton(ActionEvent e) {
        trocarTela("Tela de Login");
        System.out.println("Funfou");
    }

}