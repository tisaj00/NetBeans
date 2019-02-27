/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Predavac;
import edunova.pomocno.EdunovaException;
import edunova.pomocno.HibernateUtil;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Profesor
 */
public class ObradaPredavac extends ObradaOsoba<Predavac>{
    
     public ObradaPredavac(){
         super();
     }
     
     public List<Predavac> getPredavaci(){
         return HibernateUtil.getSession().createQuery("from Predavac").list();
     }
     
     public Predavac save(Predavac p) throws EdunovaException{
         
         super.kontrola();
         kontrola();
         
         return dao.save(p);
     }
     
     public void obrisi(Predavac p) throws EdunovaException{
         
         if(!p.getGrupe().isEmpty()){
             throw new EdunovaException(
                     "Ne može se obrisati predavač jer predaje na grupama: " +
                             Arrays.toString(p.getGrupe().toArray())
             );
         }
         
         dao.delete(p);
     }
     
     protected void kontrola() throws EdunovaException{
        
     }
     
    
    
}
