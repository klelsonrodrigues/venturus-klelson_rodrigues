/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaventurus03.slide10;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio01 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do numero inicial ");
            double numero = scan.nextDouble(); 
        
        
       for(int i = 1;i<=numero;i++) {
            
            boolean primo = true;
            
            for(int j = 2;j<i;j++) {
                
                if(i%j == 0) {
                    primo = false;
                }
                
                if(primo) {
                    System.out.println(i);
                }
            }
       }
    }
}
            
            
    

