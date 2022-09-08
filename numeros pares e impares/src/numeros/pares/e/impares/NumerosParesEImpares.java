/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.pares.e.impares;
import java.util.Scanner;

public class NumerosParesEImpares {

  
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int num1;
    System.out.print("ingrese el numero ");
    num1 = teclado.nextInt();
    if (num1/2 == 0){
        System.out.print(null,"es un numero par" );
                }else {
                System.out.print(null,"es un numero impar" );

    }
    }
}
    