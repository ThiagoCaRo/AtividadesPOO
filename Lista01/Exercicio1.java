/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;
import java.util.Scanner;

public class Exec1 {

    public static void main(String[] args) {
        int nasceu, atual;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o ano em que você nasceu e o ano atual?");
        
        nasceu = input.nextInt();
        atual = input.nextInt();
        
        atual = atual - nasceu;
        
        System.out.println("A idade que você faz no ano atual é "+atual+" anos");
        
        
    }
    
}
