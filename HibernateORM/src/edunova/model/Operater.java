/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Operater extends Entitet{

    private String email;
    
    @Column(columnDefinition = "char(60)")
    //@Transient - riješiti
    //$2a$10$wL5pTXnYf1DWsbQqCQ3fteiuOzBZLiDZcTDty3aDyrgJ8nnIqZLuW
    private String lozinka;
    
    private String ime;
    
    private String prezime;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
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
    
    
    
}
