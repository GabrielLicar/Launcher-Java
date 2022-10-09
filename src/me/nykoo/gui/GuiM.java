package me.nykoo.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class GuiM extends JFrame{

    public GuiM() {
        this.setBounds(320, 170, 1280, 720);
        this.setTitle("Launcher build 0.0.1");

        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);

        LoginPanel login = new LoginPanel(telas);
        MainPanel mainn = new MainPanel(telas);

        telas.add(login, "Tela de Login");
        telas.add(mainn, "Tela voltar"); 

        this.add(telas);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
    }
    
}
