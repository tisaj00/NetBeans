/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.ObracunPlace.model;

import java.math.BigDecimal;

/**
 *
 * @author Josip
 */
public class Vrsta_Primanja {
    
    private int id;
    private String vrijednost;
    private BigDecimal koeficijent;

    public int getId() {
        return id;
}

    public void setId(int id) {
        this.id = id;
    }

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

    public BigDecimal getKoeficijent() {
        return koeficijent;
    }

    public void setKoeficijent(BigDecimal koeficijent) {
        this.koeficijent = koeficijent;
    }

    @Override
    public String toString() {
        return "Vrsta_Primanja{" + "id=" + id + ", vrijednost=" + vrijednost + ", koeficijent=" + koeficijent + '}';
    }
    
    
    
    
    
}
