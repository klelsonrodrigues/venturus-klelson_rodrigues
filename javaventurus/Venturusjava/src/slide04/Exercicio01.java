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
public class Exercicio01 {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          System.out.println("digite o nome do correntista   ");
          String nome = entrada.next();
          System.out.println("digite a agencia do correntista ");
          double agencia = entrada.nextDouble();
          System.out.println("digite a conta do correntista");
          double conta = entrada.nextDouble();
          System.out.println("o nome do correntista: "+nome);
          System.out.println("a agencia do correntista: "+agencia );
          System.out.println("o numero da conta é "+conta);
    }
}
