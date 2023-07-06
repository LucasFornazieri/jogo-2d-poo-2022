package br.ifpr.jogo.modelo;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Tiro extends ElementoGrafico {

    private static int VELOCIDADE = 2;

    public Tiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY) {
        super.setPosicaoEmX(posicaoPersonagemEmX);
        super.setPosicaoEmY(posicaoPersonagemEmY);
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\tirodois.png");
        super.setImagem(carregando.getImage());
        super.setLarguraImagem(carregando.getImage().getWidth(null));
        super.setAlturaImagem(carregando.getImage().getHeight(null));
    }

    public void atualizar() {
        super.setPosicaoEmX(super.getPosicaoEmX() + VELOCIDADE);
    }

}