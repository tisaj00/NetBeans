/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.pomocno;

/**
 *
 * @author Josip
 */
public class AplikacijaException extends Exception{
    
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public AplikacijaException(String poruka){
        super(poruka);
    }
    
    
}
