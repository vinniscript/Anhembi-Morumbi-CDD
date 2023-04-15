package projetos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


//  Depois entender o PrintWriter


public class testeinfinito {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
//        String currentDir = System.getProperty("user.dir"); // Pega o diretório atual, não sei porquê.
//        
//        File pastaSave = new File("salvamentos");
//        
//        if(!pastaSave.exists()) { // Verifica pela VARIÁVEL se o nome de dado "salvamentos" já existe.
//        pastaSave.mkdir(); // .mkdir() cria uma pasta, aqui ele avalia, se não existir, ele faz com que exista.
//        }

        try {
        FileWriter arquivo = new FileWriter("meuarquivo.txt");
            System.out.println("Digite o que vai no arquivo: ");
    arquivo.write(kb.next());
    arquivo.close();
    System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e){
            System.out.println("Erro ao esrever no arquivo: " + e.getMessage());
        }
        
        // EXEMPLO DE COMO SERIA PARA SALVAR AS INFORMAÇÕES DE UM JOGO.
        
        
//        String nomeJogador = "João";
//        int pontuacao = 100;
//        int posicaoX = 10;
//        int posicaoY = 20;
//
//        try {
//            FileWriter escritor = new FileWriter("jogo_salvo.txt");
//            escritor.write(nomeJogador + "\n");
//            escritor.write(pontuacao + "\n");
//            escritor.write(posicaoX + "\n");
//            escritor.write(posicaoY + "\n");
//            escritor.close();
//            System.out.println("Jogo salvo com sucesso!");
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar jogo: " + e.getMessage());
//        }
        
    }
}
