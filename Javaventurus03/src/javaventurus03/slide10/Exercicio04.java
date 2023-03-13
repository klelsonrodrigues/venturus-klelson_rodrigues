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
public class Exercicio04 {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
        int x2;
        int y2;
          do{
            System.out.println(" digite o valor x ");
            int x = scan.nextInt();
            System.out.println(" digite o valor y  ");
            int y = scan.nextInt();
            if(x>0 && y>0){
                System.out.println("ponto esta no quadrante 1"); 
            }
            if(x>0 && y<0){
                System.out.println("ponto esta no quadrante 2"); 
            }
            if(x<0 && y<0){
                System.out.println("ponto esta no quadrante 3"); 
            }
            if(x<0 && y>0){
                System.out.println("ponto esta no quadrante 4"); 
            }
            x2= x;
            y2= y;
          }while((x2 <0 && x2>0) || ( y2 <0 && y2>0));
          }
          
    
}
