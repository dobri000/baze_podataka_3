/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Adresa;
import domain.Ponuda;
import domain.Zaposleni;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobri
 */
public class DBBPonuda {
    public static void dodajPonudu(Ponuda ponuda) throws SQLException {
        String query = "INSERT INTO PONUDA(brPonude, datum, vremeDezuranja, sifraZaposlenog, sifraObjekta) VALUES(?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, ponuda.getBrPonude());
            ps.setDate(2, Date.valueOf(ponuda.getDatum()));
            ps.setString(3, ponuda.getVremeDezuranja());
            ps.setInt(4, ponuda.getZaposleni().getSifraZaposlenog());
            ps.setInt(5, ponuda.getSifraObjekta());
            ps.executeUpdate();
            
            connection.commit();
            ps.close();
            connection.close();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.close();
        }
    }
    
    public static List<Ponuda> vratiSvePonude() throws SQLException {
        List<Ponuda> ponude = new ArrayList<>();
        String query = "SELECT * FROM PONUDA p LEFT JOIN ZAPOSLENI z ON (p.sifraZaposlenog = z.sifraZaposlenog)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int brPonude = rs.getInt("brPonude");
                LocalDate date = rs.getDate("datum").toLocalDate();
                String vremeDezuranja = rs.getString("vremeDezuranja");
                int sifraZaposlenog = rs.getInt("sifraZaposlenog");
                String brojLK = rs.getString("brojLK");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                Zaposleni zaposleni = new Zaposleni(sifraZaposlenog, ime, prezime, brojLK);
                int sifraObjekta = rs.getInt("sifraObjekta");
                String PIB = rs.getString("PIB");
                Ponuda ponuda = new Ponuda(brPonude, date, vremeDezuranja, zaposleni, sifraObjekta, PIB);
                ponude.add(ponuda);
            }

            connection.commit();
            stat.close();
            connection.close();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            if (stat != null) {
                stat.close();
            }
            connection.close();
        }
        return ponude;
    }
    
    public static void obrisiPonudu(Ponuda ponuda) throws SQLException {
        String query = "DELETE FROM PONUDA WHERE brPonude = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, ponuda.getBrPonude()); 
            ps.executeUpdate();

            connection.commit();
            ps.close();
            connection.close();

        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.close();
        }

    }
    
    public static void azurirajPonuduBezPIBa(Ponuda ponuda) throws SQLException {
        String query = "UPDATE PONUDA "
                + "SET "
                + "datum = ?, "
                + "vremeDezuranja = ?, "
                + "sifraZaposlenog = ?, "
                + "sifraObjekta = ? "
                + "WHERE brPonude = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setDate(1, Date.valueOf(ponuda.getDatum()));
            ps.setString(2, ponuda.getVremeDezuranja());
            ps.setInt(3, ponuda.getZaposleni().getSifraZaposlenog());
            ps.setInt(4, ponuda.getSifraObjekta());
            ps.setInt(5, ponuda.getBrPonude());
            ps.executeUpdate();
            
            connection.commit();
            ps.close();
            connection.close();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.close();
        }
    }
    
    public static void azurirajPonuduSaPIBom(Ponuda ponuda) throws SQLException {
        String query = "UPDATE PONUDA "
                + "SET "
                + "datum = ?, "
                + "vremeDezuranja = ?, "
                + "sifraZaposlenog = ?, "
                + "sifraObjekta = ?, "
                + "PIB = ? "
                + "WHERE brPonude = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setDate(1, Date.valueOf(ponuda.getDatum()));
            ps.setString(2, ponuda.getVremeDezuranja());
            ps.setInt(3, ponuda.getZaposleni().getSifraZaposlenog());
            ps.setInt(4, ponuda.getSifraObjekta());
            ps.setString(5, ponuda.getPIB());
            ps.setInt(6, ponuda.getBrPonude());
            ps.executeUpdate();
            
            connection.commit();
            ps.close();
            connection.close();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.close();
        }
    }
}
