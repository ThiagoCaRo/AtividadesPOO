/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio10;

/**
 *
 * @author thiag
 */
import java.util.Scanner;
import java.util.Random;
public class Exec10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int resposta = rand.nextInt(100)+1;
        
        int tentativa,qtdtentativas = 0;
        System.out.println("DESCUBRA O NÚMERO!");
        while(true){
            tentativa = input.nextInt();
            qtdtentativas++;
            if(tentativa < resposta){
                System.out.println("O seu valor é menor que o número!");
            }
            
            else if(tentativa > resposta){
                System.out.println("O seu valor é maior que o número!");
            }
            
            else{
               System.out.println("PARABÉNS, VOCÊ ACERTOU!!!");
               System.out.println("Número de tentativas: "+qtdtentativas);
               break;
            }
            
            
        }
    }
    
}
