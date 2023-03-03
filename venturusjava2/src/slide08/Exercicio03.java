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
public class Exercicio03 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do salario ");
            double salario = scan.nextDouble();
            System.out.println(" digite o valor do numero ");
            double financiamento = scan.nextDouble();
                if(salario/financiamento<=5){
                    System.out.println("financiamento concedido ");
                 }else{
                    System.out.println("finaciamento negado");
                }
                     System.out.println("obrigado por consultar");
    
    }
    
}
