/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaventurus03.slide11;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class exercicio02 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do numero inicial ");
            double numero1 = scan.nextDouble();
            System.out.println(" digite o valor do numero final ");
            double numero2 = scan.nextDouble();
            
            somar(numero1,numero2); 
            substrair(numero1,numero2);
            multiplicar(numero1,numero2);
            divisao(numero1,numero2);
            
    }
    public static void somar(double x, double y){
        System.out.println("resultado da somar "+(x+y));
    }
    public static void substrair(double x, double y){
        System.out.println("resultado da substracao "+(x-y));
    }
    public static void multiplicar(double x, double y){
        System.out.println("resultado da multiplicacao "+(x*y));
    }
    public static void divisao(double x, double y){
        System.out.println("resultado da divisao "+(x/y));
    }
    
    
}
