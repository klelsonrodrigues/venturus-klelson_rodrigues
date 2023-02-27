    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio04 {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          System.out.println("digite o raio do circulo  ");
          double raio = entrada.nextDouble();
          double area;
          double pi=3.14;        
          area=pi*(raio*raio);
          System.out.println("a area do circulo é "+area);
          DecimalFormat formatador = new DecimalFormat("0.0000");
          System.out.println("area  com  4 casas decimais "+formatador.format(area));
    }
    
}
