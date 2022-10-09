package me.nykoo.gui.componentes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import me.nykoo.gui.LoginPanel;

import java.awt.event.*;
import java.awt.*;

public class TelaPanel extends JPanel implements ActionListener{
    private JPanel telas;
    private CardLayout controleTela;
    private JFrame janela;

    /**
     * 
     * @param telas Define a variavel da tela no JPanel
     * @param janela Define qual a janela que é no JFrame
     */
    public TelaPanel(JPanel telas, JFrame janela) {
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();
        this.janela = janela;
        this.setBackground(Color.decode("#191622"));
        this.setLayout(null);

        Imagem iconeFechar = new Imagem("fechar");
        iconeFechar.setBounds(1240, 0, 36, 36);
        Imagem iconeMinimizar = new Imagem("minimizar");
        iconeMinimizar.setBounds(1200, 0, 36, 36);

        iconeMinimizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                janela.setState(JFrame.ICONIFIED);
            }
        });
        
        iconeFechar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar?");
                
                if (confirma == JOptionPane.OK_OPTION) {
                    janela.dispose();
                }else {
                    System.out.println("Cancelado com sucesso");
                }

            }
        });
        
        this.add(iconeFechar);
        this.add(iconeMinimizar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        executeButton(e);
    }
    
    protected void executeButton(ActionEvent e) {

    }

    protected void trocarTela(String identificador){
        controleTela.show(telas, identificador);    
    }

}
