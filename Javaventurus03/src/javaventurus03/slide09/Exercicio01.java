/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaventurus03.slide09;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio01 {
    public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do numero inicial ");
            double numeroInicial = scan.nextDouble();
            System.out.println(" digite o valor do numero final ");
            double numeroFinal = scan.nextDouble();
            double maior;
            double menor;
            if (numeroInicial>numeroFinal) {
                maior=numeroInicial;
                menor=numeroFinal;  
                for (double i = maior; i >= menor; i--) {
                    System.out.println("estou contando "+i);
                }
            }else if (numeroFinal>numeroInicial){
                maior=numeroFinal;
                menor=numeroInicial; 
            
                for (double i = menor ; i <= maior; i++) {
                    System.out.println("estou contando "+i);
                }
            }
    }
    
    
}
