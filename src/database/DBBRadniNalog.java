/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.RadniNalog;
import domain.RadniNalogDetaljno;
import domain.RadniNalogOsnovno;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobri
 */
public class DBBRadniNalog {
    
    public static List<RadniNalog> vratiSveRadneNaloge() throws SQLException {
        List<RadniNalog> nalozi = new ArrayList<>();
        String query = "SELECT * FROM RADNINALOG_VIEW";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int brojRadnogNaloga = rs.getInt(1);
                LocalDate rokZaRealizaciju = rs.getDate(2).toLocalDate();
                String opisSistema = rs.getString(3);
                String obavljenRad = rs.getString(4);
                LocalDate datumOtvaranjaRN = rs.getDate(5).toLocalDate();
                LocalDate datumObavljanjaKontrole = rs.getDate(6).toLocalDate();
                int brPonude = rs.getInt(7);
                int sifraKontakta = rs.getInt(8);
                int sifraZaposlenog = rs.getInt(9);
                int sifraGrada = rs.getInt(10);
                RadniNalog nalog = new RadniNalog(brojRadnogNaloga, rokZaRealizaciju, opisSistema, obavljenRad, datumOtvaranjaRN, datumObavljanjaKontrole, brPonude, sifraKontakta, sifraZaposlenog, sifraGrada);
                nalozi.add(nalog);
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

        return nalozi;
    }
    
    public static List<RadniNalogOsnovno> vratiSveRadneNalogeOsnovno() throws SQLException {
        List<RadniNalogOsnovno> nalozi = new ArrayList<>();
        String query = "SELECT * FROM RADNINALOG_OSNOVNO";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int brojRadnogNaloga = rs.getInt(1);
                LocalDate datumOtvaranjaRN = rs.getDate(2).toLocalDate();
                int brPonude = rs.getInt(3);
                int sifraZaposlenog = rs.getInt(4);
                RadniNalogOsnovno nalog = new RadniNalogOsnovno(brojRadnogNaloga, datumOtvaranjaRN, brPonude, sifraZaposlenog);
                nalozi.add(nalog);
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

        return nalozi;
    }
    
    public static List<RadniNalogDetaljno> vratiSveRadneNalogeDetaljno() throws SQLException {
        List<RadniNalogDetaljno> nalozi = new ArrayList<>();
        String query = "SELECT * FROM RADNINALOG_DETALJNO";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int brojRadnogNaloga = rs.getInt(1);
                LocalDate rokZaRealizaciju = rs.getDate(2).toLocalDate();
                String opisSistema = rs.getString(3);
                String obavljenRad = rs.getString(4);
                LocalDate datumObavljanjaKontrole = rs.getDate(5).toLocalDate();
                int sifraKontakta = rs.getInt(6);
                int sifraGrada = rs.getInt(7);
                RadniNalogDetaljno nalog = new RadniNalogDetaljno(brojRadnogNaloga, rokZaRealizaciju, opisSistema, obavljenRad, datumObavljanjaKontrole, sifraKontakta, sifraGrada);
                nalozi.add(nalog);
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

        return nalozi;
    }
    
