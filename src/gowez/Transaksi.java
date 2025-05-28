package gowez;

import java.time.LocalDateTime;

public class Transaksi {
    private final int id;
    private final Penyewaan penyewaan;
    private final LocalDateTime waktuTransaksi;
    private String status;

    public Transaksi(int id, Penyewaan penyewaan, LocalDateTime waktuTransaksi, String status) {
        this.id = id;
        this.penyewaan = penyewaan;
        this.waktuTransaksi = waktuTransaksi;
        this.status = status;
    }

    public int getId() { return id; }
    public Penyewaan getPenyewaan() { return penyewaan; }
    public LocalDateTime getWaktuTransaksi() { return waktuTransaksi; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
