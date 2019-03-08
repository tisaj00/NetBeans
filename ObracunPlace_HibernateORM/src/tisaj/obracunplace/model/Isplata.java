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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Isplata extends Entitet implements Serializable{
    

    
    @Temporal(TemporalType.DATE)
    private Date datum;
    private String nazivIsplate;
    
    private String vrstaIsplate;
    
    @OneToMany(mappedBy = "isplata")
    private List<Obracun> obracuni = new ArrayList<>();

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

    public List<Obracun> getObracuni() {
        return obracuni;
    }

    public void setObracuni(List<Obracun> obracuni) {
        this.obracuni = obracuni;
    }

    public String getVrstaIsplate() {
        return vrstaIsplate;
    }

    public void setVrstaIsplate(String vrstaIsplate) {
        this.vrstaIsplate = vrstaIsplate;
    }

    

    
}
