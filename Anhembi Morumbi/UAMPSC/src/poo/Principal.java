package poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Criação de Objetos
        Personagem monstro = new Personagem("Goblin", 10, 2);

        System.out.println("Bem-vindo as terras de pindamonhomgaba, qual seu nome? ");
        Scanner kb = new Scanner(System.in);
        
        String name = kb.next();
        
        Personagem player = new Personagem(name, 30, 3);

        player.setDefesa(5);
        player.setVida(20);
        monstro.setDefesa(2);
        monstro.setVida(10);

//        // ALTERANDO OS ATRIBUTOS DO PERSONAGEM
//        player.nome = "Miguel";
//        player.vida = 30;
//        player.defesa = 3;
//
//        // ALTERANDO OS ATRIBUTOS DO PERSONAGEM
//        monstro.vida = 10;
//        monstro.defesa = 2;
        System.out.println(player.getNome() + "Está andando numa floresta, "
                + "quando de repente...");
        System.out.println("Um " + monstro.getNome() + "sai de trás de um arbusto");
        System.out.println(player.getNome() + " Se a assusta e começa a correr para atacar.");

        int ataqueMiguel = player.ataque();
        System.out.println(player.getNome() + " Atacou o " + monstro.getNome() + "com " + ataqueMiguel + " de dano.");
        System.out.println("Mas, o " + monstro.getNome() + "tem " + monstro.getDefesa() + " de defesa");

        if (monstro.getVida() <= 0) {

            System.out.println(player.getNome() + " Matou o " + monstro.getNome());
            System.out.println("Aí sim");

        } else {
            int vidaMonstro = monstro.getVida() - (ataqueMiguel - monstro.getDefesa());
            monstro.setVida(vidaMonstro);

            System.out.println("O " + monstro.getNome() + "Ainda tem" + monstro.getVida() + "pontos de vida.");
        }
    }
}
