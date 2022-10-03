/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Scanner input = new Scanner(System.in);
        
        //int dia, mes, ano;
        String op = "1";
        String op2 = "0";
        int contador = 0;
        String horas;
        String salario;
        String filhos;
        String diaContrato;
        String mesContrato;
        String anoContrato;
        String nome;
        String dia;
        String mes;
        String ano;
        
        System.out.println("Ola! Entre com os dados do funcionario que deseja cadastrar!");
        
        while(Integer.parseInt(op) != 0){
            
            System.out.println("Nome do funcionario:");
            nome = input.nextLine();
            System.out.println("Dia do nascimento:");
            dia = input.nextLine();
            System.out.println("Mes do nascimento:");
            mes = input.nextLine();
            System.out.println("Ano do nascimento:");
            ano = input.nextLine();
            System.out.println("");
            Funcionario f = new Funcionario(nome, Integer.parseInt(dia), 
                    Integer.parseInt(mes), Integer.parseInt(ano));
            funcionarios.add(f);
            System.out.println("Usuario cadastrado com sucesso!\n");
            System.out.println("Deseja contratar o funcionario? 1 - SIM | | 0 ou outro valor - NAO");
            
            op2 = input.nextLine();
            
            if(Integer.parseInt(op2) == 1){
                op2 = "0";
                
                System.out.println("Qual o valor do salario?");
                salario = input.nextLine();
                
                System.out.println("Quantos filhos com menos de 18 anos?");
                filhos = input.nextLine();
                
                System.out.println("Qual o dia do contrato?");
                diaContrato = input.nextLine();
                
                System.out.println("Qual o mes do contrato?");
                mesContrato = input.nextLine();
                
                System.out.println("E qual o ano do contrato?");
                anoContrato = input.nextLine();
                System.out.println("Qual o tipo de contrato? 1 - Efetivo | | 0 ou outro valor - Horista");
                op2 = input.nextLine();
                
                if(Integer.parseInt(op2) == 1){
                    
                    funcionarios.get(contador).contrataEfetivo(true, Double.parseDouble(salario), Integer.parseInt(filhos), 
                            Integer.parseInt(diaContrato), Integer.parseInt(mesContrato), 
                            Integer.parseInt(anoContrato));
                    
                }
                
                else{
                    System.out.println("Quantas horas foram trabalhadas?");
                    
                    horas = input.nextLine();
                    
                    funcionarios.get(contador).contrataHorista(false, Double.parseDouble(salario), Integer.parseInt(filhos), 
                            Integer.parseInt(diaContrato), Integer.parseInt(mesContrato), 
                            Integer.parseInt(anoContrato), Integer.parseInt(horas));
                }
            }
            
            contador++;
            
            System.out.println("Deseja cadastrar outro funcionario? 1 ou outro valor - SIM   ||   0 - NAO");
            op = input.nextLine();
            
            
        }
        op = "0";
        
        while(true){
            System.out.println("Atualmente existem "+funcionarios.size()+" "
                    + "cadastrados numerados de 0 a "+(funcionarios.size()-1)+" Qual folha de pagamento deseja ver? A opção -1 sairá na busca ");
            
            op = input.nextLine();
            
            if(Integer.parseInt(op) == -1)
                break;
            
            funcionarios.get(Integer.parseInt(op)).imprimeFolhaDoFuncionario();
                
            
            
        }
        
        //System.out.println(funcionarios.get(2).getNascimento());
    }
    
}
