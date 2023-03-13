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
public class Exercicio03 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite numero  ");
            int numero = scan.nextInt();
            for(int i = numero; i>0;i--){//não pode fazer divisoes com zero
            if(numero%i==0){
                System.out.println(i);
            }
            }         
    }
    
}
