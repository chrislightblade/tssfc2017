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
public class Uso_oggetti_OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Esaminando_old alunno1 = new Esaminando_old("Mario", "Rossi");
        //alunno1.cognome = "Rossi";
        //alunno1.nome = "Mario";
        alunno1.impostaVoto(81);
        
        String output = alunno1.cometiChiami() + " " + alunno1.cognome + " voto:" + alunno1.leggiVoto();
        System.out.println(output);
        
        Esaminando_old alunno2 = new Esaminando_old("Giuseppe", "Verdi");
        //alunno2.cognome = "Verdi";
        //alunno2.nome = "Giuseppe";
        alunno2.impostaVoto(99);
        
        output = alunno2.cometiChiami() + " " + alunno2.cognome + " voto:" + alunno2.leggiVoto();
        System.out.println(output);
        
        if(alunno1.leggiVoto() > alunno2.leggiVoto())
            output = "Bravo Gino (" + alunno1.cognome + ")\n";
        
        else
            output = "Bravo Gino (" + alunno2.cognome + ")\n";
        
        System.out.println(output);
    }
    
}
