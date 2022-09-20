/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author thiag
 */
import java.util.Scanner;

public class Exec4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes;
        int mesNumero = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o nome do mês?");
        mes = input.nextLine();
        
        switch(mes){
            case "Janeiro", "janeiro" -> mesNumero = 1;
            case "Fevereiro", "fevereiro" -> mesNumero = 2;
            
            case "Março", "março" -> mesNumero = 3;
            case "Abril", "abril" -> mesNumero = 4;
            
            case "Maio", "maio" -> mesNumero = 5;
            case "Junho", "junho" -> mesNumero = 6;
            
            case "Julho", "julho" -> mesNumero = 7;
            case "Agosto", "agosto" -> mesNumero = 8;
            
            case "Setembro", "setembro" -> mesNumero = 9;
            case "Outubro", "outubro" -> mesNumero = 10;
                
            case "Novembro", "novembro" -> mesNumero = 11;
            case "Dezembro", "dezembro" -> mesNumero = 12;
        }
        
        System.out.println(mes+" = "+mesNumero);
        
        
        
    }
    
}
