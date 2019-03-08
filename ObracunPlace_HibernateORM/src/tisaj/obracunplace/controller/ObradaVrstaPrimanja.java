/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.controller;

import tisaj.obracunplace.model.VrstaPrimanja;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import tisaj.obracunplace.pomocno.HibernateUtil;
import tisaj.obracunplace.pomocno.ObradaSucelje;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Josip
 */
public class ObradaVrstaPrimanja extends Obrada<VrstaPrimanja> implements ObradaSucelje<VrstaPrimanja>{
    
    public ObradaVrstaPrimanja(){
        super();
    }
    
    public List<VrstaPrimanja> getLista(){
         return HibernateUtil.getSession().createQuery("from vrstaprimanja").list();
    }
    
    public VrstaPrimanja save(VrstaPrimanja vp) throws ObracunPlaceException{
         
        
         kontrola(vp);
         
         return dao.save(vp);
     }
    
     public void obrisi(VrstaPrimanja vp) throws ObracunPlaceException{
            
         dao.delete(vp);
     }
     
     public void kontrola(VrstaPrimanja vp) throws ObracunPlaceException{
     
         if(vp.getNazivVrstePrimanja().trim().isEmpty()){
             throw new ObracunPlaceException("Vrijednost nije definirana");
         }
         if(vp.getNazivVrstePrimanja()==null){
             throw new ObracunPlaceException("Obevazan unos vrijednosti");
         }
         if(vp.getKoeficijent().compareTo(BigDecimal.ZERO)<=0){
             throw new ObracunPlaceException("Koeficijent mora bit pozitivan broj");
         }
         
         
     }
    
}
