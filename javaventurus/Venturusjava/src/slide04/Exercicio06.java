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
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" digite o numero do funcionario: ");
        double numeroFunc = scan.nextDouble();
        System.out.println(" digite a hora trabalhada: ");
        double horas = scan.nextDouble();
        System.out.println(" digite o valor por hora trabalhada: ");
        double horasvalor= scan.nextDouble();
        double salario;
        salario= horas*horasvalor;
        System.out.println("o funcionario de numero :"+numeroFunc);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("Possuir salario:"+formatador.format(salario));
        
      
    }
 
}
