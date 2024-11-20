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
public class Grad implements Serializable{
    
    private int sifraGrada;
    private String nazivGrada;
    private int postanskiBroj;

    public Grad() {
    }

    
    
    public Grad(int sifraGrada, String nazivGrada, int postanskiBroj) {
        this.sifraGrada = sifraGrada;
        this.nazivGrada = nazivGrada;
        this.postanskiBroj = postanskiBroj;
    }

    public int getSifraGrada() {
        return sifraGrada;
    }

    public void setSifraGrada(int sifraGrada) {
        this.sifraGrada = sifraGrada;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.sifraGrada;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grad other = (Grad) obj;
        return this.sifraGrada == other.sifraGrada;
    }
    
    
}
