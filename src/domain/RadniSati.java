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
public class RadniSati implements Serializable {
    private int standardniSati;
    private int prekovremeniSati;

    public RadniSati(int standardniSati, int prekovremeniSati) {
        this.standardniSati = standardniSati;
        this.prekovremeniSati = prekovremeniSati;
    }

    public RadniSati() {
    }

    public int getStandardniSati() {
        return standardniSati;
    }

    public void setStandardniSati(int standardniSati) {
        this.standardniSati = standardniSati;
    }

    public int getPrekovremeniSati() {
        return prekovremeniSati;
    }

    public void setPrekovremeniSati(int prekovremeniSati) {
        this.prekovremeniSati = prekovremeniSati;
    }
    
    
}
