/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaventurus03.slide12;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio03 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o numero   ");
            double numero = scan.nextDouble();
            parimpar(numero);
            
    }
    public static void parimpar(double numero2){
        if (numero2%2==0){
            System.out.println("numero par ");
        }else{
            System.out.println("numero impar");
        }
    
    }
    
}
