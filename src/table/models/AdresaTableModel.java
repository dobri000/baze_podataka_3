/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Adresa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class AdresaTableModel extends AbstractTableModel {
    
    private List<Adresa> adrese;

    public AdresaTableModel(List<Adresa> adrese) {
        this.adrese = adrese;
    }
    
    

    @Override
    public int getRowCount() {
        return adrese.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Adresa adresa = adrese.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return adresa.getSifraGrada();
            case 1:
                return adresa.getSifraAdrese();
            case 2:
                return adresa.getUlica();
            case 3:
                return adresa.getBroj();
            case 4:
                return adresa.getNazivGrada();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"sifraGrada", "sifraAdrese", "ulica", "broj", "nazivGrada" };
        return titles[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    
    
    public Adresa getAdresa(int row) {
        return adrese.get(row);
    }
    
    
}
