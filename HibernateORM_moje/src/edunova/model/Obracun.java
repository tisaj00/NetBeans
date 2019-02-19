/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Obracun extends Entitet implements Serializable{
    
    
    @ManyToOne
    private Isplata isplata;
    
    
    @ManyToOne
    private VrstaPrimanja vrstaPrimanja;
    
    private int kolicinaSati;

    public int getKolicinaSati() {
        return kolicinaSati;
    }

    public void setKolicinaSati(int kolicinaSati) {
        this.kolicinaSati = kolicinaSati;
    }

    public Isplata getIsplata() {
        return isplata;
    }

    public void setIsplata(Isplata isplata) {
        this.isplata = isplata;
    }

    public VrstaPrimanja getVrstaPrimanja() {
        return vrstaPrimanja;
    }

    public void setVrstaPrimanja(VrstaPrimanja vrstaPrimanja) {
        this.vrstaPrimanja = vrstaPrimanja;
    }
    

    

   
    
    
    
}
