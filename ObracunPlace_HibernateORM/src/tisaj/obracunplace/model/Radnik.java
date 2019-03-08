/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public abstract class Radnik extends Entitet implements Serializable{
    
    private String ime;
    private String prezime;
    private String oib;
    private String spol;
    
    @Temporal(TemporalType.DATE)
    private Date datumRodenja;
    
    private String mobitel;
    private String osnovicaPoSatu;
    private String opcinaPrebivaliste;
    
    private String iban;
    
    
    
    @OneToMany (mappedBy = "radnik")
    private List<Obracun> obracuni = new ArrayList<>();

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<Obracun> getObracuni() {
        return obracuni;
    }

    public void setObracuni(List<Obracun> obracuni) {
        this.obracuni = obracuni;
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
