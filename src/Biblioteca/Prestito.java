 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;
import java.util.Date;
import util.DateFunction;
/**
 *
 * @author tss
 */
public class Prestito {
    
    private int codCliente;
    private int codLibro;
    private String dataPrestito;
    private String dataRestituzione;
    boolean reso = false;
    String note;
    private int numeroPrestito;

    public Prestito(int codCliente, int codLibro, String note) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.note = note;
        this.dataPrestito = DateFunction.converti(new Date());
        
    }

    public String getDataPrestito() {
        return dataPrestito;
    }

    public void setDataPrestito(String dataPrestito) {
        this.dataPrestito = dataPrestito;
    }

    public boolean isReso() {
        return reso;
    }

    public void setReso(boolean reso) {
        this.reso = reso;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }   

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public String getDatapreso() {
        return dataPrestito;
    }

    public String getDataRestituzione() {
        return dataRestituzione;
    }

    public void setDataRestituzione(String dataconse) {
        this.dataRestituzione = dataconse;
    }

    public int getNumeroPrestito() {
        return numeroPrestito;
    }

    public void setNumeroPrestito(int numeroPrestito) {
        this.numeroPrestito = numeroPrestito;
    }
    
    
    
}
