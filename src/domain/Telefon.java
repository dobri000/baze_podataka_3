/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import enumeration.VrstaTelefona;
import java.io.Serializable;

/**
 *
 * @author dobri
 */
public class Telefon implements Serializable {
    private int sifraTelefona;
    private String brojTelefona;
    private VrstaTelefona vrstaTelefona;

    public Telefon() {
    }

    public Telefon(int sifraTelefona, String brojTelefona, VrstaTelefona vrstaTelefona) {
        this.sifraTelefona = sifraTelefona;
        this.brojTelefona = brojTelefona;
        this.vrstaTelefona = vrstaTelefona;
    }

    public int getSifraTelefona() {
        return sifraTelefona;
    }

    public void setSifraTelefona(int sifraTelefona) {
        this.sifraTelefona = sifraTelefona;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public VrstaTelefona getVrstaTelefona() {
        return vrstaTelefona;
    }

    public void setVrstaTelefona(VrstaTelefona vrstaTelefona) {
        this.vrstaTelefona = vrstaTelefona;
    }
    
    
}
