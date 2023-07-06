package br.ifpr.jogo.modelo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Inimigo extends ElementoGrafico {

    private static int VELOCIDADE = 2;

    public Inimigo(int xAleatorio, int yAleatorio) {
        super.setPosicaoEmX(xAleatorio);
        super.setPosicaoEmY(yAleatorio);
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\inimigo.png");
        super.setImagem(carregando.getImage());
        super.setLarguraImagem(carregando.getImage().getWidth(null));
        super.setAlturaImagem(carregando.getImage().getHeight(null));
    }

    public void atualizar() {
        this.setPosicaoEmX(this.getPosicaoEmX() - VELOCIDADE);
    }

}
