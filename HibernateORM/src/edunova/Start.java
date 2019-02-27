package edunova;

// domaća zadaća:

import edunova.controller.DAO;
import edunova.controller.ObradaOsoba;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.pomocno.EdunovaException;
import edunova.pomocno.HibernateUtil;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        
        ObradaSmjer os = new ObradaSmjer();
       
        Smjer novi = new Smjer();
        novi.setNaziv("Java");
        novi.setCijena(new BigDecimal(200));
        
        try {
            os.spremi(novi);
        } catch (EdunovaException ex) {
            System.out.println(ex.getMessage());
        }
        
        for(Smjer s : os.getSmjerovi()){
            System.out.println(s.getNaziv());
        }
        
        
        
    }
    
}
