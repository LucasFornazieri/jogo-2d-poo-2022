package br.ifpr.jogo.principal;

import javax.swing.JFrame;

import br.ifpr.jogo.modelo.Fase;

public class Principal extends JFrame {

    public Principal(){
        Fase fase =  new Fase();
        super.add(fase);
        super.setVisible(true); //O "super" deixa claro que está na classe superior, já o "this" deixa claro que está na subclasse
        this.setSize(800, 800);
        setTitle("Meu jogo");
        setLocationRelativeTo(null);
        
    }

    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
