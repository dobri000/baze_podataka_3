/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.RadniNalog;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class RadniNalogTableModel extends AbstractTableModel {

    private List<RadniNalog> radniNalozi;

    public RadniNalogTableModel(List<RadniNalog> radniNalozi) {
        this.radniNalozi = radniNalozi;
    }
    
    @Override
    public int getRowCount() {
        return radniNalozi.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RadniNalog nalog = radniNalozi.get(rowIndex);
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
                return nalog.getDatumOtvaranjaRN();
            case 5:
                return nalog.getDatumObavljanjaKontrole();
            case 6:
                return nalog.getBrPonude();
            case 7:
                return nalog.getSifraKontakta();
            case 8:
                return nalog.getSifraZaposlenog();
            case 9:
                return nalog.getSifraGrada();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"brojRadnogNalog", "rokZaRealizaciju", "opisSistema", "obavljenRad", "datumOtavaranjRN",
            "datumObavljanjaKontrole", "brPonude", "sifraKontakta", "sifraZaposlenog", "sifraGrada" };
        return titles[column];
    }
    
    public RadniNalog getRadniNalog(int row) {
        return radniNalozi.get(row);
    }
    
}
