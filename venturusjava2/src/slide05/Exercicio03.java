/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide05;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio03 {
    public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
        System.out.println(" digite o preco : ");
        double preco = scan.nextDouble();
        double resultado;
        if (preco<=30) {
            resultado=preco-((preco*10)/100);
            System.out.println("o resultado"+resultado);
        }
        if (preco>30) {
            resultado=preco-((preco*20)/100);
            System.out.println("resultado "+resultado);
        }
        /**resultado = (preco<30)preco-preco*0,10: preco-preco*0,20;**/
        System.out.println("preco");
    }
    
}
