package gowez;

public class SepedaListrik {
    private int id;
    private String merek;
    private String status;

    public SepedaListrik(int id, String merek, String status) {
        this.id = id;
        this.merek = merek;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
