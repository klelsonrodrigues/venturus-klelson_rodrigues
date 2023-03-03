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
public class Exercicio07 {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor 1");
            double numero = scan.nextDouble();
            System.out.println(" digite o valor 2");
            double numero2  = scan.nextDouble();
            System.out.println("para somar digite 1");
            System.out.println("para substrair digite 2");
            System.out.println("para multiplicar digite 3");
            System.out.println("para dividir digite 5");
            System.out.println(" digite a operaçao ");
            int operacao= scan.nextByte();
            double resultado;
            switch (operacao) {
            case 1:
               resultado=numero+numero2;
                System.out.println("o valor da soma é"+resultado);
                break;
            case 2:
               resultado=numero-numero2;
                System.out.println("o valor da substracao é"+resultado);
                break;    
             case 3:
               resultado=numero*numero2;
                System.out.println("o valor da multiplicacao é"+resultado);
                break;
             case 4:
               resultado=numero/numero2;
                System.out.println("o valor da divisao é"+resultado);
                break;   
            default:
                System.out.println("opçao digitada não disponivel ");
                break;
        }       
    }
}
