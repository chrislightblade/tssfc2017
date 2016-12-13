/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez10_biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Registro {
    
    ArrayList<Talloncino> prestiti;

    public Registro() {        
    }
       
    public String trovaLibrinonRestituiti(){
        String report = "I libri ancora in prestito sono: \n";
        for (int i = 0; i < prestiti.size(); i++) {
            if(prestiti.get(i).dataRestituzione().equalsIgnoreCase("")){
                report += prestiti.get(i).getNomeLibro() + " preso in prestito da: " + prestiti.get(i).getNomeTizio() + ", preso in prestito il: " + prestiti.get(i).dataPrestito() + "\n";
            }
        }
        return report;
    }
    
}
