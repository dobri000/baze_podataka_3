/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.RadniNalogDetaljno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class RadniNalogDetaljnoTableModel extends AbstractTableModel {
    
    private List<RadniNalogDetaljno> radniNalozi;

    public RadniNalogDetaljnoTableModel(List<RadniNalogDetaljno> radniNalozi) {
        this.radniNalozi = radniNalozi;
    }
    
    @Override
    public int getRowCount() {
        return radniNalozi.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RadniNalogDetaljno nalog = radniNalozi.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return nalog.getBrojRadnogNaloga();
            case 1:
                return nalog.getRokZaRealizaciju();
            case 2:
                return nalog.getOpisSistema();
            case 3:
                return nalog.getObavljenRad();
            case 4:
                return nalog.getDatumObavljanjaKontrole();
            case 5:
                return nalog.getSifraKontakta();
            case 6:
                return nalog.getSifraGrada();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"brojRadnogNalog", "rokZaRealizaciju", "opisSistema", "obavljenRad",
            "datumObavljanjaKontrole", "sifraKontakta",  "sifraGrada" };
        return titles[column];
    }
    
    public RadniNalogDetaljno getRadniNalog(int row) {
        return radniNalozi.get(row);
    }
    
    
}
