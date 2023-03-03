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
public class Exercicio05 {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
            System.out.println(" digite o nome do funcionario ");
            String nome = scan.next();
            System.out.println(" digite o salario ");
            double salario = scan.nextDouble();
            System.out.println(" digite o salario minimo ");
            double salariom = scan.nextDouble();
            double quantidade;
            double salarionovo;
            double percentual = 0;
            quantidade= salario/salariom;
            if (quantidade>=0 && quantidade<=3){
                percentual=20;
                salarionovo=salario+((salario *percentual)/100);
                System.out.println(+percentual+" aumento salario atual "+salario+" salarionovo "+salarionovo );
            }
            if (quantidade>=4 && quantidade<=6){
                percentual=15;
                salarionovo=salario+((salario *percentual)/100);
                System.out.println(+percentual+" aumento salario atual "+salario+" salarionovo "+salarionovo );
            }
            if (quantidade>=7 && quantidade<=9){
                percentual=12;
                salarionovo=salario+((salario *percentual)/100);
                System.out.println(+percentual+" aumento salario atual "+salario+" salarionovo "+salarionovo );
            }
            if (quantidade>=10 && quantidade<=12){
                percentual=10;
                salarionovo=salario+((salario *percentual)/100);
                System.out.println(+percentual+" aumento salario atual "+salario+" salarionovo "+salarionovo );
            }
            if (quantidade>=13 && quantidade<=15){
                percentual=7;
                salarionovo=salario+((salario *percentual)/100);
                System.out.println(+percentual+" aumento salario atual "+salario+" salarionovo "+salarionovo );
            }
            if (quantidade>=16){
                percentual=0;
                salarionovo=salario+((salario *percentual)/100);
                System.out.println(+percentual+" aumento salario atual "+salario+" salarionovo "+salarionovo );
            }
            
    }
    
}
