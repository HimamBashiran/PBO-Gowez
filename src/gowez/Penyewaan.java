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
    private int idPenyewaan;
    private User user;
    private SepedaListrik sepeda;
    private LocalDateTime tanggalMulai;
    private LocalDateTime tanggalSelesai;
    private double biaya;

    public Penyewaan(int idPenyewaan, User user, SepedaListrik sepeda, LocalDateTime tanggalMulai, LocalDateTime tanggalSelesai, double biaya) {
        this.idPenyewaan = idPenyewaan;
        this.user = user;
        this.sepeda = sepeda;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.biaya = biaya;
    }

    Penyewaan(int i, User user1, Sepeda sepeda, LocalDateTime mulai, LocalDateTime selesai, double biaya) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(int idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SepedaListrik getSepeda() {
        return sepeda;
    }

    public void setSepeda(SepedaListrik sepeda) {
        this.sepeda = sepeda;
    }

    public LocalDateTime getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(LocalDateTime tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public LocalDateTime getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(LocalDateTime tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
}