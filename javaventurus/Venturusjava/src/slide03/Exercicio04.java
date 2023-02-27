/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide03;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio04 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
          System.out.println("digite o nome do aluno ");
          String nome = entrada.next();
          System.out.println("digite a idade ");
          int idade = entrada.nextInt();
          System.out.println("digite a primeira nota ");
          double nota1 = entrada.nextDouble();
          System.out.println("digite a segunda nota ");
          double nota2 = entrada.nextDouble();
          System.out.println("digite a terceira nota ");
          double nota3 = entrada.nextDouble();
          System.out.println("digite a quarta nota ");
          double nota4 = entrada.nextDouble();
          double media;
          media =(nota1+nota2+nota3+nota4)/4;
          System.out.println(" o aluno "+nome+" possuir idade " +idade+" anos");
          System.out.println("possuir as seguintes notas  primeiro bimestre "+nota1+" segundo bimestre "+nota2);
          System.out.println("terceiro bimestre "+nota3+" quarto bimestre "+nota4);
          System.out.println("possuir media :"+media);
    }
}
