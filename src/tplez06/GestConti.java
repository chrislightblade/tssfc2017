/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06;

import javax.swing.JOptionPane;

/**
 *
        Correntista cc = new Correntista("Luca Guerrini", 1999);
        cc.setConto(8500);
        if (cc.setConto(33300)) {
            System.out.println("tuttok");
        } else {
            System.out.println("no buonooo");
        }
        
 * @author tss
 */
public class GestConti {

    static Correntista arcc[];
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int numcc;
    numcc=Integer.parseInt(JOptionPane.showInputDialog("quanti correntisti?"));
    arcc= new Correntista[numcc];
    //ciclo per caricare correntisti
    for(int i=0;i<arcc.length;i++){
        String nominativo=JOptionPane.showInputDialog("#" + (i+1)+ " nome?");
        int anno=Integer.parseInt(JOptionPane.showInputDialog("anno nascita?"));
        ////////////////
        Correntista cc= new Correntista(nominativo, anno);
        double conto=Double.parseDouble(JOptionPane.showInputDialog("quanto versi?",0));
        cc.setConto(conto);
        arcc[i]=cc;
        /*arcc[i]= new Correntista(nominativo, anno); //passaggio INDISPENSABILE                                      ///posso fare anche così
        double conto=Double.parseDouble(JOptionPane.showInputDialog("quanto versi?",0));
        arcc[i].setConto(conto);*/
    } //fine caricamento
    
    presentacc();
    
        
    }
    static void presentacc(){
    
    for(int i=0;i<arcc.length;i++){
        System.out.println(arcc[i].getInfo());     
    
    } //fine caricamento
    
    
    }
}
