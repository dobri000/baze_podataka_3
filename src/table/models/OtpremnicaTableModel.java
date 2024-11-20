/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Otpremnica;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class OtpremnicaTableModel extends AbstractTableModel {

    private List<Otpremnica> otpremnice;

    public OtpremnicaTableModel(List<Otpremnica> otpremnice) {
        this.otpremnice = otpremnice;
    }
    
    
    
    @Override
    public int getRowCount() {
        return otpremnice.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Otpremnica otpremnica = otpremnice.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return otpremnica.getBrojOtpremnice();
            case 1:
                return otpremnica.getDate();
            case 2:
                return otpremnica.getSifraZaposlenog();
            case 3:
                return otpremnica.getSifraKontakta();
            case 4:
                return otpremnica.getSifraPrevoznika();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = {"brojOtpremnice", "datum", "sifraZaposlenog", "sifraKontakta", "sifraPrevoznika" };
        return titles[column];
    }
    
    public Otpremnica getOtpremnica(int row) {
        return otpremnice.get(row);
    }
    
    
}
