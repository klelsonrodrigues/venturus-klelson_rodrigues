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
public class Exercicio07 {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor : ");
            Double numero1 = scan.nextDouble();
            System.out.println(" digite o valor : ");
            Double numero2 = scan.nextDouble();
            String resultado = (numero1>numero2 ) ? "o resultado "+(numero1+numero2) :"o resultado "+(numero1-numero2);
            System.out.println(resultado);
           
    }
    
}
