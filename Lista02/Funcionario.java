/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import java.util.Calendar;

public class Funcionario {
    private String nome;
    private boolean tipoContrato; //true é efetivo e false horista
    private int filhos;
    private Calendar dataNasc, dataAdm;
    private FolhaPagamento folhaPagamento;
    private double salario;
    
    public Funcionario(String nome, int dia, int mes, int ano){
        this.dataNasc = Calendar.getInstance();
        this.dataAdm = Calendar.getInstance();
        
        folhaPagamento = new FolhaPagamento();
        
        setCalendar(dia, mes, ano, false);
        
        this.nome = nome;
        this.tipoContrato = false;
        this.filhos = 0;
        this.salario = 0.0;
    }
    
    private void setCalendar(int dia, int mes, int ano, boolean flag){
        if(!flag){
            
            this.dataNasc.set(Calendar.YEAR, ano);
            
            switch(mes){
                case 1 -> this.dataNasc.set(Calendar.MONTH, Calendar.JANUARY);
                case 2 -> this.dataNasc.set(Calendar.MONTH, Calendar.FEBRUARY);
                case 3 -> this.dataNasc.set(Calendar.MONTH, Calendar.MARCH);
                case 4 -> this.dataNasc.set(Calendar.MONTH, Calendar.APRIL);
                case 5 -> this.dataNasc.set(Calendar.MONTH, Calendar.MAY);
                case 6 -> this.dataNasc.set(Calendar.MONTH, Calendar.JUNE);
                case 7 -> this.dataNasc.set(Calendar.MONTH, Calendar.JULY);
                case 8 -> this.dataNasc.set(Calendar.MONTH, Calendar.AUGUST);
                case 9 -> this.dataNasc.set(Calendar.MONTH, Calendar.SEPTEMBER);
                case 10 -> this.dataNasc.set(Calendar.MONTH, Calendar.OCTOBER);
                case 11 -> this.dataNasc.set(Calendar.MONTH, Calendar.NOVEMBER);
                case 12 -> this.dataNasc.set(Calendar.MONTH, Calendar.DECEMBER);
                default -> this.dataNasc.set(Calendar.MONTH, Calendar.DECEMBER);
            }
            
            switch(dia){
                case 31 -> {
                    switch(this.dataNasc.get(Calendar.MONTH)){
                        
                        case Calendar.FEBRUARY -> this.dataNasc.set(Calendar.DAY_OF_MONTH, 28);
                            
                        case Calendar.APRIL, Calendar.JUNE, Calendar.SEPTEMBER, Calendar.NOVEMBER -> this.dataNasc.set(Calendar.DAY_OF_MONTH, 30);
                        default -> this.dataNasc.set(Calendar.DAY_OF_MONTH, dia);
                    }
                }
                
                case 30 -> {
                    if(this.dataNasc.get(Calendar.MONTH) == Calendar.FEBRUARY)
                        this.dataNasc.set(Calendar.DAY_OF_MONTH, 28);
                    
                    else{
                        this.dataNasc.set(Calendar.DAY_OF_MONTH, dia);
                    }
                }
                
                default -> {
                    if(dia <= 31)
                        this.dataNasc.set(Calendar.DAY_OF_MONTH, dia);
                    
                    else{
                        this.dataNasc.set(Calendar.DAY_OF_MONTH, 31);
                    }
                }
                  
            }
        }
        
        else{
            
            this.dataAdm.set(Calendar.YEAR, ano);
            
            switch(mes){
                case 1 -> this.dataAdm.set(Calendar.MONTH, Calendar.JANUARY);
                case 2 -> this.dataAdm.set(Calendar.MONTH, Calendar.FEBRUARY);
                case 3 -> this.dataAdm.set(Calendar.MONTH, Calendar.MARCH);
                case 4 -> this.dataAdm.set(Calendar.MONTH, Calendar.APRIL);
                case 5 -> this.dataAdm.set(Calendar.MONTH, Calendar.MAY);
                case 6 -> this.dataAdm.set(Calendar.MONTH, Calendar.JUNE);
                case 7 -> this.dataAdm.set(Calendar.MONTH, Calendar.JULY);
                case 8 -> this.dataAdm.set(Calendar.MONTH, Calendar.AUGUST);
                case 9 -> this.dataAdm.set(Calendar.MONTH, Calendar.SEPTEMBER);
                case 10 -> this.dataAdm.set(Calendar.MONTH, Calendar.OCTOBER);
                case 11 -> this.dataAdm.set(Calendar.MONTH, Calendar.NOVEMBER);
                case 12 -> this.dataAdm.set(Calendar.MONTH, Calendar.DECEMBER);
                default -> this.dataAdm.set(Calendar.MONTH, Calendar.DECEMBER);
            }
            
            switch(dia){
                case 31 -> {
                    switch(this.dataAdm.get(Calendar.MONTH)){
                        
                        case Calendar.FEBRUARY -> this.dataAdm.set(Calendar.DAY_OF_MONTH, 28);
                            
                        case Calendar.APRIL, Calendar.JUNE, Calendar.SEPTEMBER, Calendar.NOVEMBER -> this.dataAdm.set(Calendar.DAY_OF_MONTH, 30);
                        default -> this.dataAdm.set(Calendar.DAY_OF_MONTH, dia);
                    }
                }
                
                case 30 -> {
                    if(this.dataAdm.get(Calendar.MONTH) == Calendar.FEBRUARY)
                        this.dataAdm.set(Calendar.DAY_OF_MONTH, 28);
                    
                    else{
                        this.dataAdm.set(Calendar.DAY_OF_MONTH, dia);
                    }
                }
                
                default -> {
                    if(dia <= 31)
                        this.dataAdm.set(Calendar.DAY_OF_MONTH, dia);
                    
                    else{
                        this.dataAdm.set(Calendar.DAY_OF_MONTH, 31);
                    }
                }
                  
            }
        }
        
    }
    
