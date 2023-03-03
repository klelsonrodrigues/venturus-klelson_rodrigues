/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide06;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio05 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do lado 1 : ");
            double a = scan.nextDouble();
           System.out.println(" digite o valor do lado 2: ");
            double b = scan.nextDouble();
            System.out.println(" digite o valor do lado 3 : ");
            double c = scan.nextDouble();
            if ((a+b)>c && (a+c)>b && (b+c)>a) {
                    System.out.println("é triangulo");
            
                if(a==b && a==c && b==c){
                    System.out.println("equilatero");
                }
                if(a!=b && a!=c && b!=c){
                    System.out.println("Escaleno");
                }
                if(a==b || a==c || b==c){
                    System.out.println("isoceles");
                }        
            }
    
    }
    
}
