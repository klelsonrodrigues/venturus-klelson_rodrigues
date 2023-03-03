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
public class Exercicio03 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor da idade : ");
            int idade = scan.nextInt();
            switch (idade) {
            case 5,6,7,8,9,10:
                System.out.println("categoria infantil");
                break;
            case 11,12,13,14,15:
                System.out.println("categoria juvenil");
                break;    
            case 16,17,18,19,20:
                System.out.println("categoria junior");
                break;
            case 21,22,23,24,25:
                System.out.println("categoria profissional");
            default:
                System.out.println("sem categoria");
        }
    }
}
