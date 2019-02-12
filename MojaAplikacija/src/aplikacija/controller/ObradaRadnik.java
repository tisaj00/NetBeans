/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacija.controller;

import aplikacija.model.Radnik;
import aplikacija.utility.Baza;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
    
}
