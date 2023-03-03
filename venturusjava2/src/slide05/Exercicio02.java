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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" digite o dia : ");
        int dia = scan.nextInt();
        if (dia>=1 && dia<=15) {
            System.out.println("primeira quinzena");
        }
        if (dia>15 && dia<=30) {
            System.out.println("segunda quinzena");
        }
    }
 
}