    public void contrataEfetivo(boolean tipoContrato, double salario, int filhos, 
            int dia, int mes, int ano ){
        
        
        setCalendar(dia, mes, ano, true);
        setTipo(tipoContrato);
        setSalario(salario);
        setFilhos(filhos);
        
        calculaINSS();
        calculaImpostoRenda();
        
        
    }
    
    public void contrataHorista(boolean tipoContrato, double salario, int filhos, 
            int dia, int mes, int ano, int horas){
        
        setCalendar(dia, mes, ano, true);
        setTipo(tipoContrato);
        setSalario(salario);
        salarioBruto(horas);
        setFilhos(filhos);
        
        calculaINSS();
        calculaImpostoRenda();
        
        
    }
    
    private void setTipo(boolean tipoContrato){
        this.tipoContrato = tipoContrato;
    }
    
    private void setSalario(double salario){
        if(this.tipoContrato){
            if(salario >= 1100) //Um funcionário não pode receber menos que o salário mínimo
                this.salario = salario;

            else
                this.salario = 1100.00;
        }
        
        else
            this.salario = 5.3; /*Uma pessoa trabalha em média 26 dias no mês e 8h por dia
                                26x8 = 208 horas no mês ou um pouco mais
                                salario minimo mensal/horas trabalhadas no mes = salalrio por hora*/
        
        
    }
    
    private void setFilhos(int filhos){
        this.filhos = filhos;
    }
    
    private String toString(boolean flag){
        
        if(flag){//Data nascimento
            return dataNasc.get(Calendar.DAY_OF_MONTH)+"/"
                    +(dataNasc.get(Calendar.MONTH)+1)+"/"
                    +dataNasc.get(Calendar.YEAR);
        }
        
        else{
            return dataAdm.get(Calendar.DAY_OF_MONTH)+"/"
                    +(dataAdm.get(Calendar.MONTH)+1)+"/"
                    +dataAdm.get(Calendar.YEAR);
        } 
    }
    
    public String getContrato(){
        if(this.tipoContrato)
            return "Efetivo";
        
        else
            return "Horista";
        
    }
    
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    
    public int getFilhos(){
        return this.filhos;
    }
    
    public String getAdmissao(){
        return toString(false);
    }
    
    public String getNascimento(){
        return toString(true);
    }
    
    private void salarioBruto(int horas){
        if(!this.tipoContrato){
            this.salario*=horas;
        }
    }
    
    public void calculaINSS(){
        folhaPagamento.descontoINSS(this.salario);
    }
    
    public void calculaImpostoRenda(){
        folhaPagamento.descontoImpostoRenda(this.salario);
    }
    
    public void imprimeFolhaDoFuncionario(){
        //System.out.println("ANO: "+getAdmissao());
        folhaPagamento.imprimeFolhaPagamento(this.salario, this.nome,
                getNascimento(),getAdmissao());
    }
    
    /*public double descontoINSS(){
        if(this.salario <= 1659.38)
            return this.salario * 0.08;
        
        else if(this.salario <= 2765.66)
            return this.salario * 0.09;
        
        else if(this.salario < 5531.31)
            return this.salario * 0.11;
        
        else
            return 5531.31 * 0.11;
    }
    
    public double descontoImpostoRenda(){
        if(this.salario <= 1903.98)
            return 0.0;
        
        else if(this.salario <= 2826.65)
            return (this.salario * 0.075) - 142.8;
        
        else if(this.salario <= 3751.05)
            return (this.salario * 0.15) - 354.8;
        
        else if(this.salario <= 4664.68)
            return (this.salario * 0.225) - 636.13;
        
        else
            return (this.salario * 0.275) - 869.63;
    }
    
    public void imprimeFolhaPagamento(int horas){
        double salarioB = salarioBruto(horas);
        double descontoPrevidencia = descontoINSS();
        double descontoIR = descontoImpostoRenda();
        System.out.println("****************FOLHA DE PAGAMENTO****************");
        System.out.println("* ->Funcionario:"+this.nome+"                      ");
        System.out.println("* ->Data de nascimento:"+getNascimento()+"         ");
        System.out.println("* ->Data de admissao:"+getAdmissao()+"             ");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("**************************************************");
        System.out.printf("* ->Salario Bruto %.2f                        \n", salarioB);
        System.out.printf("* ->Desconto INSS %.2f                        \n", descontoPrevidencia);
        System.out.printf("* ->Desconto IR %.2f                          \n", descontoIR);
        System.out.printf("* ->Salario Liquido %.2f                      \n", salarioB-descontoPrevidencia-descontoIR);
        System.out.println("**************************************************");

        
    }*/
}
