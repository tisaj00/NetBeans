/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Radnik;
import edunova.pomocno.AplikacijaException;
import edunova.pomocno.Pomocno;

/**
 *
 * @author Josip
 * @param <T>
 */
public class ObradaRadnik<T extends Radnik> extends Obrada<T>{
    
    public ObradaRadnik(){
        super();
    }
     
    public void kontrola(Radnik r) throws AplikacijaException{
        if(r.getIme()==null){
            throw new AplikacijaException("Ime nije definirano");
        }
        if(r.getIme().trim().isEmpty()){
            throw new AplikacijaException("Ime nije uneseno");
        }
        if(r.getPrezime()==null){
            throw new AplikacijaException("Prezime nije definirano");
        }
        if(r.getPrezime().trim().isEmpty()){
            throw new AplikacijaException("Prezime nije uneseno");
        }
        
        if(!Pomocno.checkOIB(r.getOib())){
            throw new AplikacijaException("Oib je neispravan");
        }
        
        if(r.getMobitel()==null){
            throw new AplikacijaException("Mobitel nije definiran");
        }
        if(r.getMobitel().trim().isEmpty()){
            throw new AplikacijaException("Mobitel nije unesen");
        }
        if(r.getSpol()==null){
            throw new AplikacijaException("Spol nije definiran");
        }
        if(r.getSpol().trim().isEmpty()){
            throw new AplikacijaException("Spol nije unesen");
        }
        if(r.getDatumRodenja()==null){
            throw new AplikacijaException("Datum rođenja nije definiran");
        }
        if(r.getOsnovicaPoSatu()==null){
            throw new AplikacijaException("Osnovica po satu nije definirana");
        }
        if(r.getOsnovicaPoSatu().trim().isEmpty()){
            throw new AplikacijaException("Osnovica po satu nije unesena");
        }
        if(r.getOpcinaPrebivaliste()==null){
            throw new AplikacijaException("Općina prebivališta nije definirana");
        }
        if(r.getOsnovicaPoSatu().trim().isEmpty()){
            throw new AplikacijaException("Općina prebivališta nije unesena");
        }
        
    }
    
}
