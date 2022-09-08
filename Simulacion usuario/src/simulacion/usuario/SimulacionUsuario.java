/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacion.usuario;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SimulacionUsuario {


    public static void main(String[] args) {
String nombre = "admin";
String contrasena = "1020";
        JOptionPane.showMessageDialog(null, "Bienvenido ");
String usuario = JOptionPane.showInputDialog("ingrese usuario");
String Contra  = JOptionPane.showInputDialog("ingrese password");     
if(nombre.equals(usuario)){
    if (contrasena.equals(Contra)){
        JOptionPane.showMessageDialog(null, "todo bien todo correcto bienvenido");
    } else{
        JOptionPane.showMessageDialog(null,"contraseña incorrecta","error", JOptionPane.ERROR_MESSAGE);
    }
    }else{
            JOptionPane.showMessageDialog(null,"usuario incorrecto","error", JOptionPane.ERROR_MESSAGE);
            
            }
}
    }
    
   
