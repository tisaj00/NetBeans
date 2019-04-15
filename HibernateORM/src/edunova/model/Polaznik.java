package edunova.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Polaznik extends Osoba implements Serializable{
    
    private String brojUgovora;

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }


    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
            
    
    
    
    
}
