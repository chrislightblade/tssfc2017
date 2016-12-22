/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez10;

/**
 *
 * @author tss
 */
public class Matrix {
    
    int size;
    int [][] matrice;
    String[][] valori;

    public Matrix(int size) {
        this.size = size;
        this.matrice = new int[size][size];
        this.valori = new String[size][size];
        int nextnum = 1;
        for (int i = 0; i < size; i++) {//scorro le righe
            for (int j = 0; j < size; j++) {//scorro le colonne
            matrice[i][j] = nextnum++;
            valori[i][j] = " - "; 
        }
        }
    }
    
    public String printMatrix() {
        
        String report = "";
        for (int i = 0; i < matrice.length; i++) {//scorro le righe
            for (int j = 0; j < matrice.length; j++) {//scorro le colonne
            report += matrice[i][j] + "\t";
        }
           report += "\n";
        }
        
        report += "\n";
        
        for (int i = 0; i < valori.length; i++) {//scorro le righe
            for (int j = 0; j < valori.length; j++) {//scorro le colonne
            report += valori[i][j] + "\t";
        }
           report += "\n";
        }
        return report;
    }
    
    
}
