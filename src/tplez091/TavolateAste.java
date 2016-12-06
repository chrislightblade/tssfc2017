/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez091;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class TavolateAste {

    private ArrayList<Oggetto> oggettiAllAsta = new ArrayList<Oggetto>();

    public void addOggetto(Oggetto oggetto) {
        oggettiAllAsta.add(oggetto);
    }

    public int getSizeOggettiAllAsta() {
        return oggettiAllAsta.size();
    }

    public String getNomeOggetto(int index) {//oggettiAllAsta.getNomeOggetto(i)
        return oggettiAllAsta.get(index).getNome();
    }

    public String getMaggioreOfferente(int index) {//oggettiAllAsta.getMaggioreOfferente(i)
        return oggettiAllAsta.get(index).getMaggioreOfferente();
    }

    public int getOfferta(int index) {//oggettiAllAsta.getOfferta(i)
        return oggettiAllAsta.get(index).getOfferta();
    }
    
    public String getReportOfferte(int index){//oggettiAllAsta.getReportOfferte(i)        
        return oggettiAllAsta.get(index).getOfferte();
    } 
}
