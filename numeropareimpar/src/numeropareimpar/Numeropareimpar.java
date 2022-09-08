/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropareimpar;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Numeropareimpar {


    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      
      int n;
      
      System.out.print("Ingrese el numero a probar ");
      
      n = teclado.nextInt();
      
      if(n/2 == 0){
          System.out.print(n+"es un numero par ");
      }else {
          System.out.print(n+"es un numero impar");
      }
      int Nz = Integer.parseInt(JOptionPane.showInputDialog(null, "re ingrese el numero"));
      if (n > 0){
          JOptionPane.showMessageDialog(null, "numero positivo");
      } else {
                    JOptionPane.showMessageDialog(null, "numero negativo");

      }
    }
    
}
