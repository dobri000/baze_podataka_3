/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import domain.Objekat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobri
 */
public class DBBObjekat {
    public static void dodajObjekat(Objekat objekat) throws SQLException {
        String query = "INSERT INTO OBJEKAT(sifraObjekta, nazivObjekta, PIB, sifraGrada, sifraAdrese) VALUES(?,?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, objekat.getSifraObjekta());
            ps.setString(2, objekat.getNazivObjekta());
            ps.setString(3, objekat.getPIB());
            ps.setInt(4, objekat.getSifraGrada());
            ps.setInt(5, objekat.getSifraAdrese());
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
    
    public static List<Objekat> vratiSveObjekte() throws SQLException {
        List<Objekat> objekti = new ArrayList<>();
        String query = "SELECT * FROM OBJEKAT";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int sifraObjekta = rs.getInt("sifraObjekta");
                String nazivObjekta = rs.getString("nazivObjekta");
                String PIB = rs.getString("PIB");
                int sifraGrada = rs.getInt("sifraGrada");
                int sifraAdrese = rs.getInt("sifraAdrese");
                Objekat objekat = new Objekat(sifraObjekta, nazivObjekta, PIB, sifraGrada, sifraAdrese);
                objekti.add(objekat);
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
        return objekti;
    }
    
    public static void azurirajObjekat(Objekat objekat) throws SQLException {
        String query = "UPDATE OBJEKAT "
                + "SET "
                + "nazivObjekta = ?, "
                + "PIB = ?, "
                + "sifraGrada = ?, "
                + "sifraAdrese = ? "
                + "WHERE sifraObjekta = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, objekat.getNazivObjekta());
            ps.setString(2, objekat.getPIB());
            ps.setInt(3, objekat.getSifraGrada());
            ps.setInt(4, objekat.getSifraAdrese());
            ps.setInt(5, objekat.getSifraObjekta());
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
    
    public static void obrisiObjekat(Objekat objekat) throws SQLException {
        String query = "DELETE FROM OBJEKAT WHERE sifraObjekta = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, objekat.getSifraObjekta());
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
