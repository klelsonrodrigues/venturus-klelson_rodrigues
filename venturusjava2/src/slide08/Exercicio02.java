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
public class Exercicio02 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor do numero ");
            double numero = scan.nextDouble();
            if(numero<=0){
                if (numero%2==0) {
                    System.out.println("numero positivo e par");
                }else{
                    System.out.println("numero positivo e impar");
                }
            }else{
                System.out.println("numero negativo ");
            }
        }
    }
