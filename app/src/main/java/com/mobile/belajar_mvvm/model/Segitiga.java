package com.mobile.belajar_mvvm.model;

public class Segitiga {
    private Double alas;
    private Double tinggi;
    private Double sisi1;
    private Double sisi2;
    private Double sisi3;
    private Double hasil;

    public Double getAlas() {
        return alas;
    }

    public void setAlas(Double alas) {
        this.alas = alas;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public Double getSisi1() {
        return sisi1;
    }

    public void setSisi1(Double sisi1) {
        this.sisi1 = sisi1;
    }

    public Double getSisi2() {
        return sisi2;
    }

    public void setSisi2(Double sisi2) {
        this.sisi2 = sisi2;
    }

    public Double getSisi3() {
        return sisi3;
    }

    public void setSisi3(Double sisi3) {
        this.sisi3 = sisi3;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    public Segitiga(Double alas, Double tinggi,Double hasil) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.hasil = hasil;
    }

    public Segitiga(Double sisi1, Double sisi2, Double sisi3, Double hasil) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.hasil = hasil;
    }
}
