/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide07;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio02 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do raio : ");
            double raio = scan.nextDouble();
            if(raio>0){
            double area;
            double pi= 3.14;
            area= pi * (raio*raio);
                System.out.println("o valor da area é "+area);
            }
            if(raio<0){
                System.out.println("voce digitou raio negativo ");
            }
    }
}
