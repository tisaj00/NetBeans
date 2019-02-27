/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Osoba;
import edunova.pomocno.EdunovaException;

/**
 *
 * @author Profesor
 * @param <T>
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{
    
    public ObradaOsoba(){
        super();
    }
    
    protected void kontrola () throws EdunovaException{
        
    }
    
}
