/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide04;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
          System.out.println("digite o valor de A  ");
          int A = entrada.nextInt();
          System.out.println("digite o valor de B  ");
          int B = entrada.nextInt();
          System.out.println("digite o valor de C  ");
          int C = entrada.nextInt();
          System.out.println("digite o valor de D  ");
          int D = entrada.nextInt();
          int diferenca;
          diferenca= (A*B)-(C*B);
          System.out.println("O resultado "+diferenca);
    }
           
}
