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
public class Exercicio12 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println(" digite o valor A ");
            double A  = scan.nextDouble();
            System.out.println(" digite o valor B ");
            double B  = scan.nextDouble();
            System.out.println(" digite o valor C ");
            double C  = scan.nextDouble();
            System.out.println(" digite o valor I ");
            int I  = scan.nextInt();
            double maior=0;
            double meio=0;
            double menor=0;
            if(A>B&&A>C&&B>C){
                    maior=A;
                    meio=B;
                    menor=C;                            
            }else if(A>B&&A>C&&C>B){
                    maior=A;
                    meio=C;
                    menor=B;                            
            }
            if(B>A&&B>C&&A>C){
                    maior=B;
                    meio=A;
                    menor=C;                            
            }else if(B>A&&B>C&&C>A){
                    maior=B;
                    meio=C;
                    menor=A;                            
            }
            if(C>B&&C>A&&B>A){
                    maior=C;
                    meio=B;
                    menor=A;                            
            }else if(C>B&&C>A&&A>B){
                    maior=C;
                    meio=A;
                    menor=B;                            
            }
            switch (I) {
            case 1:
                System.out.println(" a ordem é "+maior+" "+meio+" "+menor);
                break;
            case 2:
                System.out.println("a ordem é"+menor+" "+meio+" "+maior);
                break;
            case 3:
                System.out.println("a ordem é "+menor+" "+maior+" "+meio);
            default:
                System.out.println("opção invalida");
        }
            
    }
    
}
