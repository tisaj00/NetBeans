/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Isplata;
import edunova.model.Obracun;
import edunova.model.Radnik;
import edunova.pomocno.AplikacijaException;
import edunova.pomocno.HibernateUtil;
import edunova.pomocno.ObradaSucelje;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Josip
 */
public class ObradaObracun extends Obrada<Obracun> implements ObradaSucelje<Obracun>{
    
    public ObradaObracun(){
        super();
    }
    
    public List<Obracun> getLista(){
         return HibernateUtil.getSession().createQuery("from Obracun").list();
    }
    
    public Obracun save(Obracun ob) throws AplikacijaException{
         
         super.kontrola(ob);
         kontrola(ob);
         
         return dao.save(ob);
     }
    
     public void obrisi(Obracun ob) throws AplikacijaException{
         
         if(!i.getRadnik().isEmpty()){
             throw new AplikacijaException(
                     "Ne može se obrisati predavač jer predaje na grupama: " + Arrays.toString(i.getRadnik().toString())
             );
         }
         
         dao.delete(ob);
     }
     
     public void kontrola(Obracun ob) throws AplikacijaException{
     
         if(ob.getKolicinaSati()<0){
             throw new AplikacijaException("Količina sati mora bit pozitivan broj");
         }
         
         
     }
    
}
