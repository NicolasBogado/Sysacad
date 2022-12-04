package sysacad;

import javax.swing.JOptionPane;

public class Menu {
    public void menu(){    
    String ver_menu = "";    
    int opcion = 0;
    Bienvenida saludo = new Bienvenida();
    RegistroAlumno registro = new RegistroAlumno();
    
    String menu [] = new String [] {"\n1-Materias del plan\n2-Estado académico\n3-Exámenes\n4-Correlatividad para cursar\n5-Correlatividad para rendir\n6-Avisos\n7-Salir\n"};                      
    saludo.Bienvenida();
    registro.registro();
    
    for(int i = 0;i < 7;i++){            
        ver_menu += menu[i];
        JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: "));
        
        while(opcion > 0 && opcion < 8){
            if(opcion == 1){
            JOptionPane.showMessageDialog(null,
"   Materias del plan "+"\n"+
"   Año    |   Dic.    |         Materia                                            | Se cursa | Se rinde  |" + "\n" +
  "      1      |    1c     |Matemática                                                 |   Si     |    Si     |" + "\n" +
  "      1      |    1c     |Programación 1                                         |   Si     |    Si     |" + "\n" +
  "      1      |    1c     |Sistemas de Pocesamiento de Datos |   Si     |    Si     |" + "\n" +
  "      1      |    1c     |Ingles 1                                                        |   Si     |    Si     |" + "\n" +
  "      1      |    1c     |Laboratorio de computación 1              |   Si     |    Si     |" + "\n" +
  "      1      |    2c     |Programación 2                                        |   Si     |    Si     |" + "\n" +
  "      1      |    2c     |Arquitectura y Sistemas Operativos   |   Si     |    Si     |" + "\n" +
  "      1      |    2c     |Estadística                                                 |   Si     |    Si     |" + "\n" +
  "      1      |    2c     |Ingles 2                                                        |   Si     |    Si     |" + "\n" +
  "      1      |    2c     |Laboratorio de computación 2             |   Si     |    Si     |" + "\n" +
  "      1      |    2c     |Metodología de la investigación           |   Si     |    Si     |" + "\n");
            
            JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: ")); 
            
            }
            else if(opcion == 2){      
            JOptionPane.showMessageDialog(null,
        "-----Estado Académico-----"+"\n"+
"Año |           Materia                                               | Estado   |"+"\n"+
	" 1  |Matemática                                                     | Cursa    |"+"\n"+
	" 1  |Programación 1                                             | Cursa    |"+"\n"+
        " 1  |Sistemas de Pocesamiento de Datos      | Cursa    |"+"\n"+
	" 1  |Ingles 1                                                             | Cursa    |"+"\n"+                   
	" 1  |Laboratorio de computación 1                   | Cursa    |"+"\n"+
	" 1  |Programación 2                                             |          |"+"\n"+
	" 1  |Arquitectura y Sistemas Operativos        |          |"+"\n"+
	" 1  |Estadística                                                      |          |"+"\n"+
	" 1  |Ingles 2                                                             |          |"+"\n"+
	" 1  |Laboratorio de computación 2                   |          |"+"\n"+
	" 1  |Metodología de la investigación                 |          |");
            
            JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: "));    
            }
            else if(opcion == 3){
            JOptionPane.showMessageDialog(null,
        "-----Correlatividad-----"+"\n"+
"Año    |     Materia                                              |     Correlatividad                                  |\n"+
	" 1        |Matemática                                           | Puede Cursar                                       |\n"+
	" 1        |Programación 1                                   | Puede Cursar                                       |\n"+
	" 1        |Sistemas de Pocesamiento de Datos| Puede Cursar                                   |\n"+
	" 1        |Ingles 1                                                  | Puede Cursar                                        |\n"+                    
	" 1        |Laboratorio de computación 1        | Puede Cursar                                        |\n"+
	" 1        |Programación 2                                     | No curso Programación 1-Laboratorio de computación 1|\n"+
	" 1        |Arquitectura y Sistemas Operativos| No curso Sistemas de Pocesamiento de Datos          |\n"+
	" 1        |Estadística                                               | No curso Matemática                                 |\n"+
	" 1        |Ingles 2                                                     | No curso Ingles 1                                         |\n"+
	" 1        |Laboratorio de computación 2           | No curso Programación 1-Laboratorio de computación 1|\n"+
	" 1        |Metodología de la investigación         |                                                     |");
            
            JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: "));
            }
            else if(opcion == 4){
            JOptionPane.showMessageDialog(null,
        "------Correlatidividad Rendir------"+"\n"+
"Año |      Materia                                           |     Correlatividad                                       |"+"\n"+
	" 1     |Matemática                                         | No regularizo                                            |"+"\n"+
	" 1     |Programación 1                                 | No regularizo                                            |"+"\n"+
	" 1     |Sistemas de Pocesamiento de Datos | No regularizo                                    |"+"\n"+
	" 1     |Ingles 1                                                | No regularizo                                            |"+"\n"+                  
	" 1     |Laboratorio de computación 1      | No regularizo                                            |"+"\n"+
	" 1     |Programación 2                                | No regularizo Programación 1-Laboratorio de computación 1|"+"\n"+
	" 1     |Arquitectura y Sistemas Operativos| No regularizo Sistemas de Pocesamiento de Datos          |"+"\n"+
	" 1     |Estadística                                               | No regularizoMatemática                                                          |"+"\n"+
        " 1     |Ingles 2                                                     | No regularizo Ingles 1                                   |"+"\n"+
	" 1     |Laboratorio de computación 2      | No regularizo Programación 1-Laboratorio de computación 1|"+"\n"+
	" 1     |Metodología de la investigación   | No regularizo                                            |");
         
         JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
         opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: "));
            }
            else if(opcion == 5){
            JOptionPane.showMessageDialog(null, 
        "------Correlatividades para rendir------"+"\n"+
	"Examenes "+"\n"+
	"Fecha 	|     Materia                 | Nota     | Especialidad | ");
            
            JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: "));
            }    
            else if(opcion == 6){
            JOptionPane.showMessageDialog(null, "No hay avisos");
            
            JOptionPane.showMessageDialog(null,"-----Menú-----"+ "\n" + ver_menu);            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción: "));
            }    
            else{
            JOptionPane.showMessageDialog(null,"Gracias por Utilizar Sysacad!!!");
            break;
        }          
      }
    }       
  }   
}
