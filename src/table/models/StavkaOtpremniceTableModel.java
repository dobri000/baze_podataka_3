/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.StavkaOtpremnice;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class StavkaOtpremniceTableModel extends AbstractTableModel {

    private List<StavkaOtpremnice> stavke;

    public StavkaOtpremniceTableModel(List<StavkaOtpremnice> stavke) {
        this.stavke = stavke;
    }
    
    
    
    @Override
    public int getRowCount() {
        return stavke.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaOtpremnice stavka = stavke.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return stavka.getRbStavke();
            case 1:
                return stavka.getOznaka();
            case 2:
                return stavka.getKolicina();
            case 3:
                return stavka.getNazivJM();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"rbStavke", "oznaka", "kolicina", "nazivJM" };
        return titles[column];
    }
    
    public StavkaOtpremnice getStavkuOtpremnice(int row) {
        return stavke.get(row);
    }
    
    
    
}
