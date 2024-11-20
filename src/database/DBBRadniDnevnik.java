/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.RadniDnevnik;
import domain.RadniSati;
import enumeration.Mesec;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author dobri
 */
public class DBBRadniDnevnik {

    public static List<RadniDnevnik> vratiSveRadneDnevnike(String partition) throws SQLException {
        List<RadniDnevnik> radniDnevnici = new ArrayList<>();
        String query = "SELECT r.sifraRadnogDnevnika, r.sifraZaposlenog, r.sifraKontrolera, r.mesec, r.godina, r.ukupniRadniSati.get_standardni_sati(), r.ukupniRadniSati.get_prekovremeni_sati()"
                + " FROM RADNIDNEVNIK PARTITION(" + partition + ") r";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int sifraRadnogDnevnika = rs.getInt(1);
                int sifraZaposlenog = rs.getInt(2);
                int sifraKontrolera = rs.getInt(3);
                Mesec mesec = Mesec.valueOf(rs.getString(4));
                int godina = rs.getInt(5);
                int standardniSati = rs.getInt(6);
                int prekovremeniSati = rs.getInt(7);
                RadniSati radniSati = new RadniSati(standardniSati, prekovremeniSati);
                RadniDnevnik radniDnevnik = new RadniDnevnik(sifraRadnogDnevnika, sifraZaposlenog, sifraKontrolera, mesec, godina, radniSati);
                radniDnevnici.add(radniDnevnik);
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

        return radniDnevnici;
    }
    
    public static void dodajRadniDnevnik(RadniDnevnik radniDnevnik) throws SQLException {
        String query = "INSERT INTO RADNIDNEVNIK(sifraRadnogDnevnika, sifraZaposlenog, sifraKontrolera, mesec, godina) VALUES(?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, radniDnevnik.getSifraRadnogDnevnika());
            ps.setInt(2, radniDnevnik.getSifraZaposlenog());
            ps.setInt(3, radniDnevnik.getSifraKontrolera());
            ps.setString(4, String.valueOf(radniDnevnik.getMesec()));
            ps.setInt(5, radniDnevnik.getGodina());
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
    
    public static void azurirajRadniDnevnikBezRadnihSati(RadniDnevnik radniDnevnik) throws SQLException {
        String query = "UPDATE RADNIDNEVNIK "
                + "SET sifraZaposlenog = ?, "
                + "sifraKontrolera = ?, "
                + "mesec = ?, "
                + "godina = ? "
                + "WHERE sifraRadnogDnevnika = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(5, radniDnevnik.getSifraRadnogDnevnika());
            ps.setInt(1, radniDnevnik.getSifraZaposlenog());
            ps.setInt(2, radniDnevnik.getSifraKontrolera());
            ps.setString(3, String.valueOf(radniDnevnik.getMesec()));
            ps.setInt(4, radniDnevnik.getGodina());
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
    
    public static void azurirajRadniDnevnikSaRadnimSatima(RadniDnevnik radniDnevnik) throws SQLException {
        String query = "UPDATE RADNIDNEVNIK "
                + "SET sifraZaposlenog = ?, "
                + "sifraKontrolera = ?, "
                + "mesec = ?, "
                + "godina = ?, "
                + "ukupniRadniSati = radni_sati(?,?) "
                + "WHERE sifraRadnogDnevnika = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(7, radniDnevnik.getSifraRadnogDnevnika());
            ps.setInt(1, radniDnevnik.getSifraZaposlenog());
            ps.setInt(2, radniDnevnik.getSifraKontrolera());
            ps.setString(3, String.valueOf(radniDnevnik.getMesec()));
            ps.setInt(4, radniDnevnik.getGodina());
            ps.setInt(5, radniDnevnik.getRadniSati().getStandardniSati());
            ps.setInt(6, radniDnevnik.getRadniSati().getPrekovremeniSati());
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
    
    public static void obrisiRadniDnevnik(RadniDnevnik radniDnevnik) throws SQLException {
        String query1 = "DELETE FROM ANGAZOVANJE "
                + "WHERE sifraRadnogDnevnika = ?";
        String query2 = "DELETE FROM RADNIDNEVNIK "
                + "WHERE sifraRadnogDnevnika = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query1);
            ps.setInt(1, radniDnevnik.getSifraRadnogDnevnika());
            ps.executeUpdate();
            
            ps = connection.prepareStatement(query2);
            ps.setInt(1, radniDnevnik.getSifraRadnogDnevnika());
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
