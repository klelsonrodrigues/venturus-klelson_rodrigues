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
public class Exercicio04 {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor da nota 1 ");
            double nota1 = scan.nextDouble();
            System.out.println(" digite o valor do nota 2 ");
            double nota2 = scan.nextDouble();
            System.out.println(" digite o valor do nota 3 ");
            double nota3 = scan.nextDouble();
            double media;
            media= (nota1+nota2+nota3)/3;
            if(media>=7){
                System.out.println("aluno aprovado ");
            } else if (media<7 && media>=5){
                System.out.println("aluno em recuperação"); 
            }else if(media<5){
                System.out.println("aluno reprovado e deverá repetir o semestre");
            }
            
            
         
    }
}
