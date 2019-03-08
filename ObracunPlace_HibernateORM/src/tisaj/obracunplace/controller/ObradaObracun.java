/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.controller;

import tisaj.obracunplace.model.Obracun;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import tisaj.obracunplace.pomocno.HibernateUtil;
import tisaj.obracunplace.pomocno.ObradaSucelje;
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
    
    public Obracun save(Obracun ob) throws ObracunPlaceException{
         
         kontrola(ob);
     
         
         return dao.save(ob);
     }
    
     public void obrisi(Obracun ob) throws ObracunPlaceException{
       /*  
         if(ob.get().size()>0){
             throw new ObracunPlaceException("Obračun se ne može obrisati jer ima radnika,isplatu i vrstu primanja");
         }

      */   
         dao.delete(ob);
     }
     
     public void kontrola(Obracun ob) throws ObracunPlaceException{
     
         if(ob.getKolicinaSati()<0){
             throw new ObracunPlaceException("Količina sati mora bit pozitivan broj");
         }
         
         
     }
    
}
