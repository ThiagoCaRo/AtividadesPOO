/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio5;

/**
 *
 * @author thiag
 */
import java.util.Scanner;
public class Exec5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes = "Janeiro";
        int mesNumero, diaNumero = 0;
        boolean verify = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a data no formato dia mês");
        diaNumero = input.nextInt();
        System.out.println("Agora digite o número do mês");
        mesNumero = input.nextInt();
        
        switch(mesNumero){
            case 1 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Janeiro";
            }
                
            case 2 -> {
                if(diaNumero > 28){
                    verify = false;
                }
                mes = "Fevereiro";
            }
                
            case 3 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Março";
            }
                
            case 4 -> {
                if(diaNumero > 30){
                    verify = false;
                }
                mes = "Abril";
            }
                
            case 5 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Maio";
            }
                
            case 6 -> {
                if(diaNumero > 30){
                    verify = false;
                }
                mes = "Junho";
            }
                
            case 7 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Julho";
            }
                
            case 8 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Agosto";
            }
                
            case 9 -> {
                if(diaNumero > 30){
                    verify = false;
                }
                mes = "Setembro";
            }
                
            case 10 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Outubro";
            }
                
            case 11 -> {
                if(diaNumero > 30){
                    verify = false;
                }
                mes = "Novembro";
            }
                
            case 12 -> {
                if(diaNumero > 31){
                    verify = false;
                }
                mes = "Dezembro";
            }
        }
        
        if(verify){
            System.out.println(diaNumero+"/"+mesNumero+" de "+mes+" é uma data válida");
        }
        
        else{
            System.out.println(diaNumero+"/"+mesNumero+" de "+mes+" é uma data inválida");
        }
    }
    
}
