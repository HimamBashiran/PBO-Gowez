/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gowez;

/**
 *
 * @author user
 */
public class Road extends Sepeda {
    private double maxKecepatan;
    private double jarakTempuhPerBaterai;

    public Road(int id, String merek, String status, double maxKecepatan, double jarakTempuhPerBaterai) {
        super(id, merek, status);
        this.maxKecepatan = maxKecepatan;
        this.jarakTempuhPerBaterai = jarakTempuhPerBaterai;
    }

    public double getMaxKecepatan() {
        return maxKecepatan;
    }

    public void setMaxKecepatan(double maxKecepatan) {
        this.maxKecepatan = maxKecepatan;
    }

    public double getJarakTempuhPerBaterai() {
        return jarakTempuhPerBaterai;
    }

    public void setJarakTempuhPerBaterai(double jarakTempuhPerBaterai) {
        this.jarakTempuhPerBaterai = jarakTempuhPerBaterai;
    }
}
