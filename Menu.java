
package sysacad;

public class Menu {
    String menu[] = new String [8];
    
    public void menu(){
        String menu[]= {"1-Materias del Plan", "2-Estado Académico", "3-Exámenes", "4-Correlatividad para cursar",
        "5-Correlatividad para Rendir","6-Avisos","7-Salir"};
        System.out.println("menu = " + menu);        
    }

    public String[] getMenu() {
        return menu;
    }    
}    
