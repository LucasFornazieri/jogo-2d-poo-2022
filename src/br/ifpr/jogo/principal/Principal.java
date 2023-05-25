package br.ifpr.jogo.principal;

import javax.swing.JFrame;

import br.ifpr.jogo.modelo.Fase;

public class Principal extends JFrame {

    public Principal(){
        Fase fase =  new Fase();
        super.add(fase);
        super.setVisible(true); //O "super" deixa claro que esá na classe superior, já o "this" deixa claro que está na asubclasse
        this.setSize(500, 500);
        setTitle("Meu jogo");
        setLocationRelativeTo(null);
        
    }

    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
