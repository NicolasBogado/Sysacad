package sysacad;

import javax.swing.JOptionPane;

public class RegistroAlumno {
    int legajo, contraseña;
    
    public void registro() {
        JOptionPane.showMessageDialog(null,"-----Registro de alumno-----\n" + "\nIngrese Legajo: \n");
        JOptionPane.showInputDialog(legajo);                                                  
        JOptionPane.showMessageDialog(null, "\nIngrese contraseña: \n");
        JOptionPane.showInputDialog(contraseña);        
    }
}  
