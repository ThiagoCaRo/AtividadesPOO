/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio9;

/**
 *
 * @author thiag
 */
import java.util.Scanner;

public class Exec9 {

    public static String find(String str){
        char[] charArray = str.toCharArray();
        StringBuilder number = new StringBuilder();
        for(int i =0; i<charArray.length; i++){
            if(Character.isDigit(charArray[i])){
                number.append(charArray[i]);
            }
            
            else if(!number.isEmpty()){
                break;
            }
        }
        return number.toString();
    }
    public static void main(String[] args) {
        String comando = "ON";
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA:");
        
        while(true){
            int digitoA = 0;
            int digitoB = 0;
            int resultado =0;
            
            System.out.println("QUAL OPERAÇÃO DESEJA EXECUTAR? "
                    + "Digite qualquer outra coisa além das opções para sair:");
            
            String[] comandopt;
            comando = input.nextLine();


            if(comando.contains("MULTIPLICA")){
                comandopt = comando.split("POR");
                digitoA=Integer.parseInt(find(comandopt[0]));
                digitoB=Integer.parseInt(find(comandopt[1]));
                resultado= digitoA*digitoB;
            }
            
            else if(comando.contains("DIVIDE")){
                comandopt = comando.split("POR");
                digitoA=Integer.parseInt(find(comandopt[0]));
                digitoB=Integer.parseInt(find(comandopt[1]));
                
                if(digitoB !=0){
                    resultado = digitoA/digitoB;
                }
                
                else{
                    System.out.println("DIVISÃO INVÁLIDA POR 0");
                }
            }
            
            else if(comando.contains("SOMA")){
                comandopt = comando.split("E");
                digitoA=Integer.parseInt(find(comandopt[0]));
                digitoB=Integer.parseInt(find(comandopt[1]));
                resultado = digitoA+digitoB;
            }
            
            else if(comando.contains("SUBTRAI")){
                comandopt = comando.split("DE");
                digitoA=Integer.parseInt(find(comandopt[0]));
                digitoB=Integer.parseInt(find(comandopt[1]));
                resultado = digitoB-digitoA;
            }
            
            else{
                break;
            }
            
            System.out.println("RESPOSTA: "+resultado);
            
        }
    }
    
}
