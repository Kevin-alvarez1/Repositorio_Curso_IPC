/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etapas.del.ser.humano2;
import javax.swing.JOptionPane;
public class EtapasDelSerHumano2 {

  
    public static void main(String[] args) {
        int edad;
        String edadtexto;
        
        edadtexto = JOptionPane.showInputDialog(null, "escriba la edad",
                "edad", JOptionPane.QUESTION_MESSAGE);
        
        edad = Integer.parseInt(edadtexto);
        
        if (edad <=12){
            JOptionPane.showMessageDialog(null, "es un niño",
                    "niño", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if (edad <= 18 ){
              JOptionPane.showMessageDialog(null, "es un adolecente",
                    "adolecente", JOptionPane.INFORMATION_MESSAGE);  
            }
            else {
                if (edad <= 65){
                    JOptionPane.showMessageDialog(null, "es un adulto",
                    "adulto", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    if (edad > 66){
                        JOptionPane.showMessageDialog(null, "es un adulto de tercera edad",
                    "anciano", JOptionPane.INFORMATION_MESSAGE);
                    }
                        
                }
                    
            }
        }
        
}
}