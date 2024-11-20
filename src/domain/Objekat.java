/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author dobri
 */
public class Objekat implements Serializable {
    private int sifraObjekta;
    private String nazivObjekta;
    private String PIB;
    private int sifraGrada;
    private int sifraAdrese;

    public Objekat() {
    }

    public Objekat(int sifraObjekta, String nazivObjekta, String PIB, int sifraGrada, int sifraAdrese) {
        this.sifraObjekta = sifraObjekta;
        this.nazivObjekta = nazivObjekta;
        this.PIB = PIB;
        this.sifraGrada = sifraGrada;
        this.sifraAdrese = sifraAdrese;
    }

    public int getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(int sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public String getNazivObjekta() {
        return nazivObjekta;
    }

    public void setNazivObjekta(String nazivObjekta) {
        this.nazivObjekta = nazivObjekta;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
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
