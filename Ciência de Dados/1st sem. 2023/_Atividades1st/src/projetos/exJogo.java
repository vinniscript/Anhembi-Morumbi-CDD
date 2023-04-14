package projetos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exJogo {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo de Monstros!");
        
        Personagem personagem;
        Monstro monstro;
        
        if (existeArquivo("savegame.txt")) {
            System.out.println("Deseja carregar o jogo salvo? (s/n)");
            String escolha = scanner.nextLine();
            
            if (escolha.equals("s")) {
                String[] dados = carregarJogo();
                personagem = new Personagem(dados[0], Integer.parseInt(dados[1]));
                monstro = new Monstro(dados[2], Integer.parseInt(dados[3]));
            } else {
                personagem = criarPersonagem();
                monstro = new Monstro("Monstro", 50);
            }
        } else {
            personagem = criarPersonagem();
            monstro = new Monstro("Monstro", 50);
        }

        while (personagem.getVida() > 0 && monstro.getVida() > 0) {
            System.out.println("===============");
            System.out.println("Personagem: " + personagem.getNome() + " (Vida: " + personagem.getVida() + ")");
            System.out.println("Monstro: " + monstro.getNome() + " (Vida: " + monstro.getVida() + ")");
            System.out.println("===============");

            System.out.println("Escolha uma ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Curar");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    int danoPersonagem = personagem.atacar();
                    int danoMonstro = monstro.atacar();
                    System.out.println("Você causou " + danoPersonagem + " de dano no monstro!");
                    System.out.println("O monstro causou " + danoMonstro + " de dano em você!");
                    break;
                case 2:
                    personagem.curar();
                    int danoMonstro2 = monstro.atacar();
                    System.out.println("Você se curou e ganhou 10 pontos de vida!");
                    System.out.println("O monstro causou " + danoMonstro2 + " de dano em você!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            salvarJogo(personagem, monstro);
        }

        if (personagem.getVida() > 0) {
            System.out.println("Parabéns! Você derrotou o monstro e salvou a cidade!");
        } else {
            System.out.println("Infelizmente, você foi derrotado pelo monstro. Tente novamente!");
        }
    }
    
    private static Personagem criarPersonagem() {
        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = scanner.nextLine();
        return new Personagem(nomePersonagem, 100);
    }
    
    private static boolean existeArquivo(String nomeArquivo)