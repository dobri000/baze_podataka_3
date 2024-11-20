/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Otpremnica;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dobri
 */
public class DBBOtrpemnica {
    
    public static void dodajOtpremnicu(Otpremnica otpremnica) throws SQLException {
        String query = "INSERT INTO OTPREMNICA(brojOtpremnice, datum, sifraZaposlenog, sifraKontakta, sifraPrevoznika) VALUES(?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, otpremnica.getBrojOtpremnice());
            ps.setDate(2, Date.valueOf(otpremnica.getDate()));
            ps.setInt(3, otpremnica.getSifraZaposlenog());
            ps.setInt(4, otpremnica.getSifraKontakta());
            ps.setInt(5, otpremnica.getSifraPrevoznika());
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
    
    public static List<Otpremnica> vratiSveOtpremnice() throws SQLException {
        List<Otpremnica> otpremnice = new ArrayList<>();
        String query = "SELECT * FROM OTPREMNICA";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int brojOtpremnice = rs.getInt(1);
                LocalDate datum = rs.getDate(2).toLocalDate();
                int sifraZaposlenog = rs.getInt(3);
                int sifraKontakta = rs.getInt(4);
                int sifraPrevoznika = rs.getInt(5);
                Otpremnica otpremnica = new Otpremnica(brojOtpremnice, datum, sifraZaposlenog, sifraKontakta, sifraPrevoznika);
                otpremnice.add(otpremnica);
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
        return otpremnice;
    }
    
    public static void azurirajOtpremnicu(Otpremnica otpremnica) throws SQLException {
        String query = "UPDATE OTPREMNICA "
                + "SET "
                + "datum = ?, "
                + "sifraZaposlenog = ?, "
                + "sifraKontakta = ?, "
                + "sifraPrevoznika = ? "
                + "WHERE brojOtpremnice = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setDate(1, Date.valueOf(otpremnica.getDate()));
            ps.setInt(2, otpremnica.getSifraZaposlenog());
            ps.setInt(3, otpremnica.getSifraKontakta());
            ps.setInt(4, otpremnica.getSifraPrevoznika());
            ps.setInt(5, otpremnica.getBrojOtpremnice());
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
    
    public static void obrisiOtpremnicu(Otpremnica otpremnica) throws SQLException {
        String query = "DELETE FROM OTPREMNICA "
                + "WHERE brojOtpremnice = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, otpremnica.getBrojOtpremnice());
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
