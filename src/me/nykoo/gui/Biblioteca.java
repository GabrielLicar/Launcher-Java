package me.nykoo.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONObject;

import me.nykoo.gui.componentes.Botoes;
import me.nykoo.gui.componentes.Imagem;
import me.nykoo.gui.componentes.TelaPanel;
import me.nykoo.models.Games;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca extends TelaPanel {
    private ArrayList<Games> game;
    private JPanel grid;

    private Botoes botaoVoltar;
        
    public Biblioteca(JPanel telas, JFrame janela) {
        super(telas, janela);
        this.game = new ArrayList<Games>();
        
        grid = new JPanel(new FlowLayout(FlowLayout.LEFT, 22, 22));
        grid.setBackground(Color.decode("#191622"));

        loadingGames();
        showGames();

        JScrollPane scrollPane = new JScrollPane(grid);
        scrollPane.setBounds(0, 25, 1280, 690);
        this.add(scrollPane);

        botaoVoltar = new Botoes("Voltar");
        botaoVoltar.setBounds(720, 720, 500, 500);
        botaoVoltar.addActionListener(this);
        grid.add(botaoVoltar);
    }

    private void loadingGames(){
        String jsonString = readGamesJson(); 
        JSONArray jsonArray = new JSONArray(jsonString);

        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject gameJObject = (JSONObject) jsonArray.get(i);
            game.add(new Games(gameJObject)); 
        }
    }

    private void showGames(){
        int posicaoX = 40;
        int posicaoY = 40;
        final int MAX_X = 1000;

        int altura = (game.size() / 4) * 374 + 20;
        grid.setPreferredSize(new Dimension(500, altura));
           
        for (Games games : game) {
            String icone = games.getIcone();
            Imagem imagem = new Imagem(icone);
            imagem.setBounds(posicaoX, posicaoY, 260, 362);
            
            posicaoX +=30 + 260;
            if (posicaoX > MAX_X) {
                posicaoX = 50;
                posicaoY +=30 + 362;
            }

            System.out.println(icone);

            imagem.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    String caminho = games.getCaminho();
                    String nome = games.getNome();
                    executarJogo(caminho, nome);
                }
            });

            grid.add(imagem);
        }
        
    }
    

    private void executarJogo(String caminho, String nome){
        File arquivo = new File(caminho);
        File gaminho = new File(nome);
        String pasta = arquivo.getAbsoluteFile().getParent();
        String gamin = gaminho.getName();
        //System.out.println(pasta);
       
        try {
            JOptionPane.showMessageDialog(null, "Você está abrindo o " + gamin);
            Runtime.getRuntime().exec(caminho, null, new File(pasta));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readGamesJson(){
        File archivesJson = new File("games.json");
        StringBuilder contentArchive = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivesJson));

            String line = reader.readLine();
            while (line != null) {
                contentArchive.append(line);

                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contentArchive.toString();
    }

    public void executeButton(ActionEvent e) {
        trocarTela("Tela de Login");
        System.out.println("Funfou");
    }

}