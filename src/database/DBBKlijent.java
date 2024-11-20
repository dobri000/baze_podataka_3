/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Klijent;
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
public class DBBKlijent {
    public static void dodajKlijenta(Klijent klijent) throws SQLException {
        String query = "INSERT INTO KLIJENT(PIB, nazivKompanije, sifraGrada, sifraAdrese) VALUES(?,?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, klijent.getPIB());
            ps.setString(2, klijent.getNazivKompanije());
            ps.setInt(3, klijent.getSifraGrada());
            ps.setInt(4, klijent.getSifraAdrese());
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
    
    public static List<Klijent> vratiSveKlijente() throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        String query = "SELECT * FROM KLIJENT";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                String PIB = rs.getString("PIB");
                String nazivKlijenta = rs.getString("nazivKompanije");
                int sifraGrada = rs.getInt("sifraGrada");
                int sifraAdrese = rs.getInt("sifraAdrese");
                Klijent klijent = new Klijent(PIB, nazivKlijenta, sifraGrada, sifraAdrese);
                klijenti.add(klijent);
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
        return klijenti;
    }
    
    public static void azurirajKlijenta(Klijent klijent) throws SQLException {
        String query = "UPDATE KLIJENT "
                + "SET "
                + "nazivKompanije = ?, "
                + "sifraGrada = ?, "
                + "sifraAdrese = ? "
                + "WHERE PIB = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, klijent.getNazivKompanije());
            ps.setInt(2, klijent.getSifraGrada());
            ps.setInt(3, klijent.getSifraAdrese());
            ps.setString(4, klijent.getPIB());
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
    
    public static void obrisiKlijenta(Klijent klijent) throws SQLException {
        String query = "DELETE FROM KLIJENT WHERE PIB = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, klijent.getPIB());
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
