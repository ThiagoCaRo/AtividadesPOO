/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio7;

/**
 *
 * @author thiag
 */
import java.util.Scanner;
public class Exec7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        int contadorImpar = 0,contadorPar = 0, menorValor = 0, maiorValor = 0, media = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o numero de termos");
        
        n = input.nextInt();
        
        int vetor[] = new int[n];
        
        System.out.println("Entre com os termos do vetor");
        
        for(int i=0; i<n; i++){
            vetor[i] = input.nextInt();
        }
        
        menorValor = vetor[0];
        maiorValor = vetor[0];
        for(int i=0; i<n; i++){
            
            if(vetor[i]%2 == 0){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
            
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
            
            else if(vetor[i] <= menorValor){
                menorValor = vetor[i];
            }
            
            media+=vetor[i];
        }
        
        media /= n;
        
        System.out.println("MENOR = "+menorValor);
        System.out.println("MAIOR = "+maiorValor);
        System.out.println("MEDIA ARITMETICA aprox "+media);
        System.out.println("QUANTIDADE PARES = "+contadorPar);
        System.out.println("QUANTIDADE IMPARES = "+contadorImpar);
        
        
        
        
    }
    
}
