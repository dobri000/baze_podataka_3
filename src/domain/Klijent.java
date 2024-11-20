/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author dobri
 */
public class Klijent implements Serializable{
    private String PIB;
    private String nazivKompanije;
    private int sifraGrada;
    private int sifraAdrese;

    public Klijent() {
    }

    public Klijent(String PIB, String nazivKompanije, int sifraGrada, int sifraAdrese) {
        this.PIB = PIB;
        this.nazivKompanije = nazivKompanije;
        this.sifraGrada = sifraGrada;
        this.sifraAdrese = sifraAdrese;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getNazivKompanije() {
        return nazivKompanije;
    }

    public void setNazivKompanije(String nazivKompanije) {
        this.nazivKompanije = nazivKompanije;
    }

    public int getSifraGrada() {
        return sifraGrada;
    }

    public void setSifraGrada(int sifraGrada) {
        this.sifraGrada = sifraGrada;
    }

    public int getSifraAdrese() {
        return sifraAdrese;
    }

    public void setSifraAdrese(int sifraAdrese) {
        this.sifraAdrese = sifraAdrese;
    }

    
    
    
}
