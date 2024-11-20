/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.RadniNalogOsnovno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class RadniNalogOsnovnoTableModel extends AbstractTableModel {
    
    private List<RadniNalogOsnovno> radniNalozi;

    public RadniNalogOsnovnoTableModel(List<RadniNalogOsnovno> radniNalozi) {
        this.radniNalozi = radniNalozi;
    }
    
    @Override
    public int getRowCount() {
        return radniNalozi.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RadniNalogOsnovno nalog = radniNalozi.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return nalog.getBrojRadnogNaloga();
            case 1:
                return nalog.getDatumOtvaranjaRN();
            case 2:
                return nalog.getBrPonude();
            case 3:
                return nalog.getSifraZaposlenog();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"brojRadnogNalog", "datumOtavaranjRN", "brPonude", "sifraZaposlenog" };
        return titles[column];
    }
    
    public RadniNalogOsnovno getRadniNalog(int row) {
        return radniNalozi.get(row);
    }
    
    
}
