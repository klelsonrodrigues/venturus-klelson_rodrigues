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
public class Exercicio01 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor Dinheiro : ");
            double dinheiro = scan.nextDouble();
            if (dinheiro>=30) {
                System.out.println("va ao cinema");
        }else if(dinheiro<30){
                System.out.println("fique em casa vendo TV");
        }
            
    }
    
}
