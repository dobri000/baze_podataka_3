/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Angazovanje;
import domain.RadniDan;
import domain.RadniDnevnik;
import domain.RadniSati;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dobri
 */
public class DBBAngazovanje {
    
    public static List<Angazovanje> vratiSvaAngazovanja(RadniDnevnik radniDnevnik) throws SQLException {
        List<Angazovanje> angazovanja = new ArrayList<>();
        String query = "SELECT a.danUMesecu, a.sifraObjekta, a.radniSati.get_standardni_sati(), a.radniSati.get_prekovremeni_sati() "
                + "FROM ANGAZOVANJE a WHERE sifraRadnogDnevnika = ? "
                + "ORDER BY a.danUMesecu";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, radniDnevnik.getSifraRadnogDnevnika());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int danUMesecu = rs.getInt(1);
                int sifraObjekta = rs.getInt(2);
                int standardniSati = rs.getInt(3);
                int prekovremeniSati = rs.getInt(4);
                RadniSati radniSati = new RadniSati(standardniSati, prekovremeniSati);
                Angazovanje angazovanje = new Angazovanje(danUMesecu, sifraObjekta, radniSati);
                angazovanja.add(angazovanje);
            }

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
        return angazovanja;
    }
    
    public static void dodajAngazovanje(Angazovanje angazovanje) throws SQLException {
        String query = "INSERT INTO ANGAZOVANJE(sifraRadnogDnevnika, danUMesecu, sifraObjekta, radniSati) "
                + "VALUES(?, ?, ?, radni_sati(?, ?))";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, angazovanje.getSifraRadnogDnevnika());
            ps.setInt(2, angazovanje.getDanUMesecu());
            ps.setInt(3, angazovanje.getSifraObjekta());
            ps.setInt(4, angazovanje.getRadniSati().getStandardniSati());
            ps.setInt(5, angazovanje.getRadniSati().getPrekovremeniSati());
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
    
    public static void azurirajAngazovanje(Angazovanje angazovanje, Angazovanje novoAngazovanje) throws SQLException {
        String query = "UPDATE ANGAZOVANJE "
                + "SET danUMesecu = ?, "
                + "sifraObjekta = ?, "
                + "radniSati = radni_sati(?, ?) "
                + "WHERE sifraRadnogDnevnika = ? AND danUMesecu = ? AND sifraObjekta = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, novoAngazovanje.getDanUMesecu());
            ps.setInt(2, novoAngazovanje.getSifraObjekta());
            ps.setInt(3, novoAngazovanje.getRadniSati().getStandardniSati());
            ps.setInt(4, novoAngazovanje.getRadniSati().getPrekovremeniSati());
            ps.setInt(5, angazovanje.getSifraRadnogDnevnika());
            ps.setInt(6, angazovanje.getDanUMesecu());
            ps.setInt(7, angazovanje.getSifraObjekta());
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
    
    public static void obrisiAngazovanje(Angazovanje angazovanje) throws SQLException {
        String query = "DELETE FROM ANGAZOVANJE "
                + "WHERE sifraRadnogDnevnika = ? AND danUMesecu = ? AND sifraObjekta = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, angazovanje.getSifraRadnogDnevnika());
            ps.setInt(2, angazovanje.getDanUMesecu());
            ps.setInt(3, angazovanje.getSifraObjekta());
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
