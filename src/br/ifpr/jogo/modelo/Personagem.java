package br.ifpr.jogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Personagem {
    private int posicaoEmx;
    private int posicaoEmy;
    private int deslocamentoEmx;
    private int deslocamentoEmy;
    private Image imagem;
    private int larguraImagem;
    private int alturaImagem;

    public Personagem(){
        this.posicaoEmx = 100;
        this.posicaoEmy = 100;
    }
    public void carregar(){
        ImageIcon carregando = new ImageIcon("recursos\\nave.jpg");
        this.imagem = carregando.getImage();
        this.larguraImagem = this.imagem.getWidth(null);
        this.alturaImagem = this.imagem.getWidth(null);
    }

    public int getPosicaoEmx() {
        return this.posicaoEmx;
    }

    public void setPosicaoEmx(int posicaoEmx) {
        this.posicaoEmx = posicaoEmx;
    }

    public int getPosicaoEmy() {
        return this.posicaoEmy;
    }

    public void setPosicaoEmy(int posicaoEmy) {
        this.posicaoEmy = posicaoEmy;
    }

    public int getDeslocamentoEmx() {
        return this.deslocamentoEmx;
    }

    public void setDeslocamentoEmx(int deslocamentoEmx) {
        this.deslocamentoEmx = deslocamentoEmx;
    }

    public int getDeslocamentoEmy() {
        return this.deslocamentoEmy;
    }

    public void setDeslocamentoEmy(int deslocamentoEmy) {
        this.deslocamentoEmy = deslocamentoEmy;
    }

    public Image getImagem() {
        return this.imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public int getLarguraImagem() {
        return this.larguraImagem;
    }

    public void setLarguraImagem(int larguraImagem) {
        this.larguraImagem = larguraImagem;
    }

    public int getAlturaImagem() {
        return this.alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }


}
