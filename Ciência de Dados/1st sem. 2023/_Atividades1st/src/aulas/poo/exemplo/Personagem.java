package aulas.poo.exemplo;

public class Personagem {

    private int vida;
    private String nome;

    // MÉTODO CONSTRUTOR
    public Personagem(String nome, int vida) {
        this.nome = nome.toUpperCase();
        this.vida = vida;
    }

    public void cumprimentar() {
        System.out.println("Olá, eu sou o " + this.nome);
    }
    //Colocando nova vida ao personagem

    public void setVida(int vida) {
        this.vida = vida;
    }
    // Pegar valores da vida

    public int getVida() {
        return this.vida;
    }
}
