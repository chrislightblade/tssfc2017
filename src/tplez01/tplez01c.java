/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

/**
 *
 * @author tss
 */
public class tplez01c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int b = 2;
        int tmp = 0;
        System.out.println("a = " + a + " b = " + b +" tmp = " + tmp);
        tmp = b;
        System.out.println("a = " + a + " b = " + b +" tmp = " + tmp);
        b = a;
        System.out.println("a = " + a + " b = " + b +" tmp = " + tmp);
        a = tmp;
        System.out.println("a = " + a + " b = " + b +" tmp = " + tmp);
        
        
    }
    
}
