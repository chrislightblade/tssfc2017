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
public class Talloncino {
    
    private String nomeTizio;
    //private date data;
    private String nomeLibro;
    private String dataPrestito;
    private String dataRestituzione = "";

    public Talloncino(String nomeTizio, String nomeLibro, String dataPrestito) {
        this.nomeTizio = nomeTizio;
        this.nomeLibro = nomeLibro;
        this.dataPrestito = dataPrestito;
    }

    public String getNomeTizio() {
        return nomeTizio;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }
    
    public String dataPrestito(){
        return dataPrestito;
    }
    
    public String dataRestituzione(){
        if(dataRestituzione.equalsIgnoreCase("")){
            return "nessuna data di restituzione\n";
        }
        return dataRestituzione;
    }

    public void setDataRestituzione(String dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }
    
    
}
