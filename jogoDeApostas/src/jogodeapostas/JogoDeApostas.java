/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodeapostas;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.Random;

public class JogoDeApostas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int x, y;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introdusa o seu numero da sorte: ");
            x = entrada.nextInt();
            System.out.printf("o teu numero da sorte e %d \n", x);
        
            Random aleatorio = new Random();
            y = aleatorio.nextInt(1, 9);
            System.out.printf("O numero do sistema e %d \n ", y);
        }while(x!=y);
        
    }
    
}
