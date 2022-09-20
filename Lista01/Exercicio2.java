/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio2;

import java.util.Scanner;
/**
 *
 * @author thiag
 */
public class Exec2 {
    public static void main(String[] args) {
        double numerador, denominador;
        double res;
        Scanner input = new Scanner(System.in);
                
             
        System.out.println("Qual é o numerador e o denominador da divisão?");
        
        numerador = input.nextDouble();
        denominador = input.nextDouble();
        
        while(denominador == 0){
            System.out.println("Denominador nulo, tente novamente");
            denominador = input.nextDouble();
        }
        res = numerador/denominador;
        System.out.println("O resultado de "+numerador+"/"+denominador+" é: "+res);
        
    }
    
}
