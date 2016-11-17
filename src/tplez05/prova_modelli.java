/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05;

/**
 *
 * @author tss
 */
public class prova_modelli {
    
    public static void main(String[] args) {
        
        int a = 2,b = 4, c = 6;        
        double somma = 0, prodotto = 0;
        
        somma = sommaABC(a, b, c);
        somma = Math.floor(somma);
        prodotto = prodottoABC(a, b, c);
        
        System.out.println("somma: " + somma + " e prodotto: " + prodotto);
    }

    static double sommaABC(int a, int b, int c) {
        double risultato = 0;
        
        risultato = a + b + c;
        
        return risultato;
    }

    static double prodottoABC(int a, int b, int c) {
        double risultato = 0;
        
        risultato = a * b * c;
        
        return risultato;
    }
}
