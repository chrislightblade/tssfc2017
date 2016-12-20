/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;


/**
 *
 * @author tss
 */
public class Cliente extends Persona{
           
    private int codCliente;
    

    public Cliente(int codCliente, String nome, String cognome) {
        super(nome, cognome);
        this.codCliente = codCliente;        
    }

    public int getCodCliente() {
        return codCliente;
    }    
    
    public String getInfo(){
        String msg = "";
        msg = getCodCliente()+ "#: " + getNome()+ " - " + getCognome();
        return msg;
    }
   
    
}
