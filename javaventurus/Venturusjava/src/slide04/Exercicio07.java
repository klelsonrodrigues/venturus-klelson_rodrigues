/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide04;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" digite o codigo 1 : ");
        double codigo1 = scan.nextDouble();
        System.out.println(" digite o numero de peca 1 : ");
        double numero1 = scan.nextDouble();
        System.out.println(" digite o valor unitario 1 : ");
        double valor1= scan.nextDouble();
        System.out.println(" digite o codigo 2 : ");
        double codigo2 = scan.nextDouble();
        System.out.println(" digite o numero de peca 2 : ");
        double numero2 = scan.nextDouble();
        System.out.println(" digite o valor unitario 2 : ");
        double valor2= scan.nextDouble();
        double resultado;
        resultado=(numero1*valor1)+(numero2*valor2);
        System.out.println("valor a pagar: "+resultado);        
    }
    
}
