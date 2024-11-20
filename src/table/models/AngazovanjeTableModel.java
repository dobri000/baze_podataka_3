/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Angazovanje;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class AngazovanjeTableModel extends AbstractTableModel {

    private List<Angazovanje> angazovanja;

    public AngazovanjeTableModel(List<Angazovanje> angazovanja) {
        this.angazovanja = angazovanja;
    }
    
    
    
    @Override
    public int getRowCount() {
        return angazovanja.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Angazovanje angazovanje = angazovanja.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return angazovanje.getDanUMesecu();
            case 1:
                return angazovanje.getSifraObjekta();
            case 2:
                return angazovanje.getRadniSati().getStandardniSati();
            case 3:
                return angazovanje.getRadniSati().getPrekovremeniSati();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"radniDan", "sifraObjekta", "standardniSati", "prekovremeniSati" };
        return titles[column];
    }
    
    public Angazovanje getAngazovanje(int row) {
        return angazovanja.get(row);
    }
    
}
