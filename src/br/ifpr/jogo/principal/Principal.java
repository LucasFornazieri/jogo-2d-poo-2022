package br.ifpr.jogo.principal;

import javax.swing.JFrame;

public class Principal extends JFrame {

    public Principal(){
        super.setVisible(true); //O "super" deixa claro que esá na classe superior, já o "this" deixa claro que está na asubclasse
        this.setSize(500, 500);
        setTitle("Meu jogo");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(ABORT);
    }

    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
