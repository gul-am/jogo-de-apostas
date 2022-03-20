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
        System.out.println("""
                           
                                           Instrucoes:
                           
                            Este programa e a simulacao de um casino.
                            Ele tem a funcao de receber do Usuario 
                            um numero aleatorio de 1 a 9 e comparar 
                            com um outro numero gerado aletoriamente
                            pelo sistema.
                            
                            Se os numeros forem identicos o Usuario ganha e
                            se os numeros forem diferentes o Usuario perde!
                           
                            se o valo for 0 ou uma string o systema termina!
                           (isto pode ser usado para terminar o sistema)
                            se o valor for maior que 9 o sistema reinicia!
                            
                            o Sistema so para quando o usuario ganha.
                            
                            Boa Sorte : \n """);
        
        int x;
        try{
            Thread.sleep(10000);
            do{ 
                Scanner entrada = new Scanner(System.in);
                System.out.println("Introdusa o seu numero da sorte \n que esteja entre 1 e 9: ");
                x = entrada.nextInt();
                    
                if( x>=1 & x<=9){
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
            System.out.println("Inseriu um dado no formato desconhecido!!! \n Gerou um erro no sistema \n");
        }
    }
}
