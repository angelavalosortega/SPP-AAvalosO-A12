/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a12;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e,p,imc;
        String ex = "Introduzca su estatura";
        String px="Introduzca su peso";
        JOptionPane.showMessageDialog(null, "Este programa es para calcular tu IMC");
        e=pedirDato(ex);
        p=pedirDato(px);
        imc=(p/e^2);
        JOptionPane.showMessageDialog(null,"Su indice de masa corporal es de "+imc);
    }
public static int pedirDato(String mensaje) {
    int n=0;
    Scanner kb= new Scanner(System.in);
    boolean flag;
    do{
        
        try{
            String x= JOptionPane.showInputDialog (null,mensaje);
            n = new Integer (x);
            flag=false;
        }catch(Exception er){
            JOptionPane.showMessageDialog(null,"Intentelo de nuevo");
            flag=true;
            kb.nextLine();
        }
    }while (flag);

    return n;    
}    
}
