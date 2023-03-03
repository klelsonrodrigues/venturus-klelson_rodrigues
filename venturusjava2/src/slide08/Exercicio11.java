/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide08;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio11 {
        public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor  ");
            double valor  = scan.nextDouble();
            if (valor>=0 && valor<25) {
                System.out.println("intervalo de 0 a 25");
            }else if (valor>=25 && valor<50) {
                System.out.println("intervalo de 25 a 50");
            }else if (valor>=50 && valor<75) {
                System.out.println("intervalo de 50 a 75");
            }else if (valor>=75 && valor<=100) {
                System.out.println("intervalo de 75 a 100");
            }else if (valor<0 && valor>100) {
                System.out.println("fora de intervalo ");
            }
    }
    
}
