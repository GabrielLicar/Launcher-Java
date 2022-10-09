package me.nykoo.gui.componentes;

import javax.swing.JButton;
import java.awt.*;

public class Botoes extends JButton{
    public Botoes(String texto){
        super(texto);

        this.setBounds(530, 370 , 200, 30);
        this.setBackground(Color.decode("#61d579"));
        this.setFocusPainted(false);
        this.setBorderPainted(false);
    }
}
