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
        
        try{
            
            int x, y;
            int processo = 0;
            do{
                Scanner entrada = new Scanner(System.in);
                System.out.println("Introdusa o seu numero da sorte: ");
                x = entrada.nextInt();
                    if(x>=1 & x<=9){
                        System.out.printf("o teu numero da sorte e %d \n", x);
                    }else{
                        System.out.println("O valor Inserido e invalido!");
                    }
                Random aleatorio = new Random();
                y = aleatorio.nextInt(1, 9);
                
            }while(x!=y);
            
            System.out.print(y);
            while(processo<=3){
            System.out.printf(". ");
            }
            System.out.printf("O numero do sistema e %d \n ", y);
        
        }catch (Exception e) {
            System.out.println("Ocorreu um erro de Systema!!! \n");
        }
    }
    
}
