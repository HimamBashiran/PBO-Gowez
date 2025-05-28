package gowez;

public class Notifikasi {
    private String pesan;

    public Notifikasi(String pesan) {
        this.pesan = pesan;
    }

    public void kirim() {
        System.out.println("[NOTIFIKASI] " + pesan);
    }
}
