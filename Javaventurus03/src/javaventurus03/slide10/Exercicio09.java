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
public class Exercicio09 {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
            System.out.println(" digite o numero de massa  ");
            double massa = scan.nextDouble();
            double tempo=0;
            double massaf;
            for (double i = massa; massa <= 0,5; massa=massa/2 ) {
            massaf= massa;
            tempo=tempo+0.50;
            }
            System.out.println("massa incial"+massa);
            System.out.println("massa final"+massaf);
                double tempohoras=tempo/60;
                double tempominuto=tempo%60;
            System.out.println("tempo necessario " +tempohoras+" horas "+ tempominuto);
    }
}
