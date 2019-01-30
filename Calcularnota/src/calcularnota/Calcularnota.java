/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularnota;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author adria
 */
public class Calcularnota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat redondeo =new DecimalFormat("#.##");
        double num;
        double media;
        double nota1,nota2;
        System.out.println("Introduce la nota del primer examen: ");
        num = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        media = sc.nextDouble();        
        nota1 = num*0.4;
        nota2 = (media-nota1)/0.6;
        System.out.println("Para tener un "+media+" en el trimestre necesitas sacar un "+redondeo.format(nota2)+" en el segundo examen");
    }
    
}
