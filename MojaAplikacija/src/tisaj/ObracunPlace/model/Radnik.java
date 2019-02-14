/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.ObracunPlace.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Josip
 */
public class Radnik {
    
    private int id;
    private String oib;
    private String ime;
    private String prezime;
    private String spol;
    private Date datumRodenja;
    private String mobitel;
    private BigDecimal osnovicaPoSatu;
    private String opcinaPrebivalista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

   

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datum_rodenja) {
        this.datumRodenja = datum_rodenja;
    }

   

    public BigDecimal getOsnovicaPoSatu() {
        return osnovicaPoSatu;
    }

    public void setOsnovicaPoSatu(BigDecimal osnovica_po_satu) {
        this.osnovicaPoSatu = osnovica_po_satu;
    }

    public String getOpcinaPrebivalista() {
        return opcinaPrebivalista;
    }

    public void setOpcinaPrebivalista(String opcina_prebivalista) {
        this.opcinaPrebivalista = opcina_prebivalista;
    }

    @Override
    public String toString() {
        return id + "   " + ime + "   " + prezime + "   " + spol + "   " + datumRodenja ;
    }
    
    
    
}
