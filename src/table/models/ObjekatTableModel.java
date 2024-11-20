/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Objekat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class ObjekatTableModel extends AbstractTableModel {

    private List<Objekat> objekti;

    public ObjekatTableModel(List<Objekat> objekti) {
        this.objekti = objekti;
    }

    @Override
    public int getRowCount() {
        return objekti.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Objekat objekat = objekti.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objekat.getSifraObjekta();
            case 1:
                return objekat.getNazivObjekta();
            case 2:
                return objekat.getPIB();
            case 3:
                return objekat.getSifraGrada();
            case 4:
                return objekat.getSifraAdrese();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = { "sifraObjekta", "nazivObjekta", "PIB", "sifraGrada", "sifraAdrese" };
        return titles[column];
    }
    
    public Objekat getObjekat(int row) {
        return objekti.get(row);
    }
    
    

}
