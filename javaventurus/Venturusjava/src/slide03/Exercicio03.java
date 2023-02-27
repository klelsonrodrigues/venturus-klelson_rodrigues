
package slide03;

import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
          System.out.println("digite o valor da area   ");
          double base = entrada.nextDouble();
          System.out.println("digite o valor da altura ");
          double altura = entrada.nextDouble();
          double area;
          area= (altura*base)/2;
          System.out.println("o valor da base é" +base+"o valor da altura"+altura);
          System.out.println("o valor da area" +area);
    }
}
