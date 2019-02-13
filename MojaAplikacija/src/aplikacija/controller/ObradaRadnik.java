/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacija.controller;

import aplikacija.model.Radnik;
import aplikacija.utility.AplikacijaException;
import aplikacija.utility.Baza;
import java.math.BigDecimal;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Josip
 */
public class ObradaRadnik {
    
    private PreparedStatement izraz;
    private ResultSet rs;
    
    public List<Radnik> read(){
        java.util.List<Radnik> Radnici = new ArrayList<>();
        try {
            izraz = Baza.getInstance().getConnection().prepareStatement("select * from radnik");
            rs = izraz.executeQuery();
            Radnik r;
            while (rs.next()) {
                r = new Radnik();
                r.setId(rs.getInt("id"));
                r.setIme(rs.getString("ime"));
                r.setPrezime(rs.getString("prezime"));
                r.setSpol(rs.getString("spol"));
                r.setOib(rs.getBigDecimal("oib"));
                r.setMobitel(rs.getBigDecimal("mobitel"));
                r.setDatum_rodenja(rs.getDate("datum_rodenja"));
                r.setOsnovica_po_satu(rs.getBigDecimal("osnovica_po_satu"));
                r.setOpcina_prebivalista(rs.getString("opcina_prebivalista"));          
                Radnici.add(r);
            }
            rs.close();
            izraz.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Radnici;
       
    }
    
    public Radnik create(Radnik r) throws AplikacijaException{
        
        kontrola(r);
        try {
            
            izraz = Baza.getInstance().getConnection().prepareStatement("insert into radnik (oib,ime,prezime,spol,datum_rodenja,mobitel,osnovica_po_satu,opcina_prebivalista) "
                    + "values (?,?,?,?,?,?,?,?,)", Statement.RETURN_GENERATED_KEYS);
            izraz.setBigDecimal(1, r.getOib());
            izraz.setString(2, r.getIme());
            izraz.setString(3, r.getPrezime());
            izraz.setString(4, r.getSpol());
            izraz.setDate(5, r.getDatum_rodenja());
            izraz.setBigDecimal(6, r.getMobitel());
            izraz.setBigDecimal(7, r.getOsnovica_po_satu());
            izraz.setString(8, r.getOpcina_prebivalista());
            
            izraz.executeUpdate();
            rs = izraz.getGeneratedKeys();
            rs.next();
            r.setId(rs.getInt(1));
            
            rs.close();
            izraz.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }
    
    public boolean delete(Radnik r) {

        try {

            izraz = Baza.getInstance().getConnection().prepareStatement("delete from smjer where id=?");
            izraz.setInt(1, r.getId());

            return izraz.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean update(Radnik r) throws AplikacijaException{
        
         kontrola(r);
        
        try {
            izraz = Baza.getInstance().getConnection().prepareStatement(
                    "update radnik set oib=?, ime=?, prezime=?, spol=?,datum_rodenja=?,mobitel=?,osnovica_po_satu=?,opcina_prebivalista=? "
                    + " where id=?");
            izraz.setBigDecimal(1, r.getOib());
            izraz.setString(2, r.getIme());
            izraz.setString(3, r.getPrezime());
            izraz.setString(4, r.getSpol());
            izraz.setDate(5, r.getDatum_rodenja());
            izraz.setBigDecimal(6, r.getMobitel());
            izraz.setBigDecimal(7, r.getOsnovica_po_satu());
            izraz.setString(8, r.getOpcina_prebivalista());

            return izraz.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
    
    private void kontrola(Radnik r) throws AplikacijaException{
       if(r.getOib()==null){
            throw new AplikacijaException("Naziv je null, obavezan unos");
        }
        
        if(r.getIme().trim().length()==0){
            throw new AplikacijaException("Naziv je prazan, obavezan unos");
        }
        
        if(r.getPrezime().trim().length()==0){
            throw new AplikacijaException("Naziv je prazan, obavezan unos");
        }
        
        if(r.getSpol().length()>5){
            throw new AplikacijaException("Dužina spola veća od dopuštene");
        }
        
       
        
        if(r.getOsnovica_po_satu().compareTo(BigDecimal.ZERO)<0){
            throw  new AplikacijaException("Osnovica po satu mora biti pozitivan broj");
        }
        
        if(r.getOpcina_prebivalista().trim().length()==0){
            throw  new AplikacijaException("UOpćina prebivašita prazna,obavezan unos");
        }
    }
}
