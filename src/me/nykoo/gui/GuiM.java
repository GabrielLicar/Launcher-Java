package me.nykoo.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class GuiM extends JFrame{

    public GuiM() {
        this.setBounds(320, 170, 1280, 720);
        this.setTitle("Launcher build 0.0.1");
    
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPanel login = new LoginPanel(telas, this);
        Biblioteca mainn = new Biblioteca(telas, this);

        telas.add(login, "Tela de Login");
        telas.add(mainn, "Tela voltar"); 

        this.add(telas);
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
