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
    public static int y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        int x;
        try{
            do{ 
                Scanner entrada = new Scanner(System.in);
                System.out.println("Introdusa o seu numero da sorte \n que esteja entre 1 e 9: ");
                x = entrada.nextInt();
                    
                if(x>=1 & x<=9){
                    System.out.println("\n Processando...");
                    Thread.sleep(3000);
                        
                    Random aleatorio = new Random();
                    y = aleatorio.nextInt(1, 9);
                
                    if(x==y){
                        System.out.println(" ");
                        System.out.println("Parabens, voce ganhou!\n");
                        System.out.printf("Numero do Sistema = %d \n", y);
                        System.out.printf("O Numero inserido = %d \n", x);
                        System.out.printf("\n", x);    
                    } else{
                        System.out.println(" ");
                        System.out.println("\n Voce perdeu!\n");
                        System.out.printf("Numero do Sistema = %d \n", y);
                        System.out.printf("O Numero inserido = %d \n", x);
                        Thread.sleep(3000);
                        System.out.println("\n______________________________________\n Tente de novo \n");          
                    }
                         
                }else{
                    System.out.println("O valor Inserido e invalido!");
                }
                    
            }while(x!=y);
            
        }catch (Exception e) {
            System.out.println("Inseriu um dado no formato desconheciso!!! \n Gerou um erro no sistema \n");
        }
    }
}
