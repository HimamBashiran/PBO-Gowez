/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gowez;

/**
 *
 * @author user
 */
public class Cargo extends Sepeda {
    private double kapasitasMuatan;
    private double jarakTempuhPerBaterai;

    public Cargo(int id, String merek, String status, double kapasitasMuatan, double jarakTempuhPerBaterai) {
        super(id, merek, status);
        this.kapasitasMuatan = kapasitasMuatan;
        this.jarakTempuhPerBaterai = jarakTempuhPerBaterai;
    }

    public double getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(double kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public double getJarakTempuhPerBaterai() {
        return jarakTempuhPerBaterai;
    }

    public void setJarakTempuhPerBaterai(double jarakTempuhPerBaterai) {
        this.jarakTempuhPerBaterai = jarakTempuhPerBaterai;
    }
}

