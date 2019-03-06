/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.pomocno;

import java.util.List;

/**
 *
 * @author Josip
 */
public interface ObradaSucelje<T> {
    
    public List<T> getLista();
    public void kontrola(T t) throws AplikacijaException;
    public T save(T t) throws AplikacijaException;
    public void obrisi(T t) throws AplikacijaException;
    
            
    
    
    
}
