/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.RadniDan;
import java.sql.*;

/**
 *
 * @author dobri
 */
public class DBBRadniDan {
    
    public static boolean daLiPostojiRadniDan(RadniDan radniDan) throws SQLException {
        boolean postoji = false;
        String query = "SELECT * FROM RADNIDAN "
                + "WHERE sifraRadnogDnevnika = ? AND danUMesecu = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, radniDan.getSifraRadnogDnevnika());
            ps.setInt(2, radniDan.getDanUMesecu());
            ResultSet rs = ps.executeQuery();
            postoji = rs.next();

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
        return postoji;
    }
    
    public static void dodajRadniDan(RadniDan radniDan) throws SQLException {
        String query = "INSERT INTO RADNIDAN(sifraRadnogDnevnika, danUMesecu) "
                + "VALUES(?, ?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, radniDan.getSifraRadnogDnevnika());
            ps.setInt(2, radniDan.getDanUMesecu());
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
