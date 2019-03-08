/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class VrstaPrimanja extends Entitet implements Serializable {
    
    private String nazivVrstePrimanja;
    private BigDecimal koeficijent;

    public String getNazivVrstePrimanja() {
        return nazivVrstePrimanja;
    }

    public void setNazivVrstePrimanja(String nazivVrstePrimanja) {
        this.nazivVrstePrimanja = nazivVrstePrimanja;
    }
    
    public BigDecimal getKoeficijent() {
        return koeficijent;
    }

    public void setKoeficijent(BigDecimal koeficijent) {
        this.koeficijent = koeficijent;
    }
    
    
    
}
