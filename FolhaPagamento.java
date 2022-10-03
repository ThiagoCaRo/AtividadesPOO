/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class FolhaPagamento {
    
    private double descontoPrevidencia;
    private double descontoIR;
    
    public FolhaPagamento(){
        descontoPrevidencia = 0.0;
        descontoIR = 0.0;
    }
    
    public void descontoINSS(double salario){
        if(salario <= 1659.38)
            descontoPrevidencia = salario * 0.08;
        
        else if(salario <= 2765.66)
            descontoPrevidencia = salario * 0.09;
        
        else if(salario < 5531.31)
            descontoPrevidencia = salario * 0.11;
        
        else
            descontoPrevidencia = 5531.31 * 0.11;
    }
    
    public void descontoImpostoRenda(double salario){
        if(salario <= 1903.98)
            descontoIR = 0.0;
        
        else if(salario <= 2826.65)
            descontoIR = (salario * 0.075) - 142.8;
        
        else if(salario <= 3751.05)
            descontoIR = (salario * 0.15) - 354.8;
        
        else if(salario <= 4664.68)
            descontoIR = (salario * 0.225) - 636.13;
        
        else
            descontoIR = (salario * 0.275) - 869.63;
    }
    
    public void imprimeFolhaPagamento(double salarioBruto, String nome, 
            String nascimento, String admissao){
        
        descontoINSS(salarioBruto);
        descontoImpostoRenda(salarioBruto);
        System.out.println("****************FOLHA DE PAGAMENTO****************");
        System.out.println("* ->Funcionario:"+nome+"                      ");
        System.out.println("* ->Data de nascimento:"+nascimento+"         ");
        System.out.println("* ->Data de admissao:"+admissao+"             ");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("**************************************************");
        System.out.printf("* ->Salario Bruto %.2f                        \n", salarioBruto);
        System.out.printf("* ->Desconto INSS %.2f                        \n", descontoPrevidencia);
        System.out.printf("* ->Desconto IR %.2f                          \n", descontoIR);
        System.out.printf("* ->Salario Liquido %.2f                      \n", salarioBruto-descontoPrevidencia-descontoIR);
        System.out.println("**************************************************");

        
    }
    
    
}
