/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Oprema;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class OpremaTableModel extends AbstractTableModel {

    private List<Oprema> opreme;

    public OpremaTableModel(List<Oprema> opreme) {
        this.opreme = opreme;
    }

    @Override
    public int getRowCount() {
        return opreme.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Oprema oprema = opreme.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return oprema.getOznaka();
            case 1:
                return oprema.getOpis();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"oznaka", "opis" };
        return titles[column];
    }
    
    
    
    public Oprema getOprema(int row) {
        return opreme.get(row);
    }

}
