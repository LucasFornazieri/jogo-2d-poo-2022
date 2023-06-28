package br.ifpr.jogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Personagem {
    private int posicaoEmx;
    private int posicaoEmy;
    private int deslocamentoEmx;
    private int deslocamentoEmy;
    private Image imagem;
    private int larguraImagem;
    private int alturaImagem;
    private int velocidadeDeDeslocamento;


    private static final int POSICAO_INICIAL_EM_X = 100;
    private static final int POSICAO_INICIAL_EM_Y = 100;
    

    public Personagem(int velocidadeDeDeslocamento){
        this.posicaoEmx = POSICAO_INICIAL_EM_X;
        this.posicaoEmy = POSICAO_INICIAL_EM_Y;
        this.velocidadeDeDeslocamento = velocidadeDeDeslocamento;    
    }
    public void carregar(){
        ImageIcon carregando = new ImageIcon("recursos\\Imagemnave.png");
        this.imagem = carregando.getImage();
        this.larguraImagem = this.imagem.getWidth(null);
        this.alturaImagem = this.imagem.getWidth(null);
    }
    public void atualizar(){
        this.posicaoEmx = this.posicaoEmx + this.deslocamentoEmx;
        this.posicaoEmy = this.posicaoEmy + this.deslocamentoEmy;
    }

    public void mover(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmy = - this.velocidadeDeDeslocamento;
            break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmy = this.velocidadeDeDeslocamento;
            break;
            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmx = this.velocidadeDeDeslocamento;
            break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmx = -this.velocidadeDeDeslocamento;
            break;
        
            default:
                break;
        }
    }
    
    public void parar(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmy = 0;
            break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmy = 0;
            break;
            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmx =0;
            break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmx = 0;
            break;
            default:
                break;
        }
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
