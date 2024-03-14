/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.simoes.rejustesalario_1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Rejustesalario_1 {

    public static void main(String[] args) {
        
        
        double salario;
        double percentual;
        double reajuste;
        double novosalario;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print(" Entre com teu salario : ");
        salario = tec.nextDouble();
        
        System.out.println("Salario antes do seu reajuste ! " + salario);
        
        if ( salario <=280 ){
            System.out.println("Aumento de 20% ! ");
            percentual = 20;
        } else if ( salario <=700 ){
            System.out.println("Aumento de 15% ! ");
            percentual  = 15;
        } else if ( salario <=1500 ){
            System.out.println("Aumento de 10% ! ");
            percentual = 10;
        }else {
            System.out.println("Aumento de 5% ! ");
            percentual =  5;
        }
        
         percentual = percentual /100;
         reajuste = percentual * salario;
         novosalario = reajuste + salario;
         
         System.out.println(" reajuste foi de : " + reajuste);
         System.out.println(" salario agora eh " + novosalario);
         
       
    }
}
