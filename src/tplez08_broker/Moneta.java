/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez08_broker;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Moneta {
    
    private double valore;
    private static int taglio[] = new int[]{1, 2, 5, 10, 20};
    
    public Moneta(){
        
    }
    
    public Moneta(int index){        
        this.valore = taglio[index];               
    }

    public static int getDimensioneTaglio() {
        int valore;
        valore = taglio.length;
        return valore;
    }

    public double getValore() {
        return valore;
    }
    
    

    public void setValore(double valore) {
        String report = "";
        double control = valore;
        boolean controllo = false;
        while(controllo == false){        
        if(valore == 1 || valore == 2 || valore == 5 || valore == 10 || valore == 20){
        this.valore = valore;
        report = "Cambio a buon fine\n";
        if(!(control == valore)){
            report += "ma il valore originale " + control + " non era valido, abbiamo inserito il valore vicino più basso " + valore;
        }
        controllo = true;
        } else {
            //report = "Valore non valido";
            //System.out.println(report);   
            //report = JOptionPane.showInputDialog("Inserisci un valore valido");
            //valore = Integer.parseInt(report);
            valore--;
        }
    }
        
        System.out.println(report);
    }
        
}
