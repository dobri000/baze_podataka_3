/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.RadniDnevnik;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class RadniDnevnikTableModel extends AbstractTableModel {
    
    List<RadniDnevnik> radniDnevnici;

    public RadniDnevnikTableModel(List<RadniDnevnik> radniDnevnici) {
        this.radniDnevnici = radniDnevnici;
    }

    @Override
    public int getRowCount() {
        return radniDnevnici.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RadniDnevnik radniDnevnik = radniDnevnici.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return radniDnevnik.getSifraRadnogDnevnika();
            case 1:
                return radniDnevnik.getSifraZaposlenog();
            case 2:
                return radniDnevnik.getSifraKontrolera();
            case 3:
                return radniDnevnik.getMesec();
            case 4:
                return radniDnevnik.getGodina();
            case 5:
                return radniDnevnik.getRadniSati().getStandardniSati();
            case 6:
                return radniDnevnik.getRadniSati().getPrekovremeniSati();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"sifraRadnogDnevnika", "sifraZaposlenog", "sifraKontrolera", "mesec", "godina", "standardniSati", "prekovremeniSati"};
        return titles[column];
    }
    
    public RadniDnevnik getRadniDnevnik(int row) {
        return radniDnevnici.get(row);
    }
    
}
