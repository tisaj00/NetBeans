/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.VrstaPrimanja;
import edunova.pomocno.AplikacijaException;
import edunova.pomocno.HibernateUtil;
import edunova.pomocno.ObradaSucelje;
import java.math.BigDecimal;
import java.util.Arrays;
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
         return HibernateUtil.getSession().createQuery("from VrstaPrimanja").list();
    }
    
    public VrstaPrimanja save(VrstaPrimanja vp) throws AplikacijaException{
         
         super.kontrola(vp);
         kontrola(vp);
         
         return dao.save(vp);
     }
    
     public void obrisi(VrstaPrimanja vp) throws AplikacijaException{
         
         if(!vp.getRadnik().isEmpty()){
             throw new AplikacijaException(
                     "Ne može se obrisati predavač jer predaje na grupama: " + Arrays.toString(i.getRadnik().toString())
             );
         }
         
         dao.delete(vp);
     }
     
     public void kontrola(VrstaPrimanja vp) throws AplikacijaException{
     
         if(vp.getVrijednost().trim().isEmpty()){
             throw new AplikacijaException("Vrijednost nije definirana");
         }
         if(vp.getVrijednost()==null){
             throw new AplikacijaException("Obevazan unos vrijednosti");
         }
         if(vp.getKoeficijent().compareTo(BigDecimal.ZERO)<=0){
             throw new AplikacijaException("Koeficijent mora bit pozitivan broj");
         }
         
         
     }
    
}
