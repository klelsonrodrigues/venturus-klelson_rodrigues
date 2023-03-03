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
public class Exercicio06 {
    public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor : ");
            int numero = scan.nextInt();
            String resultado = (numero>10 ) ? "maior que 10" : "Menor que 10";
            System.out.println("o numero é "+resultado);
            String resultado2 = (numero<10 && numero>5 ) ? "maior que 5" : "Menor que 5";
            System.out.println("o numero é "+resultado2);
    }
    
}
