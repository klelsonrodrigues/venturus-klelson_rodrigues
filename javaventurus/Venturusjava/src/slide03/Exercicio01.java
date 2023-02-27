/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide03;

import java.text.DecimalFormat;
public class Exercicio01 {
    public static void main(String[] args) {
        String produto1 = "computador";
        String produto2 = "Tablet";
        int idade = 30;
        int codigo= 5290;
        char sexo= 'F';
        double preco1 = 5100.0;
        double preco2 = 1000.50;
        double medida = 53.234567;
        System.out.println("prudutos");
        System.out.println(produto1+" preco total: "+preco1);
        System.out.println(produto2+" preco total: "+preco2);
        System.out.println("Registro: "+idade+" anos, codigo "+codigo+" sexo:"+sexo);
        System.out.println("medidas com oito casas decimais :"+medida);
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("medidas com  duas casas decimais "+formatador.format(medida));
    }
}
