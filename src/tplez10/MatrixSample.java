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
public class MatrixSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dim = 10;
        Matrix matrice = new Matrix(dim);
        for (int i = 0; i < 10; i++) {
            
        
        int numeroacaso = (int) (Math.random() * dim * dim);
        int r = (int) Math.floor(numeroacaso / dim);//riga es 12 ---> riga 2
        int c = (int) Math.floor(numeroacaso % dim);//colonna es 12 ----> colonna 2
        matrice.valori[r][c] = "" + (numeroacaso + 1);//inserisco numeri a caso tra 1 e 100
        }
        System.out.println(matrice.printMatrix());
    }

}
