/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Ponuda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class PonudaTableModel extends AbstractTableModel {

    private List<Ponuda> ponude;

    public PonudaTableModel(List<Ponuda> ponude) {
        this.ponude = ponude;
    }
    
    
    
    @Override
    public int getRowCount() {
        return ponude.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ponuda ponuda = ponude.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ponuda.getBrPonude();
            case 1:
                return ponuda.getDatum();
            case 2:
                return ponuda.getVremeDezuranja();
            case 3:
                return ponuda.getZaposleni().getSifraZaposlenog();
            case 4:
                return ponuda.getSifraObjekta();
            case 5:
                return ponuda.getPIB();
            case 6:
                return ponuda.getZaposleni().getBrojLK();
            case 7:
                return ponuda.getZaposleni().getIme();
            case 8:
                return ponuda.getZaposleni().getPrezime();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = { "brPonude", "datum", "vremeDezuranja", "sifraZaposlenog", "sifraObjekta", "PIB", "Broj LK", "Ime", "Prezime" };
        return titles[column];
    }
    
    public Ponuda getPonuda(int row) {
        return ponude.get(row);
    }
    
}
