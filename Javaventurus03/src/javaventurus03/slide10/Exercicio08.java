/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaventurus03.slide10;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio08 {
    public static void main(String[] args) {
        int opcao;
        double media;
        double contador=0;
        double mediaturma;
        double mediasomar=0;
       do{
          Scanner scan= new Scanner(System.in);
            System.out.println(" digite o nome   ");
            String nome = scan.next();
            System.out.println(" digite a 1 nota ");
            double nota1 = scan.nextDouble();
            System.out.println(" digite a 2 nota ");
            double nota2 = scan.nextDouble();
            System.out.println(" digite a 3 nota ");
            double nota3 = scan.nextDouble();
            media= (nota1+nota2+nota3)/3;
            mediasomar= mediasomar+media;
            contador= contador+1;
            System.out.println("para continuar digite 1");
            int op= scan.nextInt();
            opcao=op;
       }while(opcao==1);    
        mediaturma=mediasomar/contador;
        System.out.println("media turma "+mediaturma);
       }
    
}
