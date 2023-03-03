/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide08;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor A ");
            int A  = scan.nextInt();
            System.out.println(" digite o valor B ");
            int B = scan.nextInt();
            int maior;
            int menor;
            if(A>B){
                maior=A;
                menor=B;
                if(maior%menor==0){
                    System.out.println("numeros sao multiplos");
                }else{
                    System.out.println("nao sao multiplos");
                }  
            }
            if(A<B){
                maior=B;
                menor=A;
                if(maior%menor==0){
                    System.out.println("numeros sao multiplos");
                }else{
                    System.out.println("nao sao multiplos");
                }  
            }
            if(A==B){
                System.out.println("numeros iguais ");
            }
    }
}
