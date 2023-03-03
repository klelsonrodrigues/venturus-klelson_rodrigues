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
public class Exercicio08 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor A : ");
            double A = scan.nextDouble();
            System.out.println(" digite o valor B : ");
            double B = scan.nextDouble();
            System.out.println(" digite o valor C : ");
            double C = scan.nextDouble();
            double delta;
            double x1;
            double x2;
            delta=  (B*B) - 4*A*C;
            x1=(-B+Math.sqrt(delta))/2*A;
            x2=(-B-Math.sqrt(delta))/2*A;
            System.out.println("as raizes da equação "+x1+" e "+x2);
    }
    
}
