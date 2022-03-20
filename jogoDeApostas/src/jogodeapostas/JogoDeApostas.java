//nome do pacote
package jogodeapostas;

//importando a class Scanner para entrada de dados pelo usuario
import java.util.Scanner;

//importando a class Random para gerar numeros aleatorios automaticamente
import java.util.Random;

//nome da class
public class JogoDeApostas {
    
    //Declarando uma variavel global para ser aplicavel em todos os blocos de codigo
    public static int y;
    
    //declarando o metodo main da class como static
    public static void main(String[] args) {  
         //instaciacao de um objecto Scanner para a entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        //imprimindo uma mensage introdutoria com instrucoes de uso
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
        //inicializacao de uma varial local
        int x;
        //Istrucao de verificacao de erros no bloco de repeticao
        try{
            //instrucao para causar uma pausa de 10segundos antes de seguir para o proximo bloco
            Thread.sleep(10000); 
            //instrucao de repeticao condicionada
            do{ 
               //imprimir instrucao para collecta de dados do usuario
                System.out.println("Introdusa o seu numero da sorte \n que esteja entre 1 e 9: ");
                //atribuicao de valor a variavel local mediante a entrada do usuario
                x = entrada.nextInt();
                
                //criacao do primeiro bloco IF. Verificacao das condicoes dos dados introduzidos.
                if( x>=1 & x<=9){
                    //imprimir caso a condicao seja satisfeita
                    System.out.println("\n Processando...");
                    //instrucao para causar uma pausa de 3 segundos antes de seguir para o proximo bloco
                    Thread.sleep(3000);
                    
                    //instaciacao de um objecto Random para a obtencao de um numero aleatorio
                    Random aleatorio = new Random();
                    //atribuicao de valor aleatorio a variavel global
                    y = aleatorio.nextInt(1, 9);
                    
                    //criacao do segundo bloco IF. Comparacao das variveis local e global.
                    if(x==y){
                        //impressao de diversos linhas caso a condicao seja satisfeita
                        System.out.println(" ");
                        System.out.println("Parabens, voce ganhou!\n");
                        System.out.printf("Numero do Sistema = %d \n", y);
                        System.out.printf("O Numero inserido = %d \n", x);
                        System.out.printf("\n", x); 
                   
                      //fim do segundo bloco IF e condicao laternativa    
                    } else{
                        //impressao de diversas linhas caso a condicao nao seja satisfeita
                        System.out.println(" ");
                        System.out.println("\n Voce perdeu!\n");
                        System.out.printf("Numero do Sistema = %d \n", y);
                        System.out.printf("O Numero inserido = %d \n", x);
                        
                        //instrucao para causar uma pausa de 3 segundos antes de seguir para o proximo bloco
                        Thread.sleep(3000);
                        System.out.println("\n______________________________________\n Tente de novo \n");          
                    }
                 //Fim do primeiro bloco IF e condicao laternativa       
                }else{
                    //imprimir caso a condicao nao seja satisfeita
                    System.out.println("O valor Inserido e invalido!");
                }
            //fim do bloco de repeticao condicionada e a condicao para a repeticao do bloco     
            }while(x!=y);
        //Fim da instrucao de verificacao de erros no bloco de repeticao    
        }catch (Exception e) {
            //imprimir caso aconteca um erro no na execucao do bloco protegido
            System.out.println("Inseriu um dado no formato desconhecido!!! \n Gerou um erro no sistema \n");
        }
    }
}
