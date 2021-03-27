package com.example.buah;

import java.util.List;

public class Buah {
    private String nama_buah;
    private String tipe_akar;
    private String bentuk_daun;
    private List <String> variasi;

    public Buah(String nama_buah, String tipe_akar, String bentuk_daun, List<String> variasi) {
        this.nama_buah = nama_buah;
        this.tipe_akar = tipe_akar;
        this.bentuk_daun = bentuk_daun;
        this.variasi = variasi;
    }

    public void setNama_buah(String nama_buah) {
        this.nama_buah = nama_buah;
    }
    public String getNama_buah() {
        return nama_buah;
    }

    public void setTipe_akar(String tipe_akar) {
        this.tipe_akar = tipe_akar;
    }
    public String getTipe_akar() {
        return tipe_akar;
    }

    public void setBentuk_daun(String bentuk_daun) {
        this.bentuk_daun = bentuk_daun;
    }
    public String getBentuk_daun() {
        return bentuk_daun;
    }

    public void setVariasi(List<String> variasi) {
        this.variasi = variasi;
    }
    public List<String> getVariasi() {
        return variasi;
    }
}
