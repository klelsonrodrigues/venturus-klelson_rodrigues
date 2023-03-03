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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do peso ");
            double massa  = scan.nextDouble();
            System.out.println(" digite o valor da altura ");
            double altura = scan.nextDouble();
            double imc;
            imc= massa/(altura*altura);
                if(imc<16){
                    System.out.println("magreza grave");
                }else if (imc>16 && imc<=17){
                    System.out.println("Magreza moderada");
                }else if (imc>17 && imc<=18.5){
                    System.out.println("Magreza leve");
                }else if (imc>18.5 && imc<=25){
                    System.out.println("saudavel ");
                }else if (imc>25 && imc<=30){
                    System.out.println("sobrepeso");
                }else if (imc>30 && imc<=35){
                    System.out.println("obesidade grau 1");
                }else if (imc>35 && imc<40){
                    System.out.println("obesidade grau 2(servera)");
                }else if (imc>=40){
                    System.out.println("obesidade grau 3 (morbida)");
                }
    }
    
}
