/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio3;

import java.util.Scanner;
public class Exec3 {
    public static void main(String[] args) {
        double salario, emprestimo;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o seu salário atualmente?");
        salario = input.nextDouble();
        System.out.println("Qual é o valor do empréstimo que deseja?");
        emprestimo = input.nextDouble();
        
        if(emprestimo <= salario*0.3){
            System.out.println("O empréstimo poderá ser feito");
        }
        else{
            System.out.println("Valor muito alto para o empréstimo");
        }
        
        
        
    }
    
}
