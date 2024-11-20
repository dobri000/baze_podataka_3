/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Oprema;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dobri
 */
public class DBBOprema {
    
    public static void dodajOpremu(Oprema oprema) throws SQLException {
        String query = "INSERT INTO OPREMA(oznaka, opis) VALUES(?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, oprema.getOznaka());
            ps.setString(2, oprema.getOpis());
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
    
    public static List<Oprema> vratiSvuOpremu() throws SQLException {
        List<Oprema> opreme = new ArrayList<>();
        String query = "SELECT * FROM OPREMA";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int oznaka = rs.getInt("oznaka");
                String opis = rs.getString("opis");
                Oprema oprema = new Oprema(oznaka, opis);
                opreme.add(oprema);
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
        return opreme;
    }
    
    public static void azurirajOpremu(Oprema oprema) throws SQLException {
        String query = "UPDATE OPREMA "
                + "SET "
                + "opis = ? "
                + "WHERE oznaka = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, oprema.getOpis());
            ps.setInt(2, oprema.getOznaka());
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
    
    public static void obrisiOpremu(Oprema oprema) throws SQLException {
        String query = "DELETE FROM OPREMA "
                + "WHERE oznaka = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, oprema.getOznaka());
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
