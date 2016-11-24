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
public class TpOOLez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String output;
        Esaminando alunno1 = new Esaminando("guerrini", "luca");
        alunno1.cognome = "guerrubi";
        alunno1.nome = "guerrubi";
        alunno1.impostaVoto(835);

        output = alunno1.cometichiami() + " voto:" + alunno1.leggoVoto();
        System.out.println(output);

        Esaminando alunno2 = new Esaminando("zuzzuri", "gaspari");
        alunno2.impostaVoto(77);

        output = alunno2.cometichiami() + " voto:" + alunno2.leggoVoto();
        System.out.println(output);
        if (alunno1.seipiubravodi(alunno2) == true) {
            output = "bravo " + alunno1.cognome;
        } else {
            output = "bravo " + alunno2.cognome;
        }
        System.out.println(output);
        
        Correntista cc = new Correntista("Luca Guerrini", 1999);
        cc.setConto(8500);
        if (cc.setConto(33300)) {
            System.out.println("tuttok");
        } else {
            System.out.println("no buonooo");
        }
        System.out.println(cc.getInfo());
    }
}
