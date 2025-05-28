/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gowez;

/**
 *
 * @author user
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input user
        try (Scanner scanner = new Scanner(System.in)) {
            // Input user
            System.out.print("Masukkan nama user: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan email user: ");
            String email = scanner.nextLine();
            User user1 = new User(1, nama, email);
            
            // Pilih sepeda
            Road roadBike = new Road(101, "Polygon", "tersedia", 45.0, 60.0);
            Cargo cargoBike = new Cargo(102, "United", "tersedia", 120.0, 40.0);
            
            System.out.println("Pilih sepeda: 1. Road (Polygon), 2. Cargo (United)");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            Sepeda sepeda = (pilihan == 1) ? roadBike : cargoBike;
            
            // Input tanggal mulai dan selesai
            System.out.print("Masukkan tanggal mulai (yyyy-MM-dd HH:mm): ");
            String mulaiStr = scanner.nextLine();
            System.out.print("Masukkan tanggal selesai (yyyy-MM-dd HH:mm): ");
            String selesaiStr = scanner.nextLine();
            LocalDateTime mulai = LocalDateTime.parse(mulaiStr.replace(" ", "T"));
            LocalDateTime selesai = LocalDateTime.parse(selesaiStr.replace(" ", "T"));
            
            // Hitung biaya sederhana
            double biaya = 30000.0;
            if (sepeda instanceof Cargo) biaya = 45000.0;
            
            Penyewaan sewa = new Penyewaan(1, user1, sepeda, mulai, selesai, biaya);
            
            // Transaksi
            Transaksi transaksi = new Transaksi(1, sewa, LocalDateTime.now(), "Sukses");
            Notifikasi notif = new Notifikasi("Transaksi berhasil untuk " + user1.getNama());
            notif.kirim();
            
            // Output ringkasan
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", new Locale("id", "ID"));
            System.out.println("\nRingkasan Penyewaan:");
            System.out.println("User: " + sewa.getUser().getNama());
            System.out.println("Sepeda: " + sewa.getSepeda().getMerek());
            System.out.println("Mulai: " + sewa.getTanggalMulai().format(formatter));
            System.out.println("Selesai: " + sewa.getTanggalSelesai().format(formatter));
            System.out.println("Biaya: Rp " + sewa.getBiaya());
            System.out.println("Status Transaksi: " + transaksi.getStatus());
            
            // Input rating & ulasan
            System.out.print("\nBeri rating (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Tulis ulasan: ");
            String ulasan = scanner.nextLine();
            RatingUlasan ratingUlasan = new RatingUlasan(rating, ulasan);
            
            System.out.println("Terima kasih atas ulasan Anda: " + ratingUlasan.getUlasan() + " (Rating: " + ratingUlasan.getRating() + ")");
        }
    }
}



