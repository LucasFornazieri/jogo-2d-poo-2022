package br.ifpr.jogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import java.util.Objects;

public class Personagem extends ElementoGrafico {

    private int deslocamentoEmX;
    private int deslocamentoEmY;
    private int velocidadeDeDeslocamento;
    private ArrayList<Tiro> tiros;

    private static final int POSICAO_INICIAL_EM_X = 100;
    private static final int POSICAO_INICIAL_EM_Y = 100;

    public Personagem(int velocidadeDeDeslocamento) {
        super.setPosicaoEmX(POSICAO_INICIAL_EM_X);
        super.setPosicaoEmY(POSICAO_INICIAL_EM_Y);
        this.velocidadeDeDeslocamento = velocidadeDeDeslocamento;
        this.tiros = new ArrayList<Tiro>();
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\Imagemnave.png");
        super.setImagem(carregando.getImage());
        super.setLarguraImagem(carregando.getImage().getWidth(null));
        super.setAlturaImagem(carregando.getImage().getHeight(null));
    }

    public void atualizar() {
        this.setPosicaoEmX(this.getPosicaoEmX() + this.deslocamentoEmX);
        this.setPosicaoEmY(this.getPosicaoEmY() + this.deslocamentoEmY);
    }

    public void atirar() {
        int frenteDaNave = this.getPosicaoEmX() + this.getLarguraImagem();
        int meioDaNave = this.getPosicaoEmY() + (this.getAlturaImagem() / 2);
        Tiro tiro = new Tiro(frenteDaNave, meioDaNave);
        this.tiros.add(tiro);
    }

    public void mover(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = -this.velocidadeDeDeslocamento;
                break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = this.velocidadeDeDeslocamento;
                break;
            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmX = this.velocidadeDeDeslocamento;
                break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = -this.velocidadeDeDeslocamento;
                break;

            default:
                break;
        }
    }

    public void parar(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmX = 0;
                break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = 0;
                break;
            default:
                break;
        }
    }

    public int getDeslocamentoEmX() {
        return this.deslocamentoEmX;
    }

    public void setDeslocamentoEmX(int deslocamentoEmx) {
        this.deslocamentoEmX = deslocamentoEmx;
    }

    public int getDeslocamentoEmY() {
        return this.deslocamentoEmY;
    }

    public void setDeslocamentoEmY(int deslocamentoEmy) {
        this.deslocamentoEmY = deslocamentoEmy;
    }

    public int getVelocidadeDeDeslocamento() {
        return this.velocidadeDeDeslocamento;
    }

    public void setVelocidadeDeDeslocamento(int velocidadeDeDeslocamento) {
        this.velocidadeDeDeslocamento = velocidadeDeDeslocamento;
    }

    public ArrayList<Tiro> getTiros() {
        return this.tiros;
    }

    public void setTiros(ArrayList<Tiro> tiros) {
        this.tiros = tiros;
    }
}
