/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Radnik;
import edunova.pomocno.AplikacijaException;

/**
 *
 * @author Josip
 */
public class ObradaRadnik<T extends Radnik> extends Obrada<T>{
    
    public ObradaRadnik(){
            super();
    };
    
    protected void kontrola() throws AplikacijaException{
    
    
    }
    
}
