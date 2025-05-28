/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gowez;

/**
 *
 * @author User
 */
public class Sepeda {
    private int id;
    private String merek;
    private String status;

    public Sepeda(int id, String merek, String status) {
        this.id = id;
        this.merek = merek;
        this.status = status;
    }

    public int getId() { return id; }
    public String getMerek() { return merek; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

// Agar Road dan Cargo bisa digunakan sebagai Sepeda,
// pastikan Road dan Cargo extends Sepeda, bukan SepedaListrik
