package aulas.poo.exemplo;

public class Principal {

    public static void main(String[] args) {
        Personagem heroi = new Personagem("clovis", 30);
        heroi.cumprimentar();
        
        Personagem vilao = new Personagem("Jonas", 25);
        vilao.cumprimentar();

        Personagem npcFerreiro = new Personagem("Taubaté", 26);
        npcFerreiro.cumprimentar();

    }
}