    public static void dodajRadniNalogOsnovno(RadniNalogOsnovno nalog) throws SQLException {
        String query = "INSERT INTO RADNINALOG_OSNOVNO VALUES(?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, nalog.getBrojRadnogNaloga());
            ps.setDate(2, Date.valueOf(nalog.getDatumOtvaranjaRN()));
            ps.setInt(3, nalog.getBrPonude());
            ps.setInt(4, nalog.getSifraZaposlenog());
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
    
    public static void dodajRadniNalogDetaljno(RadniNalogDetaljno nalog) throws SQLException {
        String query = "INSERT INTO RADNINALOG_DETALJNO VALUES(?,?,?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, nalog.getBrojRadnogNaloga());
            ps.setDate(2, Date.valueOf(nalog.getRokZaRealizaciju()));
            ps.setString(3, nalog.getOpisSistema());
            ps.setString(4, nalog.getObavljenRad());
            ps.setDate(5, Date.valueOf(nalog.getDatumObavljanjaKontrole()));
            ps.setInt(6, nalog.getSifraKontakta());
            ps.setInt(7, nalog.getSifraGrada());
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
    
    public static void dodajRadniNalog(RadniNalog nalog) throws SQLException {
        String query = "INSERT INTO RADNINALOG_VIEW VALUES(?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, nalog.getBrojRadnogNaloga());
            ps.setDate(2, Date.valueOf(nalog.getRokZaRealizaciju()));
            ps.setString(3, nalog.getOpisSistema());
            ps.setString(4, nalog.getObavljenRad());
            ps.setDate(5, Date.valueOf(nalog.getDatumOtvaranjaRN()));
            ps.setDate(6, Date.valueOf(nalog.getDatumObavljanjaKontrole()));
            ps.setInt(7, nalog.getBrPonude());
            ps.setInt(8, nalog.getSifraKontakta());
            ps.setInt(9, nalog.getSifraZaposlenog());
            ps.setInt(10, nalog.getSifraGrada());
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
    
    public static void azurirajRadniNalogOsnovno(RadniNalogOsnovno nalog) throws SQLException {
        String query = "UPDATE RADNINALOG_OSNOVNO "
                + "SET datumOtvaranjaRN = ?, "
                + "brPonude = ?, "
                + "sifraZaposlenog = ? "
                + "WHERE brRadnogNaloga = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(4, nalog.getBrojRadnogNaloga());
            ps.setDate(1, Date.valueOf(nalog.getDatumOtvaranjaRN()));
            ps.setInt(2, nalog.getBrPonude());
            ps.setInt(3, nalog.getSifraZaposlenog());
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
    
    public static void azurirajRadniNalogDetaljno(RadniNalogDetaljno nalog) throws SQLException {
        String query = "UPDATE RADNINALOG_DETALJNO "
                + "SET rokZaRealizaciju = ?, "
                + "opisSistema = ?, "
                + "obavljenRad = ?, "
                + "datumObavljanjaKontrole = ?, "
                + "sifraKontakta = ?, "
                + "sifraGrada = ? "
                + "WHERE brRadnogNaloga = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(7, nalog.getBrojRadnogNaloga());
            ps.setDate(1, Date.valueOf(nalog.getRokZaRealizaciju()));
            ps.setString(2, nalog.getOpisSistema());
            ps.setString(3, nalog.getObavljenRad());
            ps.setDate(4, Date.valueOf(nalog.getDatumObavljanjaKontrole()));
            ps.setInt(5, nalog.getSifraKontakta());
            ps.setInt(6, nalog.getSifraGrada());
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
    
    public static void azurirajRadniNalog(RadniNalog nalog) throws SQLException {
        String query = "UPDATE RADNINALOG_VIEW "
                + "SET ROK_ZA_REALIZACIJU = ?, "
                + "OPIS_SISTEMA = ?, "
                + "OBAVLJEN_RAD = ?, "
                + "DATUM_OTVARANJA_RN = ?, "
                + "DATUM_OBAVLJANJA_KONTROLE = ?, "
                + "BR_PONUDE = ?, "
                + "SIFRA_KONTAKTA = ?, "
                + "SIFRA_ZAPOSLENOG = ?, "
                + "SIFRA_GRADA = ? "
                + "WHERE BR_RADNOG_NALOGA = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(10, nalog.getBrojRadnogNaloga());
            ps.setDate(1, Date.valueOf(nalog.getRokZaRealizaciju()));
            ps.setString(2, nalog.getOpisSistema());
            ps.setString(3, nalog.getObavljenRad());
            ps.setDate(4, Date.valueOf(nalog.getDatumOtvaranjaRN()));
            ps.setDate(5, Date.valueOf(nalog.getDatumObavljanjaKontrole()));
            ps.setInt(6, nalog.getBrPonude());
            ps.setInt(7, nalog.getSifraKontakta());
            ps.setInt(8, nalog.getSifraZaposlenog());
            ps.setInt(9, nalog.getSifraGrada());
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
    
    public static void obrisiRadniNalogOsnovno(RadniNalogOsnovno nalog) throws SQLException {
        String query = "DELETE FROM RADNINALOG_OSNOVNO "
                + "WHERE brRadnogNaloga = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, nalog.getBrojRadnogNaloga());
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
    
    public static void obrisiRadniNalogDetaljno(RadniNalogDetaljno nalog) throws SQLException {
        String query = "DELETE FROM RADNINALOG_DETALJNO "
                + "WHERE brRadnogNaloga = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, nalog.getBrojRadnogNaloga());
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
    
    public static void obrisiRadniNalog(RadniNalog nalog) throws SQLException {
        String query = "DELETE FROM RADNINALOG_VIEW "
                + "WHERE BR_RADNOG_NALOGA = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, nalog.getBrojRadnogNaloga());
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
