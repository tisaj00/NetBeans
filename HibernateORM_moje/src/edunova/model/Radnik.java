/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Radnik extends Entitet implements Serializable{
    
    private String ime;
    private String prezime;
    private String oib;
    private String spol;
    
    @Temporal(TemporalType.DATE)
    private Date datumRodenja;
    
    private String mobitel;
    private String osnovicaPoSatu;
    private String opcinaPrebivaliste;

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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
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

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

    public String getOsnovicaPoSatu() {
        return osnovicaPoSatu;
    }

    public void setOsnovicaPoSatu(String osnovicaPoSatu) {
        this.osnovicaPoSatu = osnovicaPoSatu;
    }

    public String getOpcinaPrebivaliste() {
        return opcinaPrebivaliste;
    }

    public void setOpcinaPrebivaliste(String opcinaPrebivaliste) {
        this.opcinaPrebivaliste = opcinaPrebivaliste;
    }
    
    
    
}
