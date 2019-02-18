/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.ObracunPlace.controller;

import tisaj.ObracunPlace.model.Radnik;
import tisaj.ObracunPlace.utility.AplikacijaException;
import tisaj.ObracunPlace.utility.Baza;
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

    public List<Radnik> read() {
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
                r.setOib(rs.getString("oib"));
                r.setMobitel(rs.getString("mobitel"));
                
                try {
                    r.setDatumRodenja(rs.getDate("datum_rodenja"));
                } catch (java.sql.SQLException e) {
                    r.setDatumRodenja(null);
                }
                try {
                    r.setOsnovicaPoSatu(rs.getString("osnovica_po_satu"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                r.setOpcinaPrebivalista(rs.getString("opcina_prebivalista"));
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

    public Radnik create(Radnik r) throws AplikacijaException {

        kontrola(r);
        
        try {

            izraz = Baza.getInstance().getConnection().prepareStatement("insert into radnik (oib,ime,prezime,spol,datum_rodenja,mobitel,osnovica_po_satu,opcina_prebivalista) "
                    + " values (?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            izraz.setString(1, r.getOib());
            izraz.setString(2, r.getIme());
            izraz.setString(3, r.getPrezime());
            izraz.setString(4, r.getSpol());
            try {
                izraz.setDate(5, new java.sql.Date(r.getDatumRodenja().getTime()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
                     
            izraz.setString(6, r.getMobitel());
            izraz.setString(7, r.getOsnovicaPoSatu());
            izraz.setString(8, r.getOpcinaPrebivalista());

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

            izraz = Baza.getInstance().getConnection().prepareStatement("delete from radnik where id=?");
            izraz.setInt(1, r.getId());

            return izraz.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean update(Radnik r) throws AplikacijaException {

        kontrola(r);

        try {
            izraz = Baza.getInstance().getConnection().prepareStatement(
                    "update radnik set oib=?, ime=?, prezime=?, spol=?,datum_rodenja=?,mobitel=?,osnovica_po_satu=?,opcina_prebivalista=? "
                    + " where id=?");
            izraz.setString(1, r.getOib());
            izraz.setString(2, r.getIme());
            izraz.setString(3, r.getPrezime());
            izraz.setString(4, r.getSpol());
            try {
                  izraz.setDate(5, new java.sql.Date(r.getDatumRodenja().getTime()));
            } catch (Exception e) {
                e.printStackTrace();
            }
          
            izraz.setString(6, r.getMobitel());
            izraz.setString(7, r.getOsnovicaPoSatu());
            izraz.setString(8, r.getOpcinaPrebivalista());
            izraz.setInt(9, r.getId());
            return izraz.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void kontrola(Radnik r) throws AplikacijaException {
        if (r.getOib() == null) {
            throw new AplikacijaException("Oib je null, obavezan unos");
        }

        if (r.getIme().trim().length() == 0) {
            throw new AplikacijaException("Ime je prazno, obavezan unos");
        }

        if (r.getPrezime().trim().length() == 0) {
            throw new AplikacijaException("Prezime je prazno, obavezan unos");
        }

        

        
    }
}
