/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Adresa;
import domain.Grad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dobri
 */
public class DBBGrad {

    public static void dodajGrad(Grad grad) throws SQLException {
        String query = "INSERT INTO GRAD(sifraGrada, nazivGrada, postanskiBroj) VALUES(?,?,?)";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, grad.getSifraGrada());
            ps.setString(2, grad.getNazivGrada());
            ps.setInt(3, grad.getPostanskiBroj());
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

    public static int nadjiGradPoImenu(String nazivGrada) throws SQLException {
        int sifraGrada = -1;
        String query = "SELECT sifraGrada FROM GRAD WHERE nazivGrada = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, nazivGrada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sifraGrada = rs.getInt("sifraGrada");
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
        return sifraGrada;
    }

    public static List<Grad> vratiSveGradove() throws SQLException {
        List<Grad> gradovi = new ArrayList<>();
        String query = "SELECT * FROM GRAD";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                int sifraGrada = rs.getInt("sifraGrada");
                String nazivGrada = rs.getString("nazivGrada");
                int postanskiBroj = rs.getInt("postanskiBroj");
                Grad grad = new Grad(sifraGrada, nazivGrada, postanskiBroj);
                gradovi.add(grad);
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
        return gradovi;
    }

    public static void azurirajGrad(Grad grad) throws SQLException {
        String query = "UPDATE GRAD "
                + "SET "
                + "nazivGrada = ?, "
                + "postanskiBroj = ? "
                + "WHERE sifraGrada = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setString(1, grad.getNazivGrada());
            ps.setInt(2, grad.getPostanskiBroj());
            ps.setInt(3, grad.getSifraGrada());
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

    public static void obrisiGrad(Grad grad) throws SQLException {
        String query = "DELETE FROM GRAD WHERE sifraGrada = ?";
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareCall(query);
            ps.setInt(1, grad.getSifraGrada());
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
