/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gowez;

/**
 *
 * @author user
 */
import java.time.LocalDateTime;

public class Penyewaan {
    private int id;
    private User user;
    private Sepeda sepeda;
    private LocalDateTime tanggalMulai;
    private LocalDateTime tanggalSelesai;
    private double biaya;
    
    public Penyewaan(int id, User user, Sepeda sepeda, LocalDateTime tanggalMulai, LocalDateTime tanggalSelesai, double biaya) {
        this.id = id;
        this.user = user;
        this.sepeda = sepeda;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.biaya = biaya;
    }
    
    public int getId() { return id; }
    public User getUser() { return user; }
    public Sepeda getSepeda() { return sepeda; }
    public LocalDateTime getTanggalMulai() { return tanggalMulai; }
    public LocalDateTime getTanggalSelesai() { return tanggalSelesai; }
    public double getBiaya() { return biaya; }
    
    public void setId(int id) { this.id = id; }
    public void setUser(User user) { this.user = user; }
    public void setSepeda(Sepeda sepeda) { this.sepeda = sepeda; }
    public void setTanggalMulai(LocalDateTime tanggalMulai) { this.tanggalMulai = tanggalMulai; }
    public void setTanggalSelesai(LocalDateTime tanggalSelesai) { this.tanggalSelesai = tanggalSelesai; }
    public void setBiaya(double biaya) { this.biaya = biaya; }
}