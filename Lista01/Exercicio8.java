/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio8;

/**
 *
 * @author thiag
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class Exec8 {

    public static void main(String[] args) {
        String digits;
        Scanner input = new Scanner(System.in);
        ArrayList<String> strArray = new ArrayList<String>();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        System.out.println("Entre com os digitos. Digite fim para terminar:");
        while(true){
            digits = input.nextLine();
            if("fim".equals(digits)){
                break;
            }
            
            strArray.add(digits);
            
        }
        
        for(int i=0; i<strArray.size();i++){
            intArray.add(Integer.parseInt(strArray.get(i)));
        }
        
        intArray.sort(Comparator.naturalOrder());
        
        for(int i=0; i<intArray.size();i++){
            System.out.printf("%d ",intArray.get(i));
        }
    }
    
}
