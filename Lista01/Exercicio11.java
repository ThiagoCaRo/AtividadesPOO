/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


//C:/Users/thiag/Documents/arquivo.txt
public class Exec11 {

    public static int toInt(String str){
        int a = Integer.parseInt(str);
        return a;
    }
    
    public static double toDouble(String str){
        double a = Double.parseDouble(str);
        return a;
    }
        
    public static void main(String[] args) {
        
        int quantidade;
        int idadeHomens = 0, quantidadeHomens = 0, quantidadeMulheres = 0, quantidadeIdade = 0;
        int maior = 0;
        double menor = 0.0;
        int contadorIf = 0;
        String nomeMaisVelho = "Ninguém";
        String nomeMaisBaixa = "Ninguém";
        
        Scanner input = new Scanner(System.in);
        String diretorio;
        
        System.out.println("Qual é o diretótio completo do arquivo? (diretório)/nome_arquivo.txt");
        diretorio = input.nextLine();
        Path caminho = Paths.get(diretorio);
        
        
        try{
            String texto = Files.readString(caminho);
            
            String textoLinhas[];
            String textoDadosHomens[];
            String textoDadosMulheres[];
            String textoDadosIdade[];
            
            textoLinhas = texto.split("\n");
            
            quantidade = textoLinhas.length;
            
            
            
            for(int i =0; i<quantidade; i++){
                
                textoDadosIdade = textoLinhas[i].split(" ");
                int idadeInterna = toInt(textoDadosIdade[2]);
                
                /*********Para ver quem é o mais velho*********/
                if(i==0){
                    nomeMaisVelho = textoDadosIdade[0];
                    maior = idadeInterna;
                }
                else if(idadeInterna > maior){
                    nomeMaisVelho = textoDadosIdade[0];
                    maior = idadeInterna;
                }
                /***********************************************/
                
                /*Para ver quantos possuem entre 18 e 25 anos*/
                if(idadeInterna>=18 && idadeInterna<=25){
                    
                    quantidadeIdade++;
                }
                
                /***********************************************/
                
                /***Para calcular media de idade dos homens***/
                if(textoLinhas[i].contains("Homem")){
                    textoDadosHomens = textoLinhas[i].split(" ");
                    //System.out.println("IDADE[0] = "+textoIdadesHomens[2]);
                    /*idadeHomens=Integer.parseInt*/
                    idadeHomens += Integer.parseInt(textoDadosHomens[2]);
                    quantidadeHomens++;
                }
                
                /***********************************************/
                
                /*Para calcular a mulher mais baixa e as que estão acima de 70kg*/
                
                else if(textoLinhas[i].contains("Mulher")){
                    textoDadosMulheres = textoLinhas[i].split(" ");
                    System.out.println("STRING: "+textoDadosMulheres[4]);
                    double alturaInterna = toDouble(textoDadosMulheres[4]);
                    if(contadorIf == 0){
                        nomeMaisBaixa = textoDadosMulheres[0];
                        menor = alturaInterna;
                    }
                    
                    else if(alturaInterna < menor){
                        nomeMaisBaixa = textoDadosMulheres[0];
                        menor = alturaInterna;
                    }
                    
                    contadorIf++;
                    if(Double.parseDouble(textoDadosMulheres[4])>=1.6 && 
                            Double.parseDouble(textoDadosMulheres[4])<= 1.7 && 
                            Integer.parseInt(textoDadosMulheres[3])>70){
                        
                        
                        quantidadeMulheres++;
                        
                    }
                }
                
                /***********************************************/
            }
            
            System.out.println("QUANTIDADE DE PACIENTES: "+quantidade);
            System.out.println("MEDIA DE IDADE DOS HOMENS: "+idadeHomens/quantidadeHomens);
            System.out.println("MULHERES COM ALTURA ENTRE 1,60 E 1,70 E PESO MAIOR QUE 70KG: "+quantidadeMulheres);
            System.out.println("QUANTIDADE DE PESSOAS COM IDADE ENTRE 18 E 25 ANOS: "+quantidadeIdade);
            System.out.println("PACIENTE MAIS VELHO: "+nomeMaisVelho);
            System.out.println("PACIENTE MAIS BAIXA: "+nomeMaisBaixa);
            
        }catch(Exception erro){
            System.out.println("AAA");
        }
    }
    
}
