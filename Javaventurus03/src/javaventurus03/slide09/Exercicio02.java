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
public class Exercicio02 {
    public static void main(String[] args) {
        
            do{
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do numero ");
            double numero = scan.nextDouble();
                            
                for (double i = numero ; 1 < i;) {{
                        i--;
                        numero= numero*i ;
                        System.out.println("o resultado"+numero);
                }
             
                System.out.println("deseja continuar: digite 1(SIM ) 2(não) ");
                int op = scan.nextInt();
            } while (op<=1);       
        }
    }
}
