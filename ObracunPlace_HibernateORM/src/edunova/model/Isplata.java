/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Isplata extends Entitet implements Serializable{
    
    @ManyToOne
    private Radnik radnik;
    
    private String racunRadnika;
    
    @Temporal(TemporalType.DATE)
    private Date datum;
    private String nazivIsplate;


    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public String getRacunRadnika() {
        return racunRadnika;
    }

    public void setRacunRadnika(String racunRadnika) {
        this.racunRadnika = racunRadnika;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNazivIsplate() {
        return nazivIsplate;
    }

    public void setNazivIsplate(String nazivIsplate) {
        this.nazivIsplate = nazivIsplate;
    }
    
    
    
}
