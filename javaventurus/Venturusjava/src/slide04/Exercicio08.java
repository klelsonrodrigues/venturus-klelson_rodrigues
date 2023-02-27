/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide04;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" digite o valor A: ");
        double A= scan.nextDouble();
        System.out.println(" digite o valor B: ");
        double B = scan.nextDouble();
        System.out.println(" digite o valor C: ");
        double C= scan.nextDouble();
        double triangulo;
        triangulo=(A*C)/2;
        double circulo;
        double pi=3.14;
        circulo= pi*(C*C);
        double trapezio;
        trapezio=((A+B)*C)/2;
        double quadrado;
        quadrado=B*B;
        double retangulo;
        retangulo=A*B;
        System.out.println("a area do triangulo"+triangulo);
        System.out.println("a area do circulo"+circulo);
        System.out.println("a area do trapezio"+trapezio);
        System.out.println("a area do quadrado"+quadrado);
        System.out.println("a area do retangulo"+retangulo);
        
    }
    
}
