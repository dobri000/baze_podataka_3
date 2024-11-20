/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Klijent;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class KlijentTableModel extends AbstractTableModel {
    
    private List<Klijent> klijenti;

    public KlijentTableModel(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }
    
    

    @Override
    public int getRowCount() {
        return klijenti.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Klijent klijent = klijenti.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return klijent.getPIB();
            case 1:
                return klijent.getNazivKompanije();
            case 2:
                return klijent.getSifraGrada();
            case 3:
                return klijent.getSifraAdrese();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = { "PIB", "nazivKompanije", "sifraGrada", "sifraAdrese" };
        return titles[column];
    }
    
    public Klijent getKlijent(int row) {
        return klijenti.get(row);
    }
    
}
