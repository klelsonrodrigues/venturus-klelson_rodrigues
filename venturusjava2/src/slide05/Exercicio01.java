/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide05;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" digite a idade : ");
        int idade = scan.nextInt();
   
       String voto = ((idade>=16 && idade<18) || (idade>70)) ? "Eh OPCIONAL" : "NAO Eh OPCIONAL";
       System.out.println(voto);
    }
}
