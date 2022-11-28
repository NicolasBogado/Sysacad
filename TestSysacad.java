
package sysacad;

import javax.swing.JOptionPane;


public class TestSysacad {
    public static void main(String[] args) {   
        RegistroAlumno alumno1 = new RegistroAlumno(); 
        int legajo1 = 0, pass1 = 0;
        alumno1.setLegajo(7778);
        alumno1.setContraseña(42093098);
         
        legajo1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese legajo"));       
        if(legajo1 != alumno1.getLegajo()){
            JOptionPane.showInputDialog("Legajo Erroneo, ingrese nuevamente el legajo");                  
        }
        else{
            pass1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña: "));
            if(pass1 == alumno1.getContraseña()){
                JOptionPane.showInputDialog("Menu");
        }
        
        }
    }
}