/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package los.pkg2.numeros.y.el.mayor;
import java.util.Scanner;

public class Los2NumerosYElMayor {

  
    public static void main(String[] args) {
        int num1,num2;
        Scanner recibir = new Scanner(System.in );
        System.out.print("ingrese el primer numero");
        num1 = recibir.nextInt();
        System.out.print("ingrese el segundo numero");
        num2=recibir.nextInt();
        if (num1 > num2){
            System.out.print("el primer numero es mayor");
        }else {
         System.out.print("el segundo numero es mayor");

                    }
                    
        }
        
    
    
}
