/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.models;

import domain.Grad;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dobri
 */
public class GradTableModel extends AbstractTableModel{
    private List<Grad> gradovi;

    public GradTableModel(List<Grad> gradovi) {
        this.gradovi = gradovi;
    }

    @Override
    public int getRowCount() {
        return gradovi.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Grad grad = gradovi.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return grad.getSifraGrada();
            case 1:
                return grad.getNazivGrada();
            case 2:
                return grad.getPostanskiBroj();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] titles = { "sifraGrada", "nazivGrada", "postanskiBroj" };
        return titles[column];
    }
    
    public Grad getGrad(int row) {
        return gradovi.get(row);
    }
    
}
