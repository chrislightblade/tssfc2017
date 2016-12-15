/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez10_biblioteca;

/**
 *
 * @author tss
 */
public class Bibliotecaria extends Persona{

    private Registro registro;
    
    public Bibliotecaria(String nome) {
        super(nome);
        this.registro = new Registro();
    } 
}
