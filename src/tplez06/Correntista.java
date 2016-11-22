/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06;

/**
 *
 * @author tss
 */
public class Correntista {

    private String Nome_Cognome;
    //String Cognome;
    private int Anno;//anno di nascita
    private double Conto = 0;
    int min = -5000, max = 10000;//per fare un modello unico per prelievi e versamenti

    public Correntista(String nominativo, int Anno) {
        
        if(Anno > 1900 && Anno < 2016)        
            this.Anno = Anno;
        else
            this.Anno = 1960;
        
        if(Nome_Cognome.length() > 50)
            this.Nome_Cognome = nominativo.substring(0, 50);
        else
            this.Nome_Cognome = nominativo;
        //this.Conto = Conto;
        

    }

    public double getConto(){        
        return Conto;
    }
    
    void versa_nel_contro(double versamento) {
        
            Conto += versamento;
            
        //return Conto;
    }

    void preleva_da_conto(double versamento) {
        Conto -= versamento;
        //return Conto;
    
    }
    
    

}
