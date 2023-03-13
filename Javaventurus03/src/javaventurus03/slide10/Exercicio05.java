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
public class Exercicio05 {
       public static void main(String[] args) {
           int produto2 = 0;
           int produtoA = 0;
           int produtoB = 0;
           int produtoC = 0;
           int produto3;
           do {
           do {               
              Scanner scan= new Scanner(System.in);
               System.out.println("escolha uma opção");
               System.out.println("1-produto A");
               System.out.println("2-produto B");
               System.out.println("3- produto C");
               System.out.println("4 para sair");
               System.out.println("digite a opcao ");
               int produto = scan.nextInt();
               if(produto==1){
                   produtoA= produtoA +1;
               }
               if(produto==2){
                   produtoB= produtoB +1;
               }
               if(produto==3){
                   produtoC= produtoC +1;
               }
               if(produto==4){
                   System.out.println("progrma finalizado");
               }
               produto2=produto;
                } while (produto2<1 || produto2>4);
               produto3 = produto2;
           } while(produto3 != 4);
           System.out.println("quantidade produto A "+produtoA);
           System.out.println("quantidade produto B "+produtoB);
           System.out.println("quantidade produto C "+produtoC);
           System.out.println("muito obrigado");
           
           
           
           
    }
     
    
}
