
package Jogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpaceInvaders extends JPanel {
    
    // Define as dimensões do JPanel
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    
    // Define as coordenadas x e y das estrelas
    private int[] starX;
    private int[] starY;
    
    public SpaceInvaders() {
        // Define o tamanho do JPanel
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        // Inicializa as coordenadas das estrelas
        starX = new int[100];
        starY = new int[100];
        Random rand = new Random();
        for (int i = 0; i < starX.length; i++) {
            starX[i] = rand.nextInt(WIDTH);
            starY[i] = rand.nextInt(HEIGHT);
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Desenha um fundo preto
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        // Desenha estrelas aleatórias
        g.setColor(Color.WHITE);
        for (int i = 0; i < starX.length; i++) {
            g.fillRect(starX[i], starY[i], 2, 2);
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new SpaceInvaders());
        frame.pack();
        frame.setVisible(true);
    }
}

