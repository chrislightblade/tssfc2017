/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez07_giococarte;

/**
 *
 * @author tss
 */
public class Carta {
    private int valore; // numero della carta ad esempio un 7 
    private int seme; // seme della carta come intero cuori 4 quadri 3 etc
    private String nome; // composto in fase di creazione ad esempio 3 di picche
    
     public Carta (int valore,int seme,String nome){
     this.valore=valore;
     this.seme=seme;
     this.nome=nome;
     }

    public int getValore() {
        return valore;
    }

    public int getSeme() {
        return seme;
    }

    public String getNome() {
        return nome;
    }
     
     
    
}
