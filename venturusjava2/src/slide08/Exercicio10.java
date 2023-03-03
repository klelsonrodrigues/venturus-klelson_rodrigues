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
public class Exercicio10 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor hora inicial  ");
            double horainicial  = scan.nextDouble();
            System.out.println(" digite o valor hora final ");
            double horafinal = scan.nextDouble();
            double duracao;
            duracao= horafinal-horainicial;
           if((duracao>=1) && (duracao<=24)){     
                if (duracao<24) {
                    System.out.println("a duracao do jogo é "+duracao);
                }else if (duracao>=24) {
                    duracao=duracao-24; 
                    System.out.println("a duracao do jogo é "+duracao);
                }
           }    
        }
    }
    

