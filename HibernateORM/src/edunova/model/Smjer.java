
package edunova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Smjer extends Entitet implements Serializable {
    

    private String naziv;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private int trajanje;
    private boolean verificiran;
    
    @OneToMany(mappedBy = "smjer")
    private List<Grupa> grupe=new ArrayList<>();

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }

    public boolean isVerificiran() {
        return verificiran;
    }

    public void setVerificiran(boolean verificiran) {
        this.verificiran = verificiran;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    @Override
    public String toString() {
       return getNaziv();
    }
    
    /*
    1. način @ edunova.view.Grupe:175 cmbSmjerovi.setSelectedItem(g.getSmjer());
   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.naziv);
        hash = 47 * hash + Objects.hashCode(this.cijena);
        hash = 47 * hash + Objects.hashCode(this.upisnina);
        hash = 47 * hash + this.trajanje;
        hash = 47 * hash + (this.verificiran ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.grupe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Smjer other = (Smjer) obj;
        if (this.trajanje != other.trajanje) {
            return false;
        }
        if (this.verificiran != other.verificiran) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.cijena, other.cijena)) {
            return false;
        }
        if (!Objects.equals(this.upisnina, other.upisnina)) {
            return false;
        }
        if (!Objects.equals(this.grupe, other.grupe)) {
            return false;
        }
        return true;
    }

   
     */
    
    /**
     * 2. način ne podrazumjeva mjenjanje model klasa
     */
    
}
