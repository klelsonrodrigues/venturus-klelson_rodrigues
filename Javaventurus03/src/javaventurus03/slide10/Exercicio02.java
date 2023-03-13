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
public class Exercicio02 {
        public static void main(String[] args) {
            int senha2;
            do {                
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite a senha  ");
            int senha = scan.nextInt();
            
                if (senha==2023) {
                    System.out.println(" senha correta ");
                    break;
                }else{
                    senha2=2; 
                }    
            } while (senha2!=2023);
    }
    
}
