
/* Loja tem 4 vendedores: João, Fabiano, Flávio e Soraia

Cada vendedor tem seu salário, J= 1000, F= 1500, Fl= 800 e S= 2000.

meta de vendo do mês, J= 600 unidades, F= 650u, Fl= 250u e S= 60.

Criar uma matriz do tipo String com todos os valores dos vendedores.
Depois, o programa deve retornar quem bateu a meta, se bateu a meta e não chegou a 10%, 
o vendedor não ganha bônus e,não bateu a meta.
*/

package atvvetor;

public class bancoDados {
    public static void main(String[] args) {
        int vendas;
        float salario;
        boolean nBateu;
        float bonus = 0;
        
        String[][] nome = {{"João", "R$ 1000.00", "600"},
                          {"Fábiano", "R$ 1500.00", "650"},
                          {"Flávio", "R$ 800.00", "250"},
                          {"Soraia", "R$ 2000.00", "60"}};
        
        for (int i = 0 ; i < nome.length ; i++){
            for (int j = 0; j < nome[i].length; j++) {
                vendas = Integer.parseInt(nome[i][2]);
                salario = Float.parseFloat(nome[i][1]);
                bonus += (salario * 0.10);
                nBateu = vendas < 600;
                
            }
        }
        
        }
    }

