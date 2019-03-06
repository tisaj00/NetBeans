/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Isplata;
import edunova.model.Radnik;
import edunova.pomocno.AplikacijaException;
import edunova.pomocno.HibernateUtil;
import edunova.pomocno.ObradaSucelje;
import edunova.pomocno.Pomocno;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.validator.routines.IBANValidator;

/**
 *
 * @author Josip
 */
public class ObradaIsplata extends Obrada<Isplata> implements ObradaSucelje<Isplata>{
    
     public ObradaIsplata(){
       super();
     }
       
    public List<Isplata> getLista(){
         return HibernateUtil.getSession().createQuery("from Radnik").list();
    }
    
    public Isplata save(Isplata i) throws AplikacijaException{
         
         super.kontrola(i);
         kontrola(i);
         
         return dao.save(i);
     }
    public void obrisi(Isplata i) throws AplikacijaException{
         
         if(i.getRadnik().size()>0){
             throw new AplikacijaException(
                     "Ne može se obrisati predavač jer predaje na grupama: " + Arrays.toString(i.getRadnik().toString())
             );
         }
         
         dao.delete(i);
     }
     
     public void kontrola(Isplata i) throws AplikacijaException{
        
        if(i.getDatum()==null){
            throw new AplikacijaException("Datum nije definiran");
        }
        if(i.getNazivIsplate().trim().isEmpty()){
            throw new AplikacijaException("Naziv isplate nije definiran");
        }
        if(i.getNazivIsplate()==null){
            throw new AplikacijaException("Obavezan unos naziv isplate");
        }
        if(!IBANValidator.getInstance().isValid(i.getRacunRadnika())){
            throw new AplikacijaException("Račun radnika nije ispavan");
        }
                 
     }
     
}
