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
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
            System.out.println("programa solidario");
            System.out.println("digite 1 para doar 10 reais");
            System.out.println("digite 2 para doar 25 reais");
            System.out.println("digite 3 para doar 50 reais");
            System.out.println("digite 4 para doar outros valores");
            System.out.println("digite 5 para cancelar ");
            System.out.println("digite a opção ");
            int opcao = scan.nextInt();
            switch (opcao) {
            case 1:
                System.out.println(" voce doou 10 reais ");
                break;
            case 2:
                System.out.println(" voce doou 25 reais ");
                break;
            case 3:
                System.out.println(" voce doou 50 reais ");
                break;
            case 4:
                System.out.println(" voce doou outros valores ");
                break;
            case 5:
                System.out.println(" voce cancelou ");
                break;    
            default:
                System.out.println("opção não encontrada");
        }
                System.out.println("obrigado por participar");
    }
    
}
