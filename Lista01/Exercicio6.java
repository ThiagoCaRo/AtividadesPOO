/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio6;

/**
 *
 * @author thiag
 */
import java.util.Scanner;
public class Exec6 {

    public static int converter(int hora, int minuto, int segundo){
        int converter = 0;
        
        converter = (hora*3600)+(minuto*60)+segundo;
        
        return converter;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora1,minuto1,segundo1 = 0 ;
        int hora2,minuto2,segundo2 = 0;
        
        int res,convert1, convert2 = 0;
        System.out.println("Entre com o primeiro horário no formato hora, minutos e segundos");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("HORAS:");
        hora1 = input.nextInt();
        System.out.println("MINUTOS:");
        minuto1 = input.nextInt();
        System.out.println("SEGUNDOS:");
        segundo1 = input.nextInt();
        System.out.println("================================");
        System.out.println("HORAS:");
        hora2 = input.nextInt();
        System.out.println("MINUTOS:");
        minuto2 = input.nextInt();
        System.out.println("SEGUNDOS:");
        segundo2 = input.nextInt();
        
        convert1 = converter(hora1, minuto1, segundo1);
        convert2 = converter(hora2, minuto2, segundo2);
        
        res = convert1 - convert2;
        
        if(res < 0){
            res*=-1;
        }
        
        System.out.println("RESULTADO = "+res+" segundos");
        
        
        
    }
    
}
