/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Adresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobri
 */
public class DBBAdresa {
    public static void dodajAdresuBezNazivaGrada(Adresa adresa) throws SQLException {
        String query = "INSERT INTO ADRESA(sifraGrada, sifraAdrese, ulica, broj) VALUES(?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, adresa.getSifraGrada());
            ps.setInt(2, adresa.getSifraAdrese());
            ps.setString(3, adresa.getUlica());
            ps.setInt(4, adresa.getBroj());
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
    
    public static List<Adresa> vratiSveAdrese() throws SQLException {
        List<Adresa> adrese = new ArrayList<>();
        String query = "SELECT * FROM ADRESA";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int sifraGrada = rs.getInt("sifraGrada");
                int sifraAdrese = rs.getInt("sifraAdrese");
                String ulica = rs.getString("ulica");
                int broj = rs.getInt("broj");
                String nazivGrada = rs.getString("nazivGrada");
                Adresa adresa = new Adresa(sifraAdrese, sifraGrada, ulica, broj, nazivGrada);
                adrese.add(adresa);
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
        return adrese;
    }
    
    public static void obrisiAdresu(Adresa adresa) throws SQLException {
        String query = "DELETE FROM ADRESA WHERE sifraGrada = ? AND sifraAdrese = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, adresa.getSifraGrada());
            ps.setInt(2, adresa.getSifraAdrese());
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
    
    public static void azurirajAdresuBezNazivaGrada(Adresa adresa) throws SQLException {
        String query = "UPDATE ADRESA "
                + "SET "
                + "ulica = ?, "
                + "broj = ? "
                + "WHERE sifraGrada = ? AND sifraAdrese = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, adresa.getUlica());
            ps.setInt(2, adresa.getBroj());
            ps.setInt(3, adresa.getSifraGrada());
            ps.setInt(4, adresa.getSifraAdrese());
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
    
    public static void azurirajAdresuSaNazivomGrada(Adresa adresa) throws SQLException {
        String query = "UPDATE ADRESA "
                + "SET "
                + "ulica = ?, "
                + "broj = ?, "
                + "nazivGrada = ? "
                + "WHERE sifraGrada = ? AND sifraAdrese = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, adresa.getUlica());
            ps.setInt(2, adresa.getBroj());
            ps.setString(3, adresa.getNazivGrada());
            ps.setInt(4, adresa.getSifraGrada());
            ps.setInt(5, adresa.getSifraAdrese());
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
