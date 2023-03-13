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
public class Exercicio06 {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
            System.out.println(" digite o numero   ");
            int x = scan.nextInt();
            double cubo;
            double quadrado;
            for (int i = 1; i <= x; i++) {
                cubo=i*i*i;
                quadrado= i*i;
                System.out.println(" numero da linha "+i+" o cubo "+cubo+" e o quadrado "+quadrado);
        }
    }
    
}
