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
public class Exercicio02 {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          int idade;
          System.out.println("digite o ano atual   ");
          int anoAtual = entrada.nextInt();
          System.out.println("digite o ano de nascimento ");
          int anosnascimento = entrada.nextInt();
          idade = anoAtual - anosnascimento;
          System.out.println("a idade é :"+idade);
    }
}
