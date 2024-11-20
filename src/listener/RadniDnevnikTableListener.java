/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listener;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import forms.radniDnevnik.RadniDnevnikForma;
import javax.swing.ListSelectionModel;

/**
 *
 * @author dobri
 */
public class RadniDnevnikTableListener implements ListSelectionListener {

    private JTable table;

    public RadniDnevnikTableListener(JTable table) {
        this.table = table;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        RadniDnevnikForma forma = (RadniDnevnikForma) table.getParent().getParent().getParent().getParent().getParent().getParent();
        forma.setRadniDnevnik(table);
    }
    
}
