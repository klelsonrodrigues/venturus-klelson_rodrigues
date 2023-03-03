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
public class Exercicio13 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do salario ");
            double salario  = scan.nextDouble();
            double imposto;
            if(salario<=1903.98){
                System.out.println("isento ");
            }else if(salario>=1903.99 && salario<=2826.65){
                imposto=(7.5*salario)/100;
                System.out.println("imposto a pagar :"+imposto);
            }else if(salario>=2826.66 && salario<=3751.05){
                imposto=(15*salario)/100;
                System.out.println("imposto a pagar :"+imposto);
            }else if(salario>=3751.06 && salario<=4664.68){
                imposto=(22.5*salario)/100;
                System.out.println("imposto a pagar :"+imposto);
            }else if(salario>4664.68){
                imposto=(27.5*salario)/100;
                System.out.println("imposto a pagar :"+imposto);
            }
    }
}
