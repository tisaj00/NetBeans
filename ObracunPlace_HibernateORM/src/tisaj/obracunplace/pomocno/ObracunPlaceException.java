/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.pomocno;

/**
 *
 * @author Josip
 */
public class ObracunPlaceException extends Exception{
    
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public ObracunPlaceException(String poruka){
        super(poruka);
    }
    
    
}
