/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.pomocno;

import java.util.List;

/**
 *
 * @author Josip
 */
public interface ObradaSucelje<T> {
    
    public List<T> getLista();
    public void kontrola(T t) throws ObracunPlaceException;
    public T save(T t) throws ObracunPlaceException;
    public void obrisi(T t) throws ObracunPlaceException;
    
            
    
    
    
}
