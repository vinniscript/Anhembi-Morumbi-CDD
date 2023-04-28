package poo;

public class Personagem {

    // Atributos -> caracterí­sticas do personagem
    private int vida = 1;
    private String nome;
    private int defesa = 1; // Reduz no dano que você leva. Se o ataque em você foi 4, você perde 3 de vida
//           ^ <- não é mutável, vai ser 140 e ponto final.

    // CLASSES GERADORAS.
    public Personagem(String nome) { // se quiser mudar o nome do paramêtro, pode mudar.
        this.nome = nome;
    }

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public Personagem(String nome, int vida, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
    }

    // Métodos => Comportamentos.
    public int ataque() {
        return (int) (Math.random() * 5) + 1;
    }
    // getter and setter 
    //(getVida, getNome, getDefesa)<- padronização de métodos de acessos.

    public int getVida() {
        return vida;
    }

    public void setVida(int life) {
        vida = life;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        nome = name;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defense) {
        defesa = defense;
    }

}
