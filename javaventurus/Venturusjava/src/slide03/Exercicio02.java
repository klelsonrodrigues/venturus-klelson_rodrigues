/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide03;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
          System.out.println("digite o primeiro valor   ");
          double numero1 = entrada.nextDouble();
          System.out.println("digite o primeiro valor   ");
          double numero2 = entrada.nextDouble();
          System.out.println("o primeiro valor digitado é"+numero1+" o segundo valor digitado"+numero2);
          System.out.println("a somar é "+(numero1+numero2));
          System.out.println("a substracao é "+(numero1-numero2));
          System.out.println("a multiplicação  é "+(numero1*numero2));
          System.out.println("a divisão é "+(numero1/numero2));
    }
       
}
