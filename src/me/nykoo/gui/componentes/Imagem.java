package me.nykoo.gui.componentes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import me.nykoo.gui.GuiM;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Imagem extends JLabel{

    public Imagem(String nome){
        super();
        ImageIcon icone = new ImageIcon(Imagem.class.getResource("/assets/" + nome + ".png"));
        setIcon(icone);
        repaint();
    }
    
}
