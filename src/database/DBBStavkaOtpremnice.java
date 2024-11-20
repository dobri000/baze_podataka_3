/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Otpremnica;
import domain.StavkaOtpremnice;
import enumeration.JedinicaMere;
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
public class DBBStavkaOtpremnice {
    
    public static void dodajStavkuOtpremnice(StavkaOtpremnice stavka) throws SQLException {
        String query = "INSERT INTO STAVKAOTPREMNICE(brojOtpremnice, rbStavke, oznaka, kolicina, nazivJM) VALUES(?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, stavka.getBrojOtpremnice());
            ps.setInt(2, stavka.getRbStavke());
            ps.setInt(3, stavka.getOznaka());
            ps.setDouble(4, stavka.getKolicina());
            ps.setString(5, String.valueOf(stavka.getNazivJM()));
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
    
    public static List<StavkaOtpremnice> vratiSveStavkeOtpremnice(Otpremnica otpremnica) throws SQLException {
        List<StavkaOtpremnice> stavke = new ArrayList<>();
        String query = "SELECT * FROM STAVKAOTPREMNICE "
                + "WHERE brojOtpremnice = " + otpremnica.getBrojOtpremnice();
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int brojOtpremnice = rs.getInt(1);
                int rbStavke = rs.getInt(2);
                int oznaka = rs.getInt(3);
                double kolicina = rs.getDouble(5);
                JedinicaMere nazivJM = JedinicaMere.valueOf(rs.getString(4));
                StavkaOtpremnice stavka = new StavkaOtpremnice(brojOtpremnice, rbStavke, oznaka, kolicina, nazivJM);
                stavke.add(stavka);
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
        return stavke;
    }
    
    public static void azurirajStavkuOtpremnice(StavkaOtpremnice stavka) throws SQLException {
        String query = "UPDATE STAVKAOTPREMNICE "
                + "SET "
                + "oznaka = ?, "
                + "kolicina = ?, "
                + "nazivJM = ? "
                + "WHERE brojOtpremnice = ? AND rbStavke = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, stavka.getOznaka());
            ps.setDouble(2, stavka.getKolicina());
            ps.setString(3, String.valueOf(stavka.getNazivJM()));
            ps.setInt(4, stavka.getBrojOtpremnice());
            ps.setInt(5, stavka.getRbStavke());
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
    
    public static void obrisiStavkuOtpremnice(StavkaOtpremnice stavka) throws SQLException {
        String query = "DELETE FROM STAVKAOTPREMNICE "
                + "WHERE brojOtpremnice = ? AND rbStavke = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, stavka.getBrojOtpremnice());
            ps.setInt(2, stavka.getRbStavke());
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
